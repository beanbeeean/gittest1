package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "데미안", "헤르만 헤세1");
		Book book2 = new Book(1, "데미안", "헤르만 헤세2");

		System.out.println(book1 == book2);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a" == "a");
		System.out.println("=============");
		
		// equals 메서드를 재정의 ( book 클래스에서)
		if(book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		}else {
			System.out.println("다른 책입니다.");
		}
		
	}

}
