package master;

import java.net.URL;
import java.util.ResourceBundle;

import DBCommon.dbCommon;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MasterController implements Initializable{
	Parent root;
	MasterLoginController mlcl;
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mlcl = new MasterLoginController();
	}
	public void masterLogin() {  //마스터 로그인 버튼
		TextField masterId = (TextField)root.lookup("#masterId");
		PasswordField masterPw = (PasswordField)root.lookup("#masterPwd");
		
		if(masterId.getText().equals("0000")) {
			if(masterPw.getText().equals("0000")) {
				mlcl.getMasterLogin();
				dbCommon.closeStage(root);
			}
		}
	}
	public void masterBack() {
		dbCommon.closeStage(root);
	}
	

}
