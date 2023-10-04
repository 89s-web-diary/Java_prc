package 메서드연습;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 파일에쓰기테스트 {

	public static void main(String[] args) {
		// 파일에 텍스트를 저장할 수 있는 부품

		try {

			FileWriter file = new FileWriter("test2.txt");
			file.write("hi" + "\n");
			file.write("hello" + "\n");
			file.write("goodbye" + "\n");
			file.close();
			

		} catch (IOException e) {
			System.out.println("에러");
			e.printStackTrace(); // 자세하게 에러정보도 볼 수 있음.
		}

		// 파일을 생성하고, 텍스트를 파일까지 보낼 수 있는 통로까지 만들어줌.
		// 통로 == 강물 (stream, 스트림)
		// 스트림을 만드는 것은 프로그래밍할 때는 굉장히 위험한 상황!!
		// 위험한 상황에 대해 대처를 꼭 해야함. ==> 프로그램이 멈춰버리는 상황
		// 파일에 읽고 쓸 때
		// 네트워크를 연결할 때
		// cpu를 연결할 때

	}

}
