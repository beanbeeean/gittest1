package ch11;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String 선언 방식
		// heap 메모리에 인스턴스로 생성되는 경우
		String str1 = new String("abc");
		// data, static, constant pool 에 위치한다.
		String str2 = "abc";
		
		String str3 = "abc";
		
		
		System.out.println(str1 == str2);
		System.out.println("------------");
		System.out.println(str2 == str3);
		
		String str4 = new String("abc");
		String str5 = new String("abc");
		
		System.out.println("-------------");
		System.out.println(str4 == str5);

		System.out.println("-------------");
		
		String str6 = "abc";
		String str7 = "abc";
		
		System.out.println(str6 == str7);
		
		// 결론 : 힙메모리는 생성될때마다 다른 주소값을 가지지만,
		// 상수 풀에 생성된 문자열은 모두 같은 주소값을 가진다.(같은 문자열일 경우)
		
		
	}

}
