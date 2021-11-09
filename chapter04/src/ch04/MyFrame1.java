package ch04;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	// ������
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	// �޼��� 2�� �����

	private void initData() {
		setTitle("java 2D Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		myPanel = new MyPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}

	// ���� Ŭ����, static (���� ���� Ŭ����), (�ν��Ͻ�, ����Ŭ����)
	static class MyPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);

//			g.drawString("�ȳ��ϼ���", 10, 20);
//			g.drawLine(20, 30, 100, 100); // ���� �ߴ�, x��, y�� 
//			g.drawRect(100, 100, 150, 150); // ����
			g.drawString("MyHouse", 275, 150);
			g.drawLine(300, 50, 150, 200);
			g.drawLine(300, 50, 450, 200);
			g.drawLine(150, 200, 450, 200);
			g.drawRect(200, 200, 200, 200);
			g.drawRect(330, 250, 50, 50);
			g.drawLine(330, 275, 380, 275);
			g.drawLine(355, 250, 355, 300);
			g.drawRect(220, 270, 75, 130);
			g.drawOval(275, 330, 10, 10);
			g.drawString("��", 20, 30);
			g.drawString("��", 120, 20);
			g.drawString("��", 50, 70);
			g.drawString("��", 300, 20);
			g.drawString("��", 400, 70);
			g.drawString("��", 520, 30);
			g.drawLine(0, 450, 600, 450);
			g.drawString("1st Ave", 275, 500);

		}
	}

	// �����Լ�
	public static void main(String[] args) {
		new MyFrame1();
	}
}
