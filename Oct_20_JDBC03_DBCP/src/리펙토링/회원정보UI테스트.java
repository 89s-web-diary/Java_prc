package 리펙토링;

import javax.swing.JOptionPane;

public class 회원정보UI테스트 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		// shop db의 member테이블에 Insert하고 싶음
		MemberDAO dao = new MemberDAO();
		
		// dao에 전달할 데이터를 가방을 만들어서 다 넣은 다음 가방 하나만 전달!
		// 가방 생성
		MemberVO bag = new MemberVO();
		
		// 가방에 필요한 데이터를 넣어줌
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		//가방 전달
//		dao.insert(id, pw, name, tel);	// bag 사용하기 전 하나씩 넣어줌
		dao.insert(bag);

	
	}

}
