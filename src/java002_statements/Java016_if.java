package java002_statements;
/*
 * 제어문(control statement) : 문장의 흐름을 제어해 주는 기능이다.
 * 1. 종류
 * 	  조건문 : if~else, switch~case
 * 	  반복문 : for, do~while
 *    기타 : break, continue, label(임의 이름)
 *    
 *    if(조건식){
 *    	조건식이 참일 때 수행 문장;
 *    }else{
 *    	조건식이 거짓일 때 수행 문장;
 *    }
 */
public class Java016_if {

	public static void main(String[] args) {
		int num = 4;
		if(num % 2 == 0) {
		System.out.printf("%d는 짝수입니다.\n", num);
		} else {
		System.out.printf("%d는 홀수입니다.\n", num);
		}
	}
}
