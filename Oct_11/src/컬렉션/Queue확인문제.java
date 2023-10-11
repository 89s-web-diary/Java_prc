package 컬렉션;

import java.util.LinkedList;

public class Queue확인문제 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");

		System.out.println("전체 시험볼 과목 : " + list);
		list.remove();
		System.out.println("1일차 시험본 후 남은 과목 : " + list);
		list.remove();
		System.out.println("2일차 시험본 후 남은 과목 : " + list);
		list.remove();
		System.out.println("3일차 시험본 후 남은 과목 : " + list);

	}

}
