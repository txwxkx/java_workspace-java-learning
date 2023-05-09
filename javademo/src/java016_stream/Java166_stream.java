package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists()); //false
		System.out.println(file.isFile()); //false
		System.out.println(file.length()); //0
		
		FileWriter fw = null;
		
		//fw = new FileWriter(file);  //Unhandled exception type IOException 예외 처리
		
		try {
			 //mode의 값이 true이면 append
			 //mode의 값이 false이면 update
			 //mode의 기본값은 false이다.
			fw = new FileWriter(file, false);
			fw.write("java\n");  
			fw.flush();  //Buffer에 저장된 데이터를 sample.txt파일로 보내고 buffer을 비운다.
			fw.write("jsp\n"); 
			fw.flush();
			fw.write(new char[] {'s', 'p', 'r', 'i', 'n', 'g'});
			fw.write("\n");
			fw.flush();
			fw.write(97); //유니코드
			fw.write("\n");
			fw.flush();
			fw.write(new char[] {'s', 'p', 'r', 'i', 'n', 'g'}, 0, 3); //(char[], int offset, int len)
			fw.write("\n");
			fw.close(); //buffer => flush => close
			//fw.write("mybatis"); //java.io.IOException: Stream closed
			//fw.write("\n");
			//fw.flush();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end main()

}//end class
