import java.io.*;
import java.util.*;
public class OnlyMusic{
	public static void main(String[] args) {
		String extension ="mp3";
		String rute="/home/jdiazrdgz/Documentos/Blessed By A Burden/Addiction";
		File dir = new File(rute);
		String[] files = dir.list();
		if (files == null){
  			System.out.println("Empty Dir");
		}else { 
  			for (int x=0;x<files.length;x++)
    			System.out.println(files[x]);
		}
		
		int noFiles = files.length;
		System.out.println("The dir have "+noFiles+" files");


		ArrayList<String> onlyMusicFiles=new ArrayList<String>();
		for (int i=0;i<files.length;i++) {
			String whats=getExtension(files[i]);
			System.out.println(whats);
			if (whats==extension) {
				onlyMusicFiles.add(files[i]);
			}
		}
		Iterator<String> iteratorOnlyMusicFiles = onlyMusicFiles.iterator();
		while(iteratorOnlyMusicFiles.hasNext()){
		String element = iteratorOnlyMusicFiles.next();
		System.out.println(element+" / ");
}
	}
	public static String getExtension(String filename) {
        int index = filename.lastIndexOf('.');
        String extension ="mp3";
        String extensionObtenida=filename.substring(index + 1);
        if ((String)extensionObtenida==extension){
            System.out.println("entre");
        }
        if (index == -1) {
              return "";
        } else {
              return filename.substring(index + 1);
        }
	}
}