package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("이름을 입력하시오");
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "입니다");

		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		JOptionPane.showMessageDialog(null, name + "님의 취미는 " + hobby + "입니다");

		String time = JOptionPane.showInputDialog("당신의 몇시에 일어나나요?");
		JOptionPane.showMessageDialog(null, hobby + "는 " + time + "시에 시작할 수 있군요!");

		// 문자열을 숫자로 변경해주는 작업은 굉장히 자주 이용.
		// 정수.분석해서 정수로 바꿔줘(스트링);

		int inTime = Integer.parseInt(time);
		int result = inTime + 1;

		System.out.println(hobby + "는 " + result + "에 시작하자");
	}

}
