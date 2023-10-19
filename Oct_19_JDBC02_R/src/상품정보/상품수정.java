package 상품정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 상품수정 {

	public void one(String id) {
		
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b0 = new JButton();
		b0.setText("이름 수정");
		b0.setBackground(Color.magenta);
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductDAO dao = new ProductDAO();
				String nn = JOptionPane.showInputDialog("수정할 내용 입력");
				if(dao.update(id, nn, 1) == 1) JOptionPane.showMessageDialog(f, "이름 수정 완료");
			}
		});
		JButton b1 = new JButton();
		b1.setText("내용 수정");
		b1.setBackground(Color.orange);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductDAO dao = new ProductDAO();
				String nn = JOptionPane.showInputDialog("수정할 내용 입력");
				if(dao.update(id, nn, 2) == 1) JOptionPane.showMessageDialog(f, "내용 수정 완료");
			}
		});
		JButton b2 = new JButton();
		b2.setText("가격 수정");
		b2.setBackground(Color.yellow);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductDAO dao = new ProductDAO();
				String nn = JOptionPane.showInputDialog("수정할 내용 입력");
				if(dao.update(id, nn, 3) == 1) JOptionPane.showMessageDialog(f, "가격 수정 완료");
			}
		});
		JButton b3 = new JButton();
		b3.setText("회사 수정");
		b3.setBackground(Color.pink);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductDAO dao = new ProductDAO();
				String nn = JOptionPane.showInputDialog("수정할 내용 입력");
				if(dao.update(id, nn, 4) == 1) JOptionPane.showMessageDialog(f, "회사 수정 완료");
			}
		});
		JButton b4 = new JButton();
		b4.setText("사진 수정");
		b4.setBackground(Color.cyan);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductDAO dao = new ProductDAO();
				String nn = JOptionPane.showInputDialog("수정할 내용 입력");
				if(dao.update(id, nn, 5) == 1) JOptionPane.showMessageDialog(f, "사진 수정 완료");
			}
		});
		
		Font f1 = new Font("돋움체", Font.BOLD, 30);
		b0.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
