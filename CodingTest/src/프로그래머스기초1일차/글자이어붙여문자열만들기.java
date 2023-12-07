package 프로그래머스기초1일차;

public class 글자이어붙여문자열만들기 {

	public static void main(String[] args) {
		String my_string = "cvsgiorszzzmrpaqpe";
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		Solution10 sol = new Solution10();
		System.out.println(sol.solution(my_string, index_list));
		
	}

}

class Solution10 {
    public String solution(String my_string, int[] index_list) {
    	StringBuilder sb = new StringBuilder();
        for (int i : index_list) {
			sb.append(my_string.charAt(i));
		}
        return sb.toString();
    }
}