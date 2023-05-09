package java016_stream;

import java.io.File;

public class Java171_stream {

	public static void main(String[] args) {
		//File file = new File("src/java016_stream/temp");
		File file = new File("src/java016_stream/a/b");
		
		if(!file.isDirectory()) {
			//file.mkdir(); //temp 파일 한개
			file.mkdirs(); //a/b 파일 한개 이상
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 존재");
		}

	}//end main()

}//end class
