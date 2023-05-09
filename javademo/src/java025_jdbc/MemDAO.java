package java025_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemDAO {

	private MemDAO() {
	}

	private static MemDAO dao = new MemDAO();

	public static MemDAO getInstance() {
		return dao;
	}

	public List<MemDTO> getListMethod(Connection conn) {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();

			String sql = "SELECT * FROM mem ORDER BY num DESC";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs); // 닫음
			JdbcTemplate.close(stmt); // 닫음
			// JdbcTemplate.close(conn); //닫으면 안됨
		}

		return aList;
	}// end getListMethod()
	
	public int insertMethod(Connection conn, MemDTO dto) {
		PreparedStatement pstmt = null;
		int chk = 0;
		
		try {
			String sql = "INSERT INTO mem(num, name, age, loc) VALUES(mem_num_seq.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2,  dto.getAge());
			pstmt.setString(3, dto.getLoc());
			chk = pstmt.executeUpdate(); //insert, update, delete
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}//end insertMethod()
	
	public int updateMethod(Connection conn, HashMap<String, Object> map) {
		int chk = 0;
		PreparedStatement pstmt = null;
		
		try {
			conn.setAutoCommit(false);
			
			String sql = "UPDATE mem SET name = ? WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, map.get("name").toString());
			pstmt.setInt(2, Integer.parseInt(map.get("num").toString()));
			
			chk = pstmt.executeUpdate();
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}//end updateMethod()

}//end class










