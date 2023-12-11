package 프로그래머스기초4일차;

public class 문자열여러번뒤집기 {

	public static void main(String[] args) {
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(my_string, queries));
	}

}

class Solution5 {
    public String solution(String my_string, int[][] queries) {
    	char[] c = my_string.toCharArray();
    	char[] change = c.clone();
    	for (int i = 0; i < queries.length; i++) {
    		int cnt = 0;
    		for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				change[j] = c[queries[i][1]-cnt];
				cnt++;
			}
    		c = change.clone();
		}
    	StringBuilder sb = new StringBuilder();
    	for (char d : change) {
			sb.append(d);
		}
        return sb.toString();
    }
}


