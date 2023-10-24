package DBCP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;


public class BbsDAO {
	Connection con;
	DBConnectionMgr dbcp;
	// new를 이용해서 객체생성시 클래스이름과 동일한 메서드가 있으면 자동실행
	public BbsDAO() {
		try {
			
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();	//임대

		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	

	public void insert(String title, String cont, String writer) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			
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
		} 
	}	// delete

	public void update(int no, String title, String cont) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			
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
		} 
	}// update

	public void select(int no) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			String sql = "select * from bbs where no = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); // 첫번째 물음표에 매개변수 id 대입
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ResultSet table = ps.executeQuery();
			System.out.println(table.next());
			System.out.println(" Clear 4 ");

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
	} // select
	
}
