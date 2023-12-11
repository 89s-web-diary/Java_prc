package 프로그래머스기초2일차;

public class 수조작1 {

	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		Solution16 sol = new Solution16();
		System.out.println(sol.solution(n, control));
		
	}

}

class Solution16 {
    public int solution(int n, String control) {
    	String[] con = control.split("");
    	int answer = n;
    	for (String string : con) {
    		switch (string) {
    		case "w":
    			answer += 1;
    			break;
    		case "s":
    			answer -= 1;
    			break;
    		case "d":
    			answer += 10;
    			break;
    		case "a":
    			answer -= 10;
    			break;
    		default:
    			break;
    		}
		}
        return answer;
    }
}