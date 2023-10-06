package 스태틱;

public class 직원 {
	
	public String name;
	public int age;
	public char gen;
	
	public static int cnt, tot;

	public 직원(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
		cnt++;
		tot += age;
	}

	public String toString() {
		return "직원 [이름=" + name + ", 나이=" + age + ", 성별=" + gen + "]";
	}
	
	public static int getAvg() {
		// static method 내부에선 static 변수만 사용 가능
		// instance 변수는 객체 생성시 heap area에 생성
		// 따라서 생성되지 않은 instance 변수는 static method에서 불러올 수 없음
		int avg = tot/cnt;
		return avg;
	}
	
}
