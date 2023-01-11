package java024_jdbc;

import java.util.List;

public class DepartmentsController {

	public DepartmentsController() {

	}
	
	public List<DepartmentsDTO> departmentAllExcute() {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.listDepartments();
		
	}//end departmentAllExcute()
	
	public List<DepartmentsDTO> departmentSearchExcute(String data) {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.searchDepartments(data);
		
	}//end departmentSearchExcute()
	
}//end DepartmentsController
