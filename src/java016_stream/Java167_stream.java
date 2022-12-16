package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java167_stream {

	public static void main(String[] args) {
		
		File file = new File("sample.txt");
		FileReader fr = null;
		int data;
		
		try {
			fr = new FileReader(file);
//			for(long i = 0; i<file.length(); i++) {
//				System.out.println((char)fr.read());
//			}
			
			//read() : 파일 끝일 때 -1을 리턴한다.
			while((data=fr.read()) !=  -1) {
				System.out.print((char)data);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		//////////////////////////////////////////////////////////
		
		//Scanner sc = new Scanner(file); //Unhandled exception type FileNotFoundException 예외 처리
	
		Scanner sc = null;	
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine())
			System.out.println(sc.nextLine());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sc != null)
			sc.close();
		}
		
	}//end main()

}//end class
