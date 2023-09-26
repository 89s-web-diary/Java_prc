package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 가고싶은곳문제 {

	public static void main(String[] args) {

		String[] ly = new String[3];
		String[] y = new String[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ly.length; i++) {
			ly[i] = sc.next();
		}
		for (int i = 0; i < y.length; i++) {
			y[i] = sc.next();
		}

		int cnt = 0, cntn = 0, where = 0;
		for (int i = 0; i < y.length; i++) {
			if (ly[i].equals(y[i])) {
				cnt++;
				where = i;
			} else {
				cntn++;
			}
		}
		
		System.out.println(Arrays.toString(ly));
		System.out.println(Arrays.toString(y));
		System.out.println("작년과 올해에도 가고 싶은 장소가 동일한 곳은 몇개? >> " + cnt);
		System.out.println("작년과 올해에도 가고 싶은 장소가 다른 곳은 몇개? >> " + cntn);
		System.out.println("작년과 올해에 가고싶은 장소가 동일한 곳은? >> " + y[where]);

	}

}
