import java.io.*;
public class HowManyFiles{
	public static void main(String[] args) throws IOException{
		String rute="C:/Users/Julio/Downloads";
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
	}
}
