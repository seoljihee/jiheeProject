package Main;

import java.io.IOException;

import DBCommon.dbCommon;
import DTO.bookDTO;
import DTO.memberDTO;
import dbService.DBServiceImpl;
import dbService.DBServiceImpl2;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class LoginServiceImpl {
	Parent root;
	DBServiceImpl db;
	DBServiceImpl2 db2;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void loginOk(){    //메인화면 로그인 버튼클릭시 호출됨.
		TextField id = (TextField)root.lookup("#loginId");
		PasswordField pw = (PasswordField)root.lookup("#loginPwd");
		
		db = new DBServiceImpl();
		memberDTO dto = db.memDto(id.getText());
		if(dto != null) {  //dto가 null값이 아니라면 비밀번호까지 비교하기
			if(pw.getText().equals(dto.getPwd())) {
				Stage s1 = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
				Parent root1 = null;
				try {
					root1 = loader.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				LoginController lcl = loader.getController();
				lcl.setRoot(root1);
				s1.setScene(new Scene(root1));
				s1.show();
				
				dbCommon.getAlert(id.getText() + " 님 환영합니다!");
				
				
			}else {
				//비밀번호가 틀리다면 Alert창을 띄운다.
				dbCommon.getAlert("비밀번호가 틀렸습니다.");
				pw.requestFocus();
				pw.clear();
			}
		}else {
			dbCommon.getAlert("존재하지 않는 아이디 입니다.\n회원가입을 진행해 주세요.");
			id.requestFocus();
			id.clear();
		}
	}
	
	public void bookSearch() {
		TextField bookName = (TextField)root.lookup("#BookNameSearch");
		bookDTO dto = db2.search(bookName.getText());
		if(dto.getTitle().equals(bookName.getText())) {
			TableView tableView = new TableView();
			
			
		}
	}
	
	
	public void getRecommend() {
		Label reTitle01 = (Label)root.lookup("#title01");
		Label reAuthor01 = (Label)root.lookup("#author01");
		Label rePublisher01 = (Label)root.lookup("#publisher01");
		
		Label reTitle02 = (Label)root.lookup("#title02");
		Label reAuthor02 = (Label)root.lookup("#author02");
		Label rePublisher02 = (Label)root.lookup("#publisher02");
		
		Label reTitle03 = (Label)root.lookup("#title03");
		Label reAuthor03 = (Label)root.lookup("#author03");
		Label rePublisher03 = (Label)root.lookup("#publisher03");
		
		
		reTitle01.setText("안녕");
		reAuthor01.setText("나는");
		rePublisher01.setText("설지희");
		
		reTitle02.setText("안녕");
		reAuthor02.setText("나는");
		rePublisher02.setText("설지희");
		
		reTitle03.setText("안녕");
		reAuthor03.setText("나는");
		rePublisher03.setText("설지희");
	}
	
	
	
	
	
	
	
	
}
