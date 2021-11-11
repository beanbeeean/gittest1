package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// 추가하는 기능
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;
		boolean flag = true;

		Scanner s = new Scanner(System.in);
		System.out.println("이름 : ");
		name = s.nextLine();
		System.out.println("주소 : ");
		address = s.nextLine();
		System.out.println("전화번호 : ");
		telephone = s.nextLine();

		phone = new Phone(name, address, telephone);
		map.put(phone.name, phone);

	}

	// 삭제
	public static void delete(HashMap<String, Phone> map) {

		// key는 이름을 입력받아서 사용 \
		String userInput;
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : ");
		userInput = s.next();
		if (map.containsKey(userInput)) {
			map.remove(userInput);
		} else {
			System.out.println(userInput + "은 등록되지 않은 사람입니다.");
		}
	}

	// 찾기
	public static void search(HashMap<String, Phone> map) {

		// key는 이름을 입력받아서 출력
		String userInput;
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : ");
		userInput = s.next();
		if (map.containsKey(userInput)) {
			System.out.println(userInput + "  " + map.get(userInput).telephone);
		} else {
			System.out.println(userInput + " 은 등록되지 않은 사람입니다.");
		}

	}

	// 전체 보기

	public static void showInfo(HashMap<String, Phone> map) {

		// 화면에 전체정보를 뿌려주는 기능

//		for (String key : map.keySet()) {
//			System.out.println("이름 :" + key + " / 주소 : " + map.get(key).address + " / 전화번호 : " + map.get(key).telephone);
//		}

		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);
		}

	}

	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<String, Phone>();

		map.put("홍길동", new Phone("홍길동", "부산", "010-1234-1234"));
		map.put("이순신", new Phone("이순신", "서울", "010-1234-1234"));
//		// 메서드 이용해보기
//		insert(map);
//		showInfo(map);
//		search(map);

		// 실행의 흐름 만들어 보기
		
		int menu;
		boolean flag = true;
		System.out.println("============");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("============");
		
		// 스캐너 이용해서

		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("\n추가 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");
			menu = sc.nextInt();

			switch (menu) {
			case 0: {
				insert(map);
				break;
			}
			case 1: {
				delete(map);
				break;
			}
			case 2: {
				search(map);
				break;
			}
			case 3: {
				showInfo(map);
				break;
			}
			case 4: {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
			default:
				
			}
		}

	}
}