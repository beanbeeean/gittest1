package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 1. ThreeDPrinter1 -> ��ü ����
		ThreeDPrinter1 printer = new ThreeDPrinter1();
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();

		// set �޼��� ����� �� Powder
		printer.setMaterial(powder);
		System.out.println(printer.getMaterial());

		System.out.println("--------------------");

		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		System.out.println("--------------------");

		printer3.setMaterial(powder);
		System.out.println(printer3.getMaterial());
		System.out.println("--------------------");

		// ��û : ������ ThreeDPrinter3�� ��Ḧ ������ �ּ���.
		// temp1
		Powder temp1 = (Powder) printer3.getMaterial();

		// ����
		System.out.println(printer3);
	}

}
