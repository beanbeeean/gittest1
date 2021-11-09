package ch04;

public class BusMainTest {

	public static void main(String[] args) {
		
		// 버스 101, 102 버스만들기
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
		
		// 
		bus101.showInfo();
		System.out.println("============");
		bus102.showInfo();
		
		//
		System.out.println("============");
		bus101.take(1200);
		bus101.showInfo();
		
		//bus 102 버스에 take 2번 실행 showinfo
		
		bus102.take(1200);
		bus102.take(1200);
		bus102.showInfo();
	}

}
