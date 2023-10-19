package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB테스트 {

	public static void main(String[] args) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Clear 1 ");
			
			// 2. 1번 설정을 커넥터로 db연결하고 승인
			//	  1) url + ip + prot + db명
			//    2) id, pw
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Clear 2 ");
			
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values ('star3','1234','star','013')";
			// 해당부품으로 만들어주어야 한다
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(" Clear 3 ");
			
			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.execute();
			System.out.println(" Clear 4 ");
			
		} catch (Exception e) {		//Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		
	}

}
