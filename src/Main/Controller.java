package Main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import master.MasterMain;
import member.MemberMain;

public class Controller implements Initializable{
	Parent root;
	LoginServiceImpl ls;
	MemberMain mm;
	MasterMain master;
	public void setRoot(Parent root) {
		this.root = root;  //Main에 있는 root값 전달받기위한 setter메소드.
		ls.setRoot(root);  //LoginServiceImpl에 root값 전달하기.
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("연결되었습니다.");
		ls = new LoginServiceImpl();  
		mm = new MemberMain();
		master = new MasterMain();
	}
	
	public void login() {  //login버튼.
		ls.loginOk();
	}
	
	public void memberShip() {  //회원가입버튼.
		mm.getMember();
	}
	public void search() { // 아이디/비밀번호 찾기 버튼.
		mm.getfind();
	}
	
	public void master() {  //마스터 로그인으로 이동하기.
		master.getMaster();
	}
	

}
