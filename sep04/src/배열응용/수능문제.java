package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {

		Random r = new Random(18);

		int[] arr = new int[10000];
		int con0 = 0;
		int conA = 0;
		int sum = 0;
		int[] indA = new int[500];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(451);
			if (arr[i] == 0) {
				con0++;
			} else if (arr[i] == 450) {
				conA++;
				indA[conA] = i;
			}
			sum = sum + arr[i];
		}

		System.out.println("수능 만점자 몇 명?? >> " + conA);
		System.out.println(Arrays.toString(indA));
		System.out.println("0점은 몇 명?? >> " + con0);

		double avg = (double) sum / arr.length;
		System.out.println("평균점수 >> " + avg);

		// cpu가 ram의 값을 변경해버림 ==> 파괴형 함수
		// 램에 들어있는 10000개의 데이터의 위치를 옮겨 정렬해줌 Arrays.sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// cpu가 혼자 처리하고 끝나는 함수 ==> 비파괴형 함수
		// ex) toString, Double.parseDouble(data) 등

		int cnt = 0;
		int cnt2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= (avg - 50) && arr[i] <= (avg + 50)) {
				cnt++;
			}
			if (arr[i] >= 300) {
				cnt2++;
			}
		}
		System.out.println("평균 +-50점인 학생 수 >> " + cnt);
		System.out.println("300점 이상인 학생 수 >> " + cnt2);
	}

}
