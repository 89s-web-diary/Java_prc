package 프로그래머스기초1일차;

public class 첫번째음수 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(num_list));
		
	}

}

class Solution5 {
    public int solution(int[] num_list) {
    	for (int i = 0; i < num_list.length; i++) {
    		if(num_list[i] < 0) {
    			return i;
    		}
		}
        return -1;
    }
}