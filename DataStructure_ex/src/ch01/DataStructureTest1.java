package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int grade;
}

public class DataStructureTest1 {

	public static void main(String[] args) {

		List list0;

		// 순서가 있고(인덱스) 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> members = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();

		// 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		// 값 추가 방법
		list.add(3); // index 0
		list.add(null); // index 1
		list.add(1, 10); // index 1 에 10을 삽입한다. (null은 index 2번으로 밀려난다.)

		System.out.println("값 확인 : " + list);

		// 값 삭제 방법
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);

		// 값 전체를 삭제
		// list.clear();
		// System.out.println("값 삭제 확인 : " + list);

		// (인덱스) 값 출력 방법
		System.out.println("값 출력 방법 : " + list.get(1));

		for (Integer i : list) {
			System.out.println("for 사용방법 : " + i);
		}

		// while 사용방법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것.
		Iterator<Integer> iter = list.iterator();

		// true, false
		while (iter.hasNext()) {
			System.out.println("while 사용방법 : " + iter.next());
		}

		// 값 검색 방법

		System.out.println(list.contains(1));
		System.out.println(list.contains(10));

		// 값이 있으면 인덱스의 번호를 반환, 없으면 -1을 반환하는 녀석.

		System.out.println(list.indexOf(10)); // 1번째 인덱스에 있다.
		System.out.println(list.indexOf(300)); // 없으면 -1 반환
		System.out.println(list.indexOf(3)); // 0번째 인덱스

		// 문제1
		ArrayList<String> names = new ArrayList<String>();

		// 스캐너 사용
		// 이름을 입력하면 names 리스트에 저장. while
		// 0번 누르면 종료
		// 화면에 입력한 이름들을 뿌려주세요.
		Scanner sc = new Scanner(System.in);
		String x;
		
		do {
			x = sc.nextLine();
			names.add(x);
			System.out.println("등록된 이름 : " + names);			
		} while (x != "");
		
		
	}

}
