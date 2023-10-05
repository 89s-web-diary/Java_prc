package 생성자;

import 부품만들기.TV;

public class 거실 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		tv.ch = 5;
		tv.onoff = false;
		tv.vol = 100;
		System.out.println(tv);
		
		TV2 tv2 = new TV2(5, 100, true);
		System.out.println(tv2);
		
		TV2 tv3 = new TV2();
		System.out.println(tv3);
		
		컴퓨터 cpt = new 컴퓨터(100000,"삼성","24인치");
		System.out.println(cpt);
		컴퓨터 cpt2 = new 컴퓨터(200000,"LG","32인치");
		System.out.println(cpt2);
	
	}

}
