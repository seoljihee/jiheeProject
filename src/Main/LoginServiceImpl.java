package Main;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginServiceImpl {
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void loginOk(){  
		TextField id = (TextField)root.lookup("#loginId");
		TextField pwd = (TextField)root.lookup("#loginPwd");
		
	}
}
