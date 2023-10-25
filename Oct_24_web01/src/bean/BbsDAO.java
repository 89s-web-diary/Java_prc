package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	

	public int insert(BbsVO bag) {
		int result = 0;
		try {
			
			String sql = "insert into bbs values (null,?,?,?)"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle()); // 첫번째 물음표에 매개변수 id 대입
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			result = ps.executeUpdate();
			System.out.println("작성 완료");
			
			dbcp.freeConnection(con, ps);
			
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("존재하지 않은 ID입니다");
		}
		return result;
	} // insert

	public int delete(int no) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		int res = 0;
		try {
			
			String sql = "delete from bbs where no = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); // 첫번째 물음표에 매개변수 id 대입

			res = ps.executeUpdate();
			System.out.println("삭제 완료");;
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		} 
		return res;
	}	// delete

	public int update(int no, String index, String cont) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		int res = 0;
		try {
			if(index.equals("제목")) {
				String sql = "update bbs set title = ? where no = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont);
				ps.setInt(2, no);
				System.out.println("Title Update Complete");
				res = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}
			else if(index.equals("내용")) {
				String sql = "update bbs set content = ? where no = ?"; // 물음표에 대입가능
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont); // 첫번째 물음표에 매개변수 id 대입
				ps.setInt(2, no);
				System.out.println("Content Update Complete");
				res = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		} 
		return res;
	}// update

	public BbsVO one(int no) {
		BbsVO bag = new BbsVO();
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			String sql = "select * from bbs where no = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); // 첫번째 물음표에 매개변수 id 대입

			ResultSet table = ps.executeQuery();
			if(table.next()) {
				bag.setNo(table.getInt("no"));
				bag.setTitle(table.getString("title"));
				bag.setContent(table.getString("content"));
				bag.setWriter(table.getString("writer"));
			}
			System.out.println("SQL Connect Complete");
			
			dbcp.freeConnection(con, ps, table);

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		return bag;
	} // select
	
	public ArrayList<BbsVO> list() {
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			String sql = "select * from bbs"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet table = ps.executeQuery();
			while(table.next()) {
				BbsVO bag = new BbsVO();
				bag.setNo(table.getInt("no"));
				bag.setTitle(table.getString("title"));
				bag.setContent(table.getString("content"));
				bag.setWriter(table.getString("writer"));
				list.add(bag);
			}
			System.out.println("SQL Connect Complete");
			
			dbcp.freeConnection(con, ps, table);

		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		return list;
	} // select
	
}
