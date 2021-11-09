package ch05;

public class MainTest3 {

	public static void main(String[] args) {
		// 다형성 : 배열(자료구조) 관계에서도 사용 가능
		// 하나의 변수에 연관된 데이터를 통으로 관리 하기 위해 사용
		
		//1. 
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		Banana[] bananaBuket = new Banana[2];
		bananaBuket[0] = banana1;
		bananaBuket[1] = banana2;
		
		// for each
		for (Banana banana : bananaBuket) {
			banana.showInfo();
		}
		
		// 복숭아
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		// 배열은 2칸
		Peach[] peachBuket = new Peach[2];
		peachBuket[0] = peach1;
		peachBuket[1] = peach2;
		
		for (Peach peach : peachBuket) {
			peach.showInfo();
		}
		System.out.println("-----------------------");
		// 3. 다형성
		Fruit[] fruitBuket = new Fruit[4];
		fruitBuket[0] = banana1;
		fruitBuket[1] = peach1;
		fruitBuket[2] = banana2;
		fruitBuket[3] = peach2;
		
		for (Fruit fruit : fruitBuket) {
			fruit.showInfo();
		}
		
		
		
		
		
		
		
		
		
	}

}
