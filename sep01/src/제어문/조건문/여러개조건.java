package 제어문.조건문;

import javax.swing.JOptionPane;

public class 여러개조건 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("점수를 입력하세요");
		int jumsu = Integer.parseInt(input);
		
		String res = "";
		
		if (jumsu >= 90) {
			res = "A학점";
		}else if (jumsu >= 80) {
			res = "B학점";
		}else if (jumsu >= 70) {
			res = "C학점";
		}else if (jumsu >= 60) {
			res = "D학점";
		}else {
			res = "F학점";
		}
		System.out.println(res);
		
	}

}
