public class OnlyMusic{
	public static void main(String[] args) {
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
		String [] onlyMusicFiles;

		public static String getExtension(String filename) {
	        int index = filename.lastIndexOf('.');
	        if (index == -1) {
	              return "";
	        } else {
	              return filename.substring(index + 1);
	        }
		}
	}
}