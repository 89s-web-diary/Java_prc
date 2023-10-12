package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {
	
	public static void main(String[] args) {
		
		Connection conn = Jsoup.connect("https://www.naver.com");	// Connection 부품 리턴해줌
		
		System.out.println(conn);
		try {
			Document doc = conn.get();
			System.out.println(doc);
			Elements list = doc.select("span");
			// select ==> ArrayList로 리턴  --상속-->  Elements라는 class로 만듦
			// 조건에 맞는 태그들의 리스트를 뽑아내주는 객체
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}	// 가져온 태그 list 안에서 태그 사이의 글자만 가져오는 text() 클래스
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// .get() ==> 연결한 사이트에서 코드를 다 가지고 온다  ==> html 문서에 대한 코드 Document를 반환
		// 위험한 사오항 - 외부자원 연결(cpu, file, network) ==> network에 해당
		// 위험한 상황에 대해서는 상황 발생 시 어떻게 처리할지를 반드시 명시
		
		
		
		
	}

}
