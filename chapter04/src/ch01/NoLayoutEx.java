package ch01;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame{
	
	ArrayList<JButton> buttons = new ArrayList<>();
	
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("NoLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		buttons.add(new JButton("1"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));
		// 2개 생성 
		buttons.add(new JButton("4"));
		buttons.add(new JButton("5"));
	}
	
	
	private void setInitLayout() {
		
		// 좌표값으로 컴포넌트 위치를 지정할때는
		setLayout(null);
		
		//2 버튼에 사이즈 설정 
		buttons.get(0).setSize(50, 50);
		buttons.get(1).setSize(150, 50);
		buttons.get(2).setSize(250, 50);
		buttons.get(3).setSize(50, 10);
		buttons.get(4).setSize(100,80);
		
		buttons.get(0).setLocation(10,10);
		buttons.get(1).setLocation(100,100);
		buttons.get(2).setLocation(200,200);
		buttons.get(3).setLocation(400,100);
		buttons.get(4).setLocation(200,300);
		
		// add
		// 3. add 메서드 사용
		add(buttons.get(0));
		add(buttons.get(1));
		add(buttons.get(2));
		add(buttons.get(3));
		add(buttons.get(4));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoLayoutEx();
		
	}
	
	
	
} // end of class
