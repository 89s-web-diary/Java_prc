package 프로그래머스입문;

public class 배열의평균값 {

	public static void main(String[] args) {
		Solutions ss = new Solutions();
		최댓값 max = new 최댓값();
		int[] num = {0, 31, 24, 10, 1, 9};
		System.out.println(max.solution(num));
		
	}

}

class Solutions {
    public double solution(int[] numbers) {
    	double answer = 0;
    	for (int i : numbers) {
			answer += i;
		}
        return answer/numbers.length;
    }
}

class 최댓값 {
    public int solution(int[] numbers) {
    	int max = numbers[0] * numbers[1];
    	for (int i : numbers) {
			for (int j : numbers) {
				if(max < i*j && i!=j) max = i*j;
			}
		}
        return max;
    }
}