package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 한번 생성된  string 불편(immuatable)
		
		// String을 연결하면 기존의 String 에 연결되는 것이 아닌
		// 새로운 문자열이 생성된다.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		System.out.println("---------------------------");
		
		// java = java + android;
		java = java.concat(android);
		System.out.println(java); //javaAndroid
		
		System.out.println(System.identityHashCode(java));

	}

}
