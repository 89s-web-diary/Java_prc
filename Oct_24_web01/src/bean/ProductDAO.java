package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ProductDAO {
	
	Connection con;
	DBConnectionMgr dbcp;
	
	public ProductDAO() {
		try {
			
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();	//임대
			
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	
	public void insert(ProductVO bag) {
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
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
			
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "입력 에러 발생");
		}
	} // insert
	
	
	public int update(String id, String change, int a) {
		int result = 0;
		// Java - DB 연결 (JDBC) 4단계에 거쳐 코딩
		try {
			
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
			
			dbcp.freeConnection(con, ps, table);
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
