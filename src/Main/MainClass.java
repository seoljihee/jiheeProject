package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	@Override 
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
		Parent root = loader.load();
		Controller ctl = loader.getController();
		ctl.setRoot(root);
		arg0.setTitle("도서대여 프로그램");
		arg0.setScene(new Scene(root));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
