package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		Computer computer = new DeskTop();
		computer.turnOn();
		computer.display();
		computer.typing();
		computer.turnOff();
		
		System.out.println("-----------------");
		
		NoteBook noteBook = new MyNoteBook();
		noteBook.turnOn();
		noteBook.display();
		noteBook.typing();
		noteBook.turnOff();
		
	}
}


