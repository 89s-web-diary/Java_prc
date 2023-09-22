package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = JOptionPane.showInputDialog("통신사는?");
		String b = JOptionPane.showInputDialog("전화번호는?");
		String c = JOptionPane.showInputDialog("가입자 이름은?");

		String res = c + "님은 " + a + "에 " + b;
		
		JOptionPane.showMessageDialog(null, res);
	
	}

}
