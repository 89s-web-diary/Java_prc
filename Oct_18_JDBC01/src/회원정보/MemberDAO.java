package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {

	public void insert(String id, String pw, String name, String tel) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Clear 1 ");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// 	  1) url + ip + prot + db명
			// 	  2) id, pw
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Clear 2 ");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 해당부품으로 만들어주어야 한다
			// sql ==> PreparedStatement
			// site ==> URL
			String sql = "insert into member values (?,?,?,?)";		// 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);	// 첫번째 물음표에 매개변수 id 대입
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.execute();
			System.out.println(" Clear 4 ");

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
	} // insert
	
		public void delete(String id) {
			// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
			try {
				// 1.연결할 부품(커넥터, driver, 드라이버) 설정
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(" Clear 1 ");

				// 2. 1번 설정을 커넥터로 db연결하고 승인
				// 	  1) url + ip + prot + db명
				// 	  2) id, pw
				String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println(" Clear 2 ");

				// 3. 2번에서 연결된 것을 가지고 sql문 생성
				// 해당부품으로 만들어주어야 한다
				// sql ==> PreparedStatement
				// site ==> URL
				String sql = "delete from member where id = ?";		// 물음표에 대입가능
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);	// 첫번째 물음표에 매개변수 id 대입
				System.out.println(" Clear 3 ");

				// 4. 3번에서 생성된 sql문을 MySQL로 전송
				ps.execute();
				System.out.println(" Clear 4 ");

			} catch (Exception e) { // Exception == Error
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error");
			} //delete
	}
		
		public void update(String id, String index, String cont) {
			// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
			try {
				// 1.연결할 부품(커넥터, driver, 드라이버) 설정
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(" Clear 1 ");

				// 2. 1번 설정을 커넥터로 db연결하고 승인
				// 	  1) url + ip + prot + db명
				// 	  2) id, pw
				String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println(" Clear 2 ");

				// 3. 2번에서 연결된 것을 가지고 sql문 생성
				// 해당부품으로 만들어주어야 한다
				// sql ==> PreparedStatement
				// site ==> URL
				if(index.equals("tel")) {
					String sql = "update member set tel = ? where id = ?";		// 물음표에 대입가능
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, cont);	// 첫번째 물음표에 매개변수 id 대입
					ps.setString(2, id);	// 첫번째 물음표에 매개변수 id 대입
					System.out.println(" Clear 3 ");
					ps.execute();
				} else if(index.equals("pw")) {
					String sql = "update member set pw = ? where id = ?";		// 물음표에 대입가능
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, cont);	// 첫번째 물음표에 매개변수 id 대입
					ps.setString(2, id);	// 첫번째 물음표에 매개변수 id 대입
					System.out.println(" Clear 3 ");
					ps.execute();
				} else if(index.equals("name")) {
					String sql = "update member set name = ? where id = ?";		// 물음표에 대입가능
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, cont);	// 첫번째 물음표에 매개변수 id 대입
					ps.setString(2, id);	// 첫번째 물음표에 매개변수 id 대입
					System.out.println(" Clear 3 ");
					ps.execute();
				}

				// 4. 3번에서 생성된 sql문을 MySQL로 전송
				System.out.println(" Clear 4 ");

			} catch (Exception e) { // Exception == Error
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error");
			} //delete

	}
}
