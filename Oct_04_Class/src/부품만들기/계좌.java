package 부품만들기;

public class 계좌 {
	
	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	public void 입금하다(int a) {
		int i = a;
		System.out.println(i+"원 입금됨");
	}
	
	public void 출금하다(int a) {
		int i = a;
		System.out.println(i+" 출금됨");
	}
	
	@Override
	public String toString() {
		return "계좌 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액=" + 금액 + "]";
	}
	
	
	
}
