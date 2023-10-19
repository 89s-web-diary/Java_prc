package 상품정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ProductDAO {
	
	public void insert(ProductVO bag) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Clear 1 ");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(" Clear 2 ");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?,?,?,?,?,?)"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());	// id
			ps.setString(2, bag.getName());	// name
			ps.setString(3, bag.getCont());	// cont
			ps.setInt(4, bag.getPrice());	// price
			ps.setString(5, bag.getComp());	// comp
			ps.setString(6, bag.getImg());	// img
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ps.execute();
			System.out.println(" Clear 4 ");
			
			con.close();
			ps.close();
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "존재하지 않은 ID입니다");
		}
	} // insert
	
	
	public int update(String id, String change, int a) {
		int result = 0;
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = ""; // 물음표에 대입가능
			if(a==1) sql = "update product set name = ? where id = ? ";
			else if(a==2) sql = "update product set content = ? where id = ? ";
			else if(a==3) {
				sql = "update product set price = ? where id = ? ";
			}
			else if(a==4) sql = "update product set company = ? where id = ? ";
			else if(a==5) sql = "update product set img = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			if(a==3) ps.setInt(1, Integer.parseInt(change));
			else ps.setString(1, change);
			ps.setString(2, id);

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			result = ps.executeUpdate();
			System.out.println(" Clear 4 ");

			con.close();
			ps.close();
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		return result;
	} // update
	
	public int delete(String id) {
		int res = 0;
		try {
			// 1.연결할 부품(커넥터, driver, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from product where id = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 첫번째 물음표에 매개변수 id 대입

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			res = ps.executeUpdate();
			
			con.close();
			ps.close();
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		} // delete
		return res;
	}
	
	public ProductVO select(String id) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		ProductVO bag = new ProductVO();
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
			String sql = "select * from product where id = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 첫번째 물음표에 매개변수 id 대입
			System.out.println(" Clear 3 ");

			// 4. 3번에서 생성된 sql문을 MySQL로 전송
			ResultSet table = ps.executeQuery();
//			System.out.println(table.next());
			if(table.next()) { //table안에 검색결과인 row가 있는지 체크 
                String id2 = table.getString("id"); //id는 컬럼명 
                String name = table.getString("name");
                String cont = table.getString("content");
                String price = table.getString("price");
                String comp = table.getString("company");
                String img = table.getString("img");
                bag.setId(id2);
                bag.setName(name);
                bag.setCont(cont);
                bag.setPrice(Integer.parseInt(price));
                bag.setComp(comp);
                bag.setImg(img);
            }
			System.out.println(" Clear 4 ");
			
			con.close();
			ps.close();
			table.close();
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		return bag;
	} // select
	
	public boolean res(String id) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/prc_shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			ResultSet table = ps.executeQuery();
			result = table.next();
			
			con.close();
			ps.close();
			table.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
