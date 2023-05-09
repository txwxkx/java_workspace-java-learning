package java007_class.part03;

public class Java076_class {

	public static void main(String[] args) {
		int[] left = {10, 3, 5};
		int[] right = {3, 2, 4};
		char[] ope = {'+', '%', '*'}; // + - * /
		
		Calc[] nfo = new Calc[3];
		
		for(int i = 0; i < nfo.length; i++) {
			if(checkOperator(ope[i])) {
				continue; //continue : for문에서 i++로 간다.
				          //break : for문을 나가버린다.
				
			}
			
			nfo[i] = new Calc(left[i], right[i], ope[i]);
		}

		display(nfo);
	}//end main()
	
	private static boolean checkOperator(char ope) {
		if(!(ope=='+' || ope=='-' || ope=='*' || ope=='/')) {
			System.out.println("+, -, *, / 연산자만 가능합니다.");
			return true;
		}
		
		return false;
	}//end checkOperator()
	
	public static void display(Calc[] nfo) {
		for(int i = 0; i < nfo.length; i++) {
			if(nfo[i]!=null) {
				System.out.println(nfo[i].toString());
			}
		}
		
	}//end display()

}//end class
