package member;

import java.net.URL;
import java.util.ResourceBundle;

import DBCommon.dbCommon;
import DTO.memberDTO;
import dbService.DBServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class MemberController implements Initializable{
	Parent root;
	DBServiceImpl db;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new DBServiceImpl();
	}
	public void memberShip() {  //회원가입
		int result = 0;
		
			TextField id = (TextField)root.lookup("#signId");
			TextField pw1 = (TextField)root.lookup("#signPwd1");
			TextField pw2 = (TextField)root.lookup("#signPwd2");
			TextField name = (TextField)root.lookup("#signName");
			TextField phone = (TextField)root.lookup("#signPhone");
			TextField address = (TextField)root.lookup("#signAddress");
			
			if(id.getText() != null && pw1.getText() != null && pw2.getText() != null && name.getText() != null && phone.getText() != null && address.getText() != null) {
				if(pw1.getText().equals(pw2.getText())) {  //비밀번호 두개가 서로 같다면 회원가입을 진행
					memberDTO dto = new memberDTO();
					dto.setId(id.getText());
					dto.setPwd(pw1.getText());
					dto.setName(name.getText());
					dto.setPhone(phone.getText());
					dto.setAddress(address.getText());
					
					result = db.memberShipDto(dto);
					if(result == 1) {
						dbCommon.getAlert("회원가입에 성공하였습니다.");
						dbCommon.closeStage(root);
					}else {
						dbCommon.getAlert("회원가입에 오류가 생겼습니다.\n다시 회원가입 진행해주세요.");
						
					}
				
				}else {
					dbCommon.getAlert("회원가입시 비밀번호와 비밀번호확인이 일치해야 합니다.\n다시 입력해주세요.");
					pw1.requestFocus();
					pw1.clear();  //비밀번호가 일치하지 않으면 입력한 text를 지워준다.
					pw2.clear();
					
				}
			}else {
				dbCommon.getAlert("빈칸을 채워주세요.");
				
			}
			
	}
	public void memberBack() {  //회원가입 -> 뒤로가기버튼
		dbCommon.closeStage(root);
	}

}
