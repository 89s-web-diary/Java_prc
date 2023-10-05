package 생성자;

public class 통장 {
	
	public String name, ssn;
	public int money;

	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	public String toString() {
		return "통장 [이름=" + name + ", 주민번호=" + ssn + ", 입금액=" + money + "]";
	}
	
	
	
}
