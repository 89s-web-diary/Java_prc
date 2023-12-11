package 프로그래머스기초4일차;

public class 부분문자열인지확인 {

	public static void main(String[] args) {
		String my_string = "banana";
		String target = "ana";
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(my_string, target));
	}

}

class Solution1 {
    public int solution(String my_string, String target) {
        return my_string.contains(target)?1:0;
    }
}