package java016_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Java168_stream {

	public static void main(String[] args) {
		FileReader fr = null;
		
		BufferedReader br = null;
		
		//라인번호를 출력할 수 있는 메소드를 제공하는 스트림이다.
		LineNumberReader nr = null;
		
		try {
			//File file = new File("src/java016_stream/score.txt");
			//fr = new FileReader(file);
			
			fr = new FileReader("src/java016_stream/score.txt");
			//br = new BufferedReader(fr);
			
			nr = new LineNumberReader(fr);
						
//			int cnt = 1;
			String line = "";
			
//			while((line = br.readLine()) != null) {
//				System.out.printf("%d: %s\n",cnt++, line);
//			}
			
			while((line = nr.readLine()) != null) {
				System.out.printf("%d: %s\n", nr.getLineNumber(), line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//end main()

}//end class
