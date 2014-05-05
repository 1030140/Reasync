import java.io.*;
import java.util.*;
public class OnlyMusic{
    public static String ext="mp3";
	public static void main(String[] args) {
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
			
			//if (whats==ext) {
                        if (whats.equals(ext)) {
                        	
                            System.out.println("is mp3");
				onlyMusicFiles.add(files[i]);
			}else{
                            System.out.println("isnt mp3");
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
        String extensionObtenida =filename.substring(index + 1);
        System.out.println("Soy obtenida"+extensionObtenida);
        if (index == -1) {
              return "";
        } else {
            if (extensionObtenida==ext){
                  System.out.println("entreaget");
            }
              return filename.substring(index + 1);
              
        }
	}
}
