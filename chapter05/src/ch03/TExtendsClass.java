package ch03;

public class TExtendsClass {

	public static void main(String[] args) {

		// < T extends Ŭ����> ����ϱ�
		// T �ڷ����� ������ ���� �� �� ����
		// (�������� ������ �ڷ������� �ƹ� Ŭ������ �� �� �ִ�.)

		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		System.out.println("------------------");

		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();

	}

}