package 정리문제;

public class Error{
	public void arr2(){
		int[] array = {10,20,30};
		try {
			array[3]=100;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("배열 인덱스 에러가 발생함");
		}
	}
}
