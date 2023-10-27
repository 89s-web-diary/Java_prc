package network;

import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// 서버 ip + port 연결해줘
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println(i+" : 클라이언트가 서버로 요청을 보냄");
		}
		
	}

}
