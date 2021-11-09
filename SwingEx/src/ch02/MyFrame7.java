package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {
	
	
	
	JTextArea area;
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500 , 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
		//area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int a = e.getKeyCode();
				if(a == KeyEvent.VK_LEFT) {
					area.append("���� ����Ű\n");
				}else if(a == KeyEvent.VK_UP){
					area.append("���� ����Ű\n");
				}else if(a == KeyEvent.VK_RIGHT){
					area.append("������ ����Ű\n");
				}else if(a == KeyEvent.VK_DOWN){
					area.append("�Ʒ��� ����Ű\n");
				}else {
					area.append(e.getKeyCode() + "\n");
				}
			}
			});
	}
	
	// ���ڸ� ������ �� ȣ��, ����Ű���� �����մϴ�.
//	@Override
//	public void keyTyped(KeyEvent e) {
//		//System.out.println("keyTyped : " + e.getID());
//		
//	}
//
//	// Ű���带 ������ �� ȣ��, ��� Ű���忡 �����մϴ�.
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
//		// ���� ����Ű
//		// �Ʒ��� ����Ű
//		// ���� ����Ű
//		// ������ ����Ű
//		int a = e.getKeyCode();
//		if(a == KeyEvent.VK_LEFT) {
//			area.append("���� ����Ű\n");
//		}else if(a == KeyEvent.VK_UP){
//			area.append("���� ����Ű\n");
//		}else if(a == KeyEvent.VK_RIGHT){
//			area.append("������ ����Ű\n");
//		}else if(a == KeyEvent.VK_DOWN){
//			area.append("�Ʒ��� ����Ű\n");
//		}else {
//			area.append(e.getKeyCode() + "\n");
//		}
//	}
//
//	// Ű���带 ���� �� ȣ��, ��� Ű���忡 �����մϴ�.
//	@Override
//	public void keyReleased(KeyEvent e) {
//		//System.out.println("keyReleased : " + e.getID());
//		
//	}
}
