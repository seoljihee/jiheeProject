package master;

import java.net.URL;
import java.util.ResourceBundle;

import DBCommon.dbCommon;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class MasterController implements Initializable{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	public void masterLogin() {  //마스터 로그인 버튼
		System.out.println("마스터 로그인 버튼");
	}
	public void masterBack() {
		dbCommon.closeStage(root);
	}
	

}
