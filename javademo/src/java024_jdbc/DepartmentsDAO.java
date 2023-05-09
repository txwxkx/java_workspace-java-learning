package java024_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





//DAO : Data Access Object(데이터 접근 객체)
public class DepartmentsDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private DepartmentsDAO() {
		
	}
	
	private static DepartmentsDAO dao = new DepartmentsDAO();
	
	public static DepartmentsDAO getInstance() {
		return dao;		
	}
	
	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}
	
	private void exit() throws SQLException {
		if(rs != null)
			rs.close();
		
		if(stmt != null)
			stmt.close();
		
		if(pstmt != null)
			pstmt.close();
		
		if(conn != null)
			conn.close();
	}
	
	public List<DepartmentsDTO> listDepartments() {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		try {
			conn = init();
			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO(); //반드시 while문 안에 위치.
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return aList;
	}//end listDepartments()
	
	public List<DepartmentsDTO> searchDepartments(String data) {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		
		try {
			conn = init();
			
			//stmt = conn.createStatement();
			//String sql = "SELECT * FROM departments WHERE upper(department_name) LIKE upper('%" + data+ "%') ORDER BY department_id";	
			//rs = stmt.executeQuery(sql);
			                                                                         //place holder
			String sql = "SELECT * FROM departments WHERE upper(department_name) LIKE upper(?) ORDER BY department_id";	
			pstmt = conn.prepareStatement(sql);
			//왼쪽에서 오른쪽 순서대로 인덱스 값
			pstmt.setString(1, "%" +data+ "%");
			//sql값이 들어가는 위치 다름
			rs = pstmt.executeQuery();
						
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO(); //반드시 while문 안에 위치.
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return aList;
	}//endsearchDepartments
	
}//end class()
