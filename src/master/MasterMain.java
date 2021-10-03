package master;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MasterMain {
	public void getMaster() {
		Parent root = null;
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("master.fxml"));
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MasterController mcl = loader.getController();
		mcl.setRoot(root);
		stage.setScene(new Scene(root));
		stage.show();
		
	}
}
