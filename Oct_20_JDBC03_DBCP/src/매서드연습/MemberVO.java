package 매서드연습;

public class MemberVO {
		
	String id;
	String pw;
	String name;
	String tel;
	
	// 가방에서 데이터를 하나씩 꺼내는 기능
	public String getId() {
		return id;
	}
	// 가방에 데이터를 하나씩 넣는 기능 => 함수(메서드)
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		return "가방데이터 [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
