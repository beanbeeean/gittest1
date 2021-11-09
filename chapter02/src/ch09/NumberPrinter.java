package ch09;

public class NumberPrinter {

	private int id;
	private static int waitNumber = 1;
	
	public NumberPrinter(int id) {
		this.id = id;
	}
	// 번호표를 찍기
	public void printWaitNumber() {
		System.out.println(id + " 기기의 대기 순번 : " + waitNumber);
		waitNumber++;
	}
}
