package 배열응용;

public class 여러개배열사용 {

	public static void main(String[] args) {
		
		String[] 식구 = {"아버지","어머니","형","나","동생"};
		int[] 나이 = {100,99,88,77,66};
		double[] 키 = {199.9,188.8,177.7,166.6,155.5};
		
		System.out.println("          우리집 식구 정리");
		System.out.println("---------------------");
		System.out.println(" 이름\t나이\t키");
		System.out.println("---------------------");
		for(int i = 0; i<나이.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i] + "\t" );
		}

		System.out.println("---------------------");
		// 우리가족 내년 나이 + 1
		for(int i = 0; i<나이.length; i++) {
			나이[i]++;
			if(식구[i].equals("동생")) {
				키[i]=키[i]+5;
			}
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i] + "\t" );
		}
	}

}
