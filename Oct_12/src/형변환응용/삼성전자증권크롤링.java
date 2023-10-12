package 형변환응용;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 삼성전자증권크롤링 {

	public static void main(String[] args) {
		
		String cd = JOptionPane.showInputDialog("코드입력");
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" +cd);
		// 005930
		// .connect("URL") ==> URL을 연결 / Connection 부품 리턴해줌

		System.out.println(conn);
		try {
			Document doc = conn.get();
//			System.out.println(doc);
			Elements list = doc.select(".code");
			// select ==> ArrayList로 리턴 --상속--> Elements라는 class로 만듦
			// 조건에 맞는 태그들의 리스트를 뽑아내주는 객체
			System.out.println(list.size());
			String code = list.get(0).text(); // 005930
			System.out.println("code >> " + code);

			Elements list2 = doc.select("td.first span.blind");
			// td.first span.blind (사이에 공백한번이면 td.first안에있는 span.blind를 찾아내줌)
			System.out.println(list2.size());
//			System.out.println(list2.get(0).text()); // 전일가
//			System.out.println(list2.get(1).text()); // 시가

			String yes = list2.get(0).text();
			String start = list2.get(1).text();
			System.out.println("전일가 >>> " + yes);
			System.out.println("시가 >>> " + start);

//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).text());
//			}	// 가져온 태그 list 안에서 태그 사이의 글자만 가져오는 text() 클래스

		} catch (IOException e) {
			e.printStackTrace();
		}
		// .get() ==> 연결한 사이트에서 코드를 다 가지고 온다 ==> html 문서에 대한 코드 Document를 반환
		// 위험한 사오항 - 외부자원 연결(cpu, file, network) ==> network에 해당
		// 위험한 상황에 대해서는 상황 발생 시 어떻게 처리할지를 반드시 명시

	}

}
