package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {

	// �߰��ϴ� ���
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;
		boolean flag = true;

		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : ");
		name = s.nextLine();
		System.out.println("�ּ� : ");
		address = s.nextLine();
		System.out.println("��ȭ��ȣ : ");
		telephone = s.nextLine();

		phone = new Phone(name, address, telephone);
		map.put(phone.name, phone);

	}

	// ����
	public static void delete(HashMap<String, Phone> map) {

		// key�� �̸��� �Է¹޾Ƽ� ��� \
		String userInput;
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : ");
		userInput = s.next();
		if (map.containsKey(userInput)) {
			map.remove(userInput);
		} else {
			System.out.println(userInput + "�� ��ϵ��� ���� ����Դϴ�.");
		}
	}

	// ã��
	public static void search(HashMap<String, Phone> map) {

		// key�� �̸��� �Է¹޾Ƽ� ���
		String userInput;
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : ");
		userInput = s.next();
		if (map.containsKey(userInput)) {
			System.out.println(userInput + "  " + map.get(userInput).telephone);
		} else {
			System.out.println(userInput + " �� ��ϵ��� ���� ����Դϴ�.");
		}

	}

	// ��ü ����

	public static void showInfo(HashMap<String, Phone> map) {

		// ȭ�鿡 ��ü������ �ѷ��ִ� ���

//		for (String key : map.keySet()) {
//			System.out.println("�̸� :" + key + " / �ּ� : " + map.get(key).address + " / ��ȭ��ȣ : " + map.get(key).telephone);
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

		map.put("ȫ�浿", new Phone("ȫ�浿", "�λ�", "010-1234-1234"));
		map.put("�̼���", new Phone("�̼���", "����", "010-1234-1234"));
//		// �޼��� �̿��غ���
//		insert(map);
//		showInfo(map);
//		search(map);

		// ������ �帧 ����� ����
		
		int menu;
		boolean flag = true;
		System.out.println("============");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("============");
		
		// ��ĳ�� �̿��ؼ�

		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("\n�߰� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");
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
				System.out.println("���α׷��� �����մϴ�.");
				flag = false;
			}
			default:
				
			}
		}

	}
}