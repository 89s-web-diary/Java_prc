package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		
		HashSet trv = new HashSet();
		trv.add("일본");
		trv.add("대만");
		trv.add("중국");
		trv.add("필리핀");
		trv.add("보라카이");
		System.out.println(trv);
		
		HashMap rpl = new HashMap();
		rpl.put("안방", "TV");
		rpl.put("거실", "쇼파");
		rpl.put("부엌", "냉장고");
		rpl.put("현관", "신발");
		System.out.println(rpl);
		System.out.println(rpl.get("현관"));
		rpl.replace("거실","쇼파","책상");
		System.out.println(rpl);
		
		ArrayList todo = new ArrayList();
		todo.add("공부");
		todo.add("운동");
		todo.add("수면");
		todo.add("식사");
		todo.add("세신");
		System.out.println(todo);
		System.out.println(todo.get(0)+" "+todo.get(4));
		todo.set(1, "청소");
		System.out.println(todo);
	}

}
