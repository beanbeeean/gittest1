package ch06;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		hAnimal.move();
		System.out.println("--------------");
		tAnimal.move();
	}
}
