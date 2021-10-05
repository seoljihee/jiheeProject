package dbService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DBCommon.dbCommon;
import DTO.memberDTO;
import javafx.scene.control.TextField;
import oracle.jdbc.driver.DBConversion;
 
public class DBServiceImpl{   //member에 관한 DB관련 코드

	
	public memberDTO memDto(String id)  {  
		String sql = "select * from member where id='"+ id +"'";
		memberDTO dto = null;
		try {
			dbCommon.setDBConnection();
			PreparedStatement ps = dbCommon.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto = new memberDTO();
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddress(rs.getString("address"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}    
	
	public int memberShipDto(memberDTO dto) {
		String sql = "insert into member values(?,?,?,?,?)";
		int result = 0;
		dbCommon.setDBConnection();
		try {
			PreparedStatement ps = dbCommon.con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getPhone());
			ps.setString(5, dto.getAddress());
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
}
