package 정리문제;

public class TourMain {

	public static void main(String[] args) {
		
		Tour tour = new Tour();
		String[] list = tour.가고싶은여행지목록();
		System.out.println("내가 가고 싶은 여행지는 "+list[0]+"와 "+list[1]+", "+list[2]+"이다.빨리가자!");
		
		String s = tour.제일가고싶은여행지();
		System.out.println("제일 가고 싶은 여행지는 "+s+"인데 가기 쉽지 않다.");
		
		int res = tour.여행지경비(2, 50000);
		if(res >= 200000) System.out.println("더 모아야한다");
		else System.out.println("이제 여행을 떠나도 된다");
		
	}

}
