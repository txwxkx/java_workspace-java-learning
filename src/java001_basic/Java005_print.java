package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 2 ; // -128 ~ 127
        short sNum = 4; // -32,768 ~ 32,767
        int xNum = 5;
        long lNum = 6L;  // L or l
        float fNum = 2.5F; //F or f
        double dNum = 7.4;
        char cData = 'a';
        boolean eNum = true;  //true or false
        String sData = "java";
        
        System.out.println(bNum + "," + sNum);
        
        /*
         * System.out.printf("출력형식", 값1, 값2, 값3...);
         * 출력기호
         * %d : 정수(byte, short, int, long)
         * %f : 실수(float, double)
         * %b : 논리(boolean)
         * %c : 문자(char)
         * %s : 문자열(String)
         * %% : %
         * \n : 줄바꿈
         * \t : 탭
         * 
         */
        
        System.out.printf("%d %d %d %d\n", bNum, sNum, xNum, lNum);
        System.out.printf("%.1f %.1f %c %b %s\n", fNum, dNum, cData, eNum, sData);
        System.out.printf("%d %% %d = %d\n" , 5, 2, 5%2);   // 5 % 2 = 1      
        
        System.out.print("java\t");
        System.out.print("program");
        System.out.println();
        System.out.println("jsp");

	}//end main()

}//end class
