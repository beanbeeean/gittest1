package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 1. ThreeDPrinter1 -> 객체 생성
		ThreeDPrinter1 printer = new ThreeDPrinter1();
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();

		// set 메서드 사용할 때 Powder
		printer.setMaterial(powder);
		System.out.println(printer.getMaterial());

		System.out.println("--------------------");

		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		System.out.println("--------------------");

		printer3.setMaterial(powder);
		System.out.println(printer3.getMaterial());
		System.out.println("--------------------");

		// 요청 : 변수에 ThreeDPrinter3에 재료를 저장해 주세요.
		// temp1
		Powder temp1 = (Powder) printer3.getMaterial();

		// 질문
		System.out.println(printer3);
	}

}
