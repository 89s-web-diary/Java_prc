package 생성자;

public class TV2 {
	
	// 생성자를 하나도 만들어주지 않는 경우에는 눈에 보이지 않지만
	// 자동으로 클래스와 동일한 생성자 method를 자동으로 만들어준다
	
	int ch, vol;
	boolean onoff;
	public TV2() {
		
	}
	public TV2(int x, int y, boolean z) {
		ch = x; vol = y; onoff = z;
	}
	public void change() {
		System.out.println("채널을 바꾸다");
	}
	
	public String toString() {
		return "TV2 [채널=" + ch + ", 볼륨=" + vol + ", 전원=" + onoff + "]";
	}
	
	

}
