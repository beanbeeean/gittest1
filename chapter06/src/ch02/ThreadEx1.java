package ch02;

import java.util.Scanner;

class MyThread1 extends Thread{
	
	boolean flag = true;
	
	public MyThread1() {
		
	}
	
	@Override
	public void run() {
		while (flag) {
			System.out.print("-");
			
			try {		Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end of run
}

public class ThreadEx1 {

	public static void main(String[] args) {
		
		System.out.println("작업자를 생성하겠습니다.");
		
		// 메인 쓰레드 작업자를 요청해서 생성
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		System.out.println("0번을 입력하면 중지합니다.");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
//		if(userInput == 0) {
////			thread1.stop(); // deprecated (더이상 유지 보수 하지 않음)
//			thread1.flag = false;
//		}
		
		// 문제 3.
		// do while 사용해서 사용자가 한번 입력을 하더라도
		// 다시 입력을 받을 수 있게 코드를 만들어 주세요.
		int input;
		do {
			input = scanner.nextInt();
			if(input == 0) {
				thread1.flag = false;
			}
		} while (input != 0);
		
	}
}
