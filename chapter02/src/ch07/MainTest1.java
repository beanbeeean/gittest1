package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		// ��� ������ ���� Ȯ��
		// int balance >> 0
		// double >> 0.0
		// String >> null
		
		bank.deposit(10000);
		bank.showInfo();
		
		// ���
		int money = bank.withdraw(5000);
		System.out.println("���� ���� �ݾ� : " + money);
		bank.showInfo();
		
		// ��� ������ �ٷ� �����ؼ� �ܾ��� ������
		//bank.balance = 100000;
		bank.showInfo();
		
		// 
		// getter ,setter
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		bank.setBalance(-5);
		bank.showInfo();
		
		// ���� ���� ������
		// public 		������ ������ ����ϰ� �Ѵ�.
		// default		���� ��Ű�� ������ ������ ���
		// protected	��Ӱ��迡�� ������ ���
		// private		���� Ŭ���� ���Ͽ����� ������ ���
		
		
	}

}
