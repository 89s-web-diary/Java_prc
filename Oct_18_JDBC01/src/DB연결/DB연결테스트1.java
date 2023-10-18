package DB연결;

public class DB연결테스트1 {

	public static void main(String[] args) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 1번 설정을 커넥터로 db연결하고 승인
			//	  1) url + ip + prot + db명
			//    2) id, pw
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		
	}

}
