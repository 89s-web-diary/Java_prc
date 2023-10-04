package 메서드연습;

import java.io.File;
import java.util.Arrays;

public class 파일테스트 {

	public static void main(String[] args) {

		File file = new File("test.txt");
		boolean ex = file.exists();
		System.out.println("있음? >>> " + ex);
		
		File folder = new File(".");	//folder == directory == package
		System.out.println(folder.isDirectory());
		String[] list = folder.list();
		System.out.println(Arrays.toString(list));
		
	}

}
