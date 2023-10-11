package 컬렉션;

import java.util.ArrayList;

public class ArrayList확인문제 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등 >> " + list.get(i));
		}

		list.remove(1);
		System.out.println("김정민 반칙!!! 탈락!!!");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등 >> " + list.get(i));
		}
		// 김정민이 포함되어 있나요?
		System.out.println(list.contains("김정민"));
		// 박소정이 몇등인가요?
		System.out.println(list.indexOf("박소정")+1);
		// 소지현 개명!!
		list.set(1, "소지섭");
		System.out.println(list);
	}

}
