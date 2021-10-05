package master;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MasterService {
	Parent root;  //마스터로그인하고 들어오면 있는 창과 연결됨
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void memmod() {
		Stage memmod = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("mod.fxml"));
		memmod.setScene(new Scene(root));
		memmod.show();
	}

}
