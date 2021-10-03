package master;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MasterService {
	
	public void getLogin() {
		Parent root = null;
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("masterLogin.fxml"));
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MasterLoginController mls = loader.getController();
		mls.setRoot(root);
		stage.setScene(new Scene(root));
		stage.show();
	}
}
