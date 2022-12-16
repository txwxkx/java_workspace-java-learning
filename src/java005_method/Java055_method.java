package java005_method;

public class Java055_method {

	public static void main(String[] args) { //1
		int a = 4, b = 2, c = 5; //2
		int[] num = new int[] {2,3}; //3
		int[] data = new int[] {2,6,2,8}; //4
		
		System.out.println(process(a, b, c)); //5 //8
		System.out.println(plus(num)); //9 //14
		System.out.println(plus(data)); //15 //20
		 
	}//end main() //21
	
	public static int process(int x, int y, int z) { //6		
		return x + y + z; //7
	}//end process()
	
	public static int plus(int[] arr) { //10 //16
		int sum = 0; //11 //17
		for(int i = 0; i < arr.length; i++) { //12 //18
			sum += arr[i];
		}
		return sum; //13 //19
	}// end plus()

}//end class
