package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

			ps.execute();
			System.out.println(" Clear 4 ");
			
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "입력 에러 발생");
		}
	} // insert
	
//	if(index.equals("제목")) {
//		String sql = "update bbs set title = ? where no = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, cont);
//		ps.setInt(2, no);
//		System.out.println("Title Update Complete");
//		res = ps.executeUpdate();
//		dbcp.freeConnection(con, ps);
//	}
	public int update(String id, String index, String cont) {
		int result = 0;
		try {
			if(index.equals("상품명")) {
				String sql = "update product set name = ? where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont);
				ps.setString(2, id);
				System.out.println("Name Update Complete");
				result = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}else if(index.equals("내용")) {
				String sql = "update product set content = ? where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont);
				ps.setString(2, id);
				System.out.println("Content Update Complete");
				result = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}else if(index.equals("가격")) {
				String sql = "update product set price = ? where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, Integer.parseInt(cont));
				ps.setString(2, id);
				System.out.println("Price Update Complete");
				result = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}else if(index.equals("제조회사")) {
				String sql = "update product set company = ? where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont);
				ps.setString(2, id);
				System.out.println("Company Update Complete");
				result = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}else if(index.equals("이미지")) {
				String sql = "update product set img = ? where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, cont);
				ps.setString(2, id);
				System.out.println("Image Update Complete");
				result = ps.executeUpdate();
				dbcp.freeConnection(con, ps);
			}
			
		} catch (Exception e) { // Exception == Error
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

			res = ps.executeUpdate();
			
			con.close();
			ps.close();
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error");
		} // delete
		return res;
	}
	
	public ProductVO one(String id) {
		ProductVO bag = new ProductVO();
		try {
			String sql = "select * from product where id = ?"; // 물음표에 대입가능
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 첫번째 물음표에 매개변수 id 대입

			ResultSet table = ps.executeQuery();
			if(table.next()) { //table안에 검색결과인 row가 있는지 체크 
				bag.setId(table.getString(1));
				bag.setName(table.getString(2));
				bag.setCont(table.getString(3));
				bag.setPrice(table.getInt(4));
				bag.setComp(table.getString(5));
				bag.setImg(table.getString(6));
            }
			
			dbcp.freeConnection(con, ps, table);
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();
			System.out.println("Error");
		}
		return bag;
	} // one
	
	public ArrayList<ProductVO> list() {
		ArrayList<ProductVO> list = new ArrayList<>();
		try {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet table = ps.executeQuery();

			while (table.next()) { // table안에 검색결과인 row가 있는지 체크
				ProductVO bag = new ProductVO();
				bag.setId(table.getString(1));
				bag.setName(table.getString(2));
				bag.setCont(table.getString(3));
				bag.setPrice(table.getInt(4));
				bag.setComp(table.getString(5));
				bag.setImg(table.getString(6));
				list.add(bag);
			}

			dbcp.freeConnection(con, ps, table);

		} catch (Exception e) { // Exception == Error
			e.printStackTrace();
			System.out.println("Error");
		}
		return list;
	} // list 검색결과 다수

	
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
