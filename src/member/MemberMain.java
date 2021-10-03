package member;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MemberMain {
		static Parent root1;  //아이디 비밀번호 찾기 root
		
	public void getMember() {
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("memberEvent.fxml"));
		Parent root = null;
		try {
			root = loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		MemberController mcl = loader.getController();
		mcl.setRoot(root);
		stage.setScene(new Scene(root));
		stage.show();
	}
	
	public void getfind() {
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("find.fxml"));
		try {
			root1 = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FindController fcl = loader.getController();
		fcl.setRoot(root1);
		stage.setScene(new Scene(root1));
		stage.show();
	}
}
