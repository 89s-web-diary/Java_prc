package 생성자;

public class 컴퓨터 {

	public int prc;
	public String com, size;

	public 컴퓨터(int prc, String com, String size) {
		this.prc = prc;
		this.com = com;
		this.size = size;
	}

	public String toString() {
		return "컴퓨터 [가격은 " + prc + ", 제조사는 " + com + ", 모니터크기는 " + size + "]";
	}
	
}
