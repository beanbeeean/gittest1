package ch03;

public class GenericPrinter <T>{

	// T��� ��ü ���ڸ� ����Ѵ�. E - element, K - key
	// �ڷ��� �Ű����� (type parameter)
	
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
