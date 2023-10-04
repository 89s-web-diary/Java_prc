package 부품만들기;

public class Phone {
	
	public int size;
	public String speaker;
	
	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷하다");
	}

	@Override
	public String toString() {
		return "Phone : 사이즈는 " + size + ", 회사는 " + speaker;
	}
	
	// 상속받은 메서드가 8개 있음.
	// 눈에 안보임.
	// 상속받은 메서드를 재정의해서 쓸 수 있다.(마음대로 고쳐쓰기 가능)
	// ==> override
	
	
	
}
