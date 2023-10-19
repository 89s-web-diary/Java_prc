package 상품정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 상품정보UI {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(400, 600);
		f.getContentPane().setBackground(Color.green);
		
		JLabel top = new JLabel();
		top.setText("제품 정보");
		JLabel l1 = new JLabel();
		l1.setText("---------------------------------------");
		JLabel id = new JLabel();
		id.setText("제품 ID");
		JLabel name = new JLabel();
		name.setText("제품 이름");
		JLabel cont = new JLabel();
		cont.setText("제품 설명");
		JLabel price = new JLabel();
		price.setText("제품 가격");
		JLabel comp = new JLabel();
		comp.setText("제조 회사");
		JLabel img = new JLabel();
		img.setText("제품 사진");
		
		JTextField idt = new JTextField(10);
		JTextField namet = new JTextField(10);
		JTextField contt = new JTextField(10);
		JTextField pricet = new JTextField(10);
		JTextField compt = new JTextField(10);
		JTextField imgt = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("제품 추가");
		b1.setBackground(Color.cyan);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDAO dao = new ProductDAO();
				ProductVO bag = new ProductVO();
				String ids = idt.getText();
				String names = namet.getText();
				String conts = contt.getText();
				String prices = pricet.getText();
				String comps = compt.getText();
				String imgs = imgt.getText();
				bag.setId(ids);
				bag.setName(names);
				bag.setCont(conts);
				bag.setPrice(Integer.parseInt(prices));
				bag.setComp(comps);
				bag.setImg(imgs);
				dao.insert(bag);
				JOptionPane.showMessageDialog(f, "입력 완료");
			}
		});
		
		JButton b2 = new JButton();
		b2.setText("제품 검색");
		b2.setBackground(Color.yellow);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDAO dao = new ProductDAO();
				String ids = idt.getText();
				if(ids.equals("")) {
					JOptionPane.showMessageDialog(f, "ID를 입력해주세요");
				} else if(dao.res(ids) == false){
					JOptionPane.showMessageDialog(f, "해당되는 상품이 없습니다");
				} else {
					ProductVO bag = dao.select(ids);
					namet.setText(bag.getName());
					contt.setText(bag.getCont());
					pricet.setText(String.valueOf(bag.getPrice()));
					compt.setText(bag.getComp());
					imgt.setText(bag.getImg());
				}
			}
		});
		
		JButton b3 = new JButton();
		b3.setText("제품 수정");
		b3.setBackground(Color.pink);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDAO dao = new ProductDAO();
				String ids = JOptionPane.showInputDialog("수정할 상품의 ID 입력");
				System.out.println(dao.res(ids));
				if(ids.equals("")) {
					JOptionPane.showMessageDialog(f, "ID를 입력해주세요");
				} else if(dao.res(ids) == false){
					JOptionPane.showMessageDialog(f, "해당되는 상품이 없습니다");
				} else {
					상품수정 수정 = new 상품수정();
					수정.one(ids);
				}
			}
		});
		
		JButton b4 = new JButton();
		b4.setText("제품 삭제");
		b4.setBackground(Color.red);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDAO dao = new ProductDAO();
				String ids = idt.getText();
				if(ids.equals("")) {
					JOptionPane.showMessageDialog(f, "ID를 입력해주세요");
				} else if(dao.delete(ids)!=1){
					JOptionPane.showMessageDialog(f, "해당되는 상품이 없습니다");
				} else {
					dao.delete(ids);
					JOptionPane.showMessageDialog(f, "삭제 완료");
				}
			}
		});
		
		JButton clr = new JButton();
		clr.setText("CLEAR");
		clr.setBackground(Color.white);
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idt.setText("");
				namet.setText("");
				contt.setText("");
				pricet.setText("");
				compt.setText("");
				imgt.setText("");
			}
		});
		
		Font font1 = new Font("맑은 굴림",Font.BOLD, 50);
		top.setFont(font1);
		Font font2 = new Font("맑은 굴림",Font.BOLD, 25);
		l1.setFont(font2);
		id.setFont(font2);
		name.setFont(font2);
		cont.setFont(font2);
		price.setFont(font2);
		comp.setFont(font2);
		img.setFont(font2);
		idt.setFont(font2);
		namet.setFont(font2);
		contt.setFont(font2);
		pricet.setFont(font2);
		compt.setFont(font2);
		imgt.setFont(font2);
		Font font3 = new Font("맑은 굴림",Font.BOLD, 30);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b4.setFont(font3);
		clr.setFont(font3);
		
		f.add(top);
		f.add(l1);
		f.add(id);
		f.add(idt);
		f.add(name);
		f.add(namet);
		f.add(cont);
		f.add(contt);
		f.add(price);
		f.add(pricet);
		f.add(comp);
		f.add(compt);
		f.add(img);
		f.add(imgt);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(clr);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
