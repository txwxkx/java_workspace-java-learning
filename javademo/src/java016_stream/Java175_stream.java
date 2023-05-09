package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		
	//src/java016_stream/a/b 디렉토리에 아무 파일 2개를 넣어 놓는다.
	File file = new File ("src/java016_stream/a");
	deleteFileList(file);
	
	}//end main()
	
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		
		System.out.println(fileAll.length);
		if(fileAll.length != 0) {
			for(File file : fileAll) {
				System.out.println(file);
				if(file.isFile())
					file.delete();
				else
					deleteFileList(file);
			}
		}
	
		System.out.println("Remove File :" + srcFile.getPath());
		srcFile.delete();
		
		
	}//end deleteFileList()

}//end class
