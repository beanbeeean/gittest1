package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> String 
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		
		
		// 
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
//		if(Boolean.parseBoolean(str3)) {
//			System.out.println("boolean 형으로 변경 완료!!!");
//		}
//		
		// 문제 1 
		
//		String str10 = "1001";
//		String str11 = "2001";
		
		// str10 과 str11 을 덧셈 연산 
		// 결과값 까지 출력 
		// str10 과 str11 을 곱셈 연산
		// 결과값 까지 출력 
		
		String str10 ="1001";
		String str11 ="2001";
		
		int a = Integer.parseInt(str10);
		int c = Integer.parseInt(str11);
		int m = a + c;
		int p = a * c;
		
		System.out.println("두 String의 합 값은 : " + m + "입니다");
		System.out.println("두 String의 곱 값은 : " + p + "입니다");
		
//		System.out.println("문자열 byte값 변환 :" + b);
//		System.out.println("문자열 int값 변환 : " + i);
//		System.out.println(b);
		
		
		// 한글깨짐 확인 코드 !!!!!!
		
		
	}

}
