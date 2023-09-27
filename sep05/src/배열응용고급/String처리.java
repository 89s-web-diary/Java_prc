package 배열응용고급;

public class String처리 {

	public static void main(String[] args) {
		
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		System.out.println(s+s2);	// 스트링 결합
		System.out.println(s.concat(" "+s2)); // 스트링 결합
		System.out.println(s.charAt(5));	// index의 글자 추출
		System.out.println(s.endsWith("야"));	// 야 로 끝나는지 판단 true / false
		System.out.println(s.substring(3));	// 해당 index부터 끝까지 추출
		System.out.println(s.substring(3,7));	// 해당 index 사이의 값을 추출
		System.out.println(s.lastIndexOf("머"));	// 해당 값의 index 추출
		System.out.println(s.toUpperCase());	// 대문자로
		System.out.println(s.toLowerCase());	// 소문자로
		System.out.println(s.length());	// 글자 수
		System.out.println(s.replace("나", "너"));	// 앞의 값을 뒤의 값으로 변환
				
	}

}
