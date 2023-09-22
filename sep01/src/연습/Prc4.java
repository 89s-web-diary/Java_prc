package 연습;

import javax.swing.JOptionPane;

public class Prc4 {

	public static void main(String[] args) {

		String tod = JOptionPane.showInputDialog("오늘은 무슨 요일?");
		String what = JOptionPane.showInputDialog("수업 후 뭐함?");

		String res = "오늘 " + tod + "에 수업 후 나는 " + what + "할 예정";

		System.out.println(res);

	}

}
