package java009_inheritance.part08;

public class Java099_inheritance {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(10000);
		fe.setSpeed(100);
		fe.setColor("RED");
		fe.waterSpread();
		//System.out.println(fe.waterSpread()); 리턴값이 없어서 호출 못함
		System.out.println(fe.toString());

	}//end main()

}//end class
