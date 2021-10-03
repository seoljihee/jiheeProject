package DBCommon;

import java.sql.Connection;
import java.sql.DriverManager;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class dbCommon {
	static Parent root;
	public static Connection con;
	public static void setDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@210.221.253.215:1521:xe","g3","1234");
			System.out.println("연결 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStage(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
	
	
}
