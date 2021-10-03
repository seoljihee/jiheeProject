package Main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable{
	Parent root;
	LoginServiceImpl ls;  
	public void setRoot(Parent root) {
		this.root = root;  //Main에 있는 root값 전달받기위한 setter메소드.
		ls.setRoot(root);  //LoginServiceImpl에 root값 전달하기.
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();  
	}
	
	public void login() {  //login버튼.
		System.out.println("로그인 버튼");
		ls.loginOk();
	}
	
	public void memberShip() {  //회원가입버튼.
		System.out.println("회원가입 버튼");
	}
	public void search() { // 아이디/비밀번호 찾기 버튼.
		System.out.println("찾기버튼");
	}

}
