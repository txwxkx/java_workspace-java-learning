package java024_jdbc;

import java.util.List;
import java.util.Scanner;

/*
 * MVC 패턴
 * Model : 데이터 관리
 * View : 결과 화면
 * Controller : 클라이언트 요청과 응답 처리, Model과 View 연결
 */

public class Java223_jdbc {

	public static void main(String[] args) {
		DepartmentsController dController = new DepartmentsController();
		Scanner sc = new Scanner(System.in);
		System.out.printf("1 전체, 2 검색어");
		int input = Integer.parseInt(sc.nextLine());
		if(input == 1) {
			List<DepartmentsDTO> aList = dController.departmentAllExcute();
			display(aList);
		} else if(input == 2 ) {
			System.out.print("부서입력: ");
			String line = sc.nextLine();
			List<DepartmentsDTO> aList = dController.departmentSearchExcute(line);
			display(aList);
		}
	}//end main()
	
	private static void display(List<DepartmentsDTO> aList) {
		for(DepartmentsDTO dto : aList)
			System.out.printf("%d %s %d %d\n",
					dto.getDepartment_id(), dto.getDepartment_name(),
					dto.getManager_id(), dto.getLocation_id());
	 
	}//display()

}//end class
