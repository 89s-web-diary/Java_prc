package 리펙토링;

public class 매니저 extends 직원{
	
	private int bonus;

	public void	test() {
		System.out.println("관리할 사람이름 >> "+ name);
		System.out.println("관리할 사람월급 >> "+ salary);
		System.out.println("관리할 사람주소 >> "+ address);
//		System.out.println("관리할 사람주민번호 >> "+ rrn);
		// rrn은 직원 class에서만 사용 가능
		// 접근제어자 private으로 설정했기 때문에 가져올 수 없음
		System.out.println("관리감독하다");
	}
	
}
