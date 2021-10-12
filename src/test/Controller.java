package test;

import java.net.URL;
import java.util.Dictionary;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	Parent root;
	ServiceImpl si;
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		si = new ServiceImpl();
		
	}
	public void Search() {
		Label label = (Label)root.lookup("#label");
		TextField text = (TextField)root.lookup("#key");
		String value = (String)si.get(text.getText());
		label.setText(value);
	}
}
