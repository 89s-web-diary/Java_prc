package 게시판정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BbsDAO {

	public void insert(String title, String cont, String writer) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Clear 1 ");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// 1) url + ip + prot + db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Clear 2 ");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 해당부품으로 만들어주어야 한다
			// sql ==> PreparedStatement
			// site ==> URL
			String sql = "insert into bbs values (null,?,?,?)"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); // 첫번째 물음표에 매개변수 id 대입
			ps.setString(2, cont);
			ps.setString(3, writer);
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.execute();
			System.out.println(" Clear 4 ");
			JOptionPane.showMessageDialog(null, "작성 완료");

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "존재하지 않은 ID입니다");
		}
	} // insert

	public void delete(int no) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Clear 1 ");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// 1) url + ip + prot + db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Clear 2 ");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 해당부품으로 만들어주어야 한다
			// sql ==> PreparedStatement
			// site ==> URL
			String sql = "delete from bbs where no = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); // 첫번째 물음표에 매개변수 id 대입
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.execute();
			System.out.println(" Clear 4 ");
			JOptionPane.showMessageDialog(null, "삭제 완료");

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		} // delete
	}

	public void update(int no, String title, String cont) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Clear 1 ");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// 1) url + ip + prot + db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Clear 2 ");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 해당부품으로 만들어주어야 한다
			// sql ==> PreparedStatement
			// site ==> URL

			String sql = "update bbs set title = ?, content = ? where no = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title); // 첫번째 물음표에 매개변수 id 대입
			ps.setString(2, cont); // 첫번째 물음표에 매개변수 id 대입
			ps.setInt(3, no);
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.execute();
			System.out.println(" Clear 4 ");
			JOptionPane.showMessageDialog(null, "수정 완료");

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		} // delete

	}
}
