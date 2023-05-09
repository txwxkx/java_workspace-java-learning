package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader; //ctrl + space로 임포트
import java.io.IOException;

public class Java158_exception {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		
		FileReader fr = null; //ctrl + space로 임포트
		
		// FileNotFoundException은 checked exception이다.
		// 반드시 try~catch~finally(예외처리)를 한다.
		try {
			fr = new FileReader(file); //new FileReader("sample.txt")
			System.out.println(fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//surround try catch로 호출, clause to catch
		
		

	}//end main()

}//end class
