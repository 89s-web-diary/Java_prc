package 생성자;

import javax.swing.JFrame;

public class 생성자예제 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("나도 제목");
		JFrame f2 = new JFrame("나는 제목이야");
		
		f.setVisible(true);
		f2.setVisible(true);
		
	}

}
