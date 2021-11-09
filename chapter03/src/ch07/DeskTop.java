package ch07;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("화면이 표시됩니다.");
		
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑을 합니다.");
		
	}

}
