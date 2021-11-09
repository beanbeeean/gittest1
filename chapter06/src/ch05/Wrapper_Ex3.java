package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {

		String str = "10";
		String str2 = "10.5";
		String str3 = "true";

		// 8 + "" >>> String
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str); // 안녕
		//
		float f = Float.parseFloat(str2);
		Double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean ������ ���� �Ϸ�!!");
		}

		System.out.println("���ڿ� byte �� ��ȯ : " + b);
		System.out.println("���ڿ� int �� ��ȯ : " + i);
		System.out.println("���ڿ� short �� ��ȯ : " + s);

		System.out.println(b);
		// ���� 1

		String str10 = "1001";
		String str11 = "2001";

		// str10 �� str11�� ���� ����
		// ��������� ���
		// str10 �� str11�� ���� ����
		// ��������� ���

		int n = Integer.parseInt(str10);
		int m = Integer.parseInt(str11);
		int x = n + m;
		int y = n * m;

		System.out.println(x);
		System.out.println(y);

		// 한글 깨짐 확인코드!
	}
}
