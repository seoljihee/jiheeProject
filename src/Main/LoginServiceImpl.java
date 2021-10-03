package Main;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl {
	Parent root;
	static Parent root1 = null;
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void loginOk(){  
		TextField id = (TextField)root.lookup("#loginId");
		TextField pwd = (TextField)root.lookup("#loginPwd");
		
		Stage stage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
		try {
			root1 = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		LoginController lcl = loader.getController();
		lcl.setRoot(root1);
		stage.setScene(new Scene(root1));
		stage.show();
		
	}
}
