package ch03;

public class GenericPrinter <T>{

	// T라는 대체 문자를 사용한다. E - element, K - key
	// 자료형 매개변수 (type parameter)
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		// 
		return material.toString();
	}
	
}
