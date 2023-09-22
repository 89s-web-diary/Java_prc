package review;

import javax.swing.JOptionPane;

public class Coffee {

	public static void main(String[] args) {

		int n = 5;
		int prc = 5000;

		int tot = n * prc;
		
		String res = "";
		
		if (tot > 20000) {
			res = "할인해드릴게요";
		} else {
			res = "총 커피값을 내세요";
		}
		
		JOptionPane.showMessageDialog(null, res);
		
	}

}
