package java016_stream;

import java.io.File;

public class Java174_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("test.txt 파일 삭제");
		}
		
		System.out.println("program end");

	}//end main()

}//end class
