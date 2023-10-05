package 생성자;

public class Mask {
	
	public String color;
	public int prc, n;
	
	public Mask(String color, int prc, int n) {
		this.color = color;
		this.prc = prc;
		this.n = n;
	}

	public String toString() {
		return "Mask [색은 " + color + ", 가격은 " + prc + ", 개수는 " + n + "]";
	}
	
}
