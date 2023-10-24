package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	Connection con;
	DBConnectionMgr dbcp;
	// new를 이용해서 객체생성시 클래스이름과 동일한 메서드가 있으면 자동실행
	public MemberDAO() {
		try {
			
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();	//임대
			
			// 위 두줄  == 아래 6줄
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
//			String user = "root";
//			String password = "1234";
//			con = DriverManager.getConnection(url, user, password);
//			System.out.println("Connection Success");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public int insert(MemberVO bag) {
		int res = 0;
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			String sql = "insert into member values (?,?,?,?)"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId()); // 첫번째 물음표에 매개변수 id 대입
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("Create SQL Success");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			res = ps.executeUpdate();
			System.out.println("Success Link mySQL");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		return res;
	} // insert

	public void delete(String id) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			String sql = "delete from member where id = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 첫번째 물음표에 매개변수 id 대입
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.executeUpdate();
			System.out.println(" Clear 4 ");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		} // delete
	}

	public void update(String id, String index, String cont) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			if (index.equals("tel")) {
				String sql = "update member set tel = ? where id = ?"; // 물음표에 대입가능
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont); // 첫번째 물음표에 매개변수 id 대입
				ps.setString(2, id); // 첫번째 물음표에 매개변수 id 대입
				System.out.println("Update Complete");
				ps.execute();
				dbcp.freeConnection(con, ps);
			} else if (index.equals("pw")) {
				String sql = "update member set pw = ? where id = ?"; // 물음표에 대입가능
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont); // 첫번째 물음표에 매개변수 id 대입
				ps.setString(2, id); // 첫번째 물음표에 매개변수 id 대입
				System.out.println("Update Complete");
				ps.execute();
				dbcp.freeConnection(con, ps);
			} else if (index.equals("name")) {
				String sql = "update member set name = ? where id = ?"; // 물음표에 대입가능
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont); // 첫번째 물음표에 매개변수 id 대입
				ps.setString(2, id); // 첫번째 물음표에 매개변수 id 대입
				System.out.println("Update Complete");
				ps.execute();
				dbcp.freeConnection(con, ps);
			}

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			System.out.println("Success Link mySQL");
			
			
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		} // delete
	}

	public MemberVO select(String id) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		MemberVO bag = new MemberVO();
		try {
			String sql = "select * from member where id = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 첫번째 물음표에 매개변수 id 대입
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ResultSet table = ps.executeQuery();
			if (table.next()) { // table안에 검색결과인 row가 있는지 체크
				String id2 = table.getString("id"); // id는 컬럼명
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			}
			System.out.println(" Clear 4 ");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();
			System.out.println("Error");
		}
		return bag;
	} // select
	
	public boolean res(String id) {
		boolean result = false;
		try {
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			ResultSet table = ps.executeQuery();
			result = table.next();
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
