package ch01;

class MyThread3 extends Thread{

	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread());
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}
		
	}
}

public class ThreadTest3 {
	
	//메인 쓰레드
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		// 작업자 3명 생성
		MyThread3 th1 = new MyThread3();
		MyThread3 th2 = new MyThread3();
		MyThread3 th3 = new MyThread3();
		// 작업을 시작시켜주세요.
		th1.start();
		th2.start();
		th3.run();
		
	} // end of main
	
} // end of class

