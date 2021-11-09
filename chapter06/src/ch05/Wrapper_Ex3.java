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
		long l = Long.parseLong(str);

		//
		float f = Float.parseFloat(str2);
		Double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		if (Boolean.parseBoolean(str3)) {
			System.out.println("boolean 형으로 변경 완료!!");
		}

		System.out.println("문자열 byte 값 변환 : " + b);
		System.out.println("문자열 int 값 변환 : " + i);
		System.out.println("문자열 short 값 변환 : " + s);

		System.out.println(b);
		// 문제 1

		String str10 = "1001";
		String str11 = "2001";

		// str10 과 str11을 덧셈 연산
		// 결과값까지 출력
		// str10 과 str11을 곱셈 연산
		// 결과값까지 출력

		int n = Integer.parseInt(str10);
		int m = Integer.parseInt(str11);
		int x = n + m;
		int y = n * m;

		System.out.println(x);
		System.out.println(y);

	}
}
