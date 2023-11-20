
package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자입력 >> ");
			numbers[i] = sc.nextDouble();
		}
	
		int count = 0;
		String location = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2가 있는 인덱스는 " + i);
			} else if (numbers[i] == 33.3) {
				System.out.println("33.3이 있는 인덱스는 " + i);
				count++;
				location = location + i + " ";
				list.add(i);
			}
			// if문을 따로 쓰는 경우 >> index마다 조건문 2번씩 실행
			// else if문을 쓰는 경우 >> 조건이 충족될때마다 index의 시행횟수가 달라짐
		}
		// List<double[]> list = Arrays.asList(numbers);
		System.out.println("33.3의 갯수 >> " + count + " /// 33.3의 index >> " + location);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			numbers[list.get(i)] = 333.3;
		}
		System.out.println(Arrays.toString(numbers));
		
		sc.close();
		
	}

}
