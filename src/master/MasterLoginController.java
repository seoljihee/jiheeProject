package master;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import DBCommon.dbCommon;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MasterLoginController implements Initializable{
	MasterService masterS;
	Parent root;
	static Parent root1;
	public void setRoot(Parent root) {
		this.root = root;
		masterS.setRoot(root1);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		masterS = new MasterService();
	}
	
	public void getMasterLogin() {
				Stage stage = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("masterLogin.fxml"));
				try {
					root1 = loader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}
				MasterLoginController mlcl = loader.getController();
				mlcl.setRoot(root1);
				stage.setTitle("관리자");
				stage.setScene(new Scene(root1));
				stage.show();
				dbCommon.getAlert("관리자 계정에 로그인 하셨습니다.");
			}
		
	
	
	public void memsearch() {  //회원관리 -> 검색버튼
		
	}
	public void memmod() {     //회원관리 -> 회원수정버튼
		masterS.memmod();
	}
	public void memdel() {		//회원관리 -> 회원삭제버튼
		
	}
	
	public void memadd() {		//회원관리 -> 회원추가버튼
		
	}
	public void memback() {		//회원관리 -> 뒤로가기버튼
		dbCommon.closeStage(root1);
	}

}
