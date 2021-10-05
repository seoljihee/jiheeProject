package dbService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import DBCommon.dbCommon;
import DTO.bookDTO;

public class DBServiceImpl2 {  //Book에 관한 DB관련 코드들
	
	public bookDTO search(String title) {
		dbCommon.setDBConnection();
		bookDTO dto = null;
		String sql = "select * from BOOK where title=?";
		try {
			PreparedStatement ps = dbCommon.con.prepareStatement(sql);
			ps.setString(1, title);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto = new bookDTO();
				dto.setBookNum(rs.getString("bookNum"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				dto.setPublisher(rs.getString("publiser"));
				dto.setId(rs.getString("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
}
