package Main;

import java.net.URL;
import java.util.ResourceBundle;

import DBCommon.dbCommon;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class LoginController implements Initializable{
	Parent root;
	LoginServiceImpl lsi;
	
	public void setRoot(Parent root) {
		this.root = root;
		lsi.setRoot(root);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lsi = new LoginServiceImpl();
	}
	public void Book() {  //도서검색 및 대여 화면 연결
		
	}
	public void Myinfo() {  //나의 정보 화면 연결
		System.out.println("나의 정보 화면 연결");
	}
	public void ReturnBook() {  //나의정보 -> 도서반납
		System.out.println("도서반납");
	}
	public void Addinfo() {  //나의정보 -> 정보수정
		System.out.println("정보수정");
	}
	
	public void unregister() {  //나의정보 -> 회원탈퇴
		System.out.println("회원탈퇴");
	}
	
	public void logout() {   //나의정보 -> 로그아웃
		System.out.println("로그아웃");
	}
	
	public void Myborrow() {  //나의정보 -> 나의 대여도서
		
	}
	
	public void recommend() {  //도서추천 화면 연결
		System.out.println("도서추천");
		lsi.getRecommend();
	}
	
	public void BookSearch() {  //도서검색
		System.out.println("도서검색");
	}
	public void borrow() {   //대여버튼
		System.out.println("대여버튼 클릭");
	}
	public void Back() {    //도서검색 및 대여에 있는 뒤로가기 버튼
		System.out.println("뒤로가기");
		dbCommon.closeStage(root);
	}

}
