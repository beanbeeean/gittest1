package ch11;

public class StringBuilderTest {

	public static void main(String[] args) {

		// StringBuilder, StringBuffer Ȱ��
		// ���������� �������� char[]�� ��� ������ ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� �����ϴ�.
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("---------------");
		builder.append(android);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		// ���� 1 append �޼��� ����ؼ� 3�� (�ּҰ� Ȯ���ϱ�)
		builder.append("�ȳ�");
		System.out.println(builder);
		builder.append("�ϼ�");
		System.out.println(builder);
		builder.append("��");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("===================");
		// ���� 2 
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
	}

}
