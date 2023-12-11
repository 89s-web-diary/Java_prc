package 프로그래머스기초2일차;

public class 수조작2 {

	public static void main(String[] args) {
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		Solution17 sol = new Solution17();
		System.out.println(sol.solution(numLog));
	}

}

class Solution17 {
    public String solution(int[] numLog) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < numLog.length-1; i++) {
			if(numLog[i+1]-numLog[i]==1) {
				sb.append("w");
			}else if(numLog[i+1]-numLog[i]==-1) {
				sb.append("s");
			}else if(numLog[i+1]-numLog[i]==10) {
				sb.append("d");
			}else if(numLog[i+1]-numLog[i]==-10) {
				sb.append("a");
			}
		}
        return sb.toString();
    }
}