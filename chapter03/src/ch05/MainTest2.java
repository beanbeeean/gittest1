package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		final int BANANA = 1;
		final int PEACH = 2;
		
		// 스캐너
		// 사용자가 입력한 1,2 받으면 해당하는 객체에 정보를 화면에 출력해주세요.
		
		System.out.println("바나나 : 1, 복숭아 : 2");
		System.out.println("================");
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요 : ");
		int userInput = sc.nextInt();
		
		Fruit fruit;
		
		// 만약 1번이라면 바나나 객체를 생성하고 showInfo 메서드 호출
		if(userInput == BANANA) {
			fruit = new Banana();		
		}else {
			fruit = new Peach();			
		}
		
		fruit.showInfo();
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽게 바꿔줄 수 있다.
		
		
	}

}
