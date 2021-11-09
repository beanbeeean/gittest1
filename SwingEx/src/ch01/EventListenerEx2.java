package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends SuperMyFrame implements ActionListener {

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	@Override
	protected void initData() {
		setTitle("이벤트 리스너 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("이벤트 버튼 1");
		button2 = new JButton("이벤트 버튼 2");

	}

	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}

	@Override
	protected void addEventListener() {

		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌러 졌습니다.");
		JButton clickedButton = (JButton) e.getSource();
		if (e.getSource() == "이벤트 버튼 1") { // if(clickedButton.getText().equals(button1.getText()))
			System.out.println("1번 버튼이 클릭되었습니다.");
		} else {
			System.out.println("2번 버튼이 클릭되었습니다.");
		}

		System.out.println(clickedButton.getText());
	}
}

public class EventListenerEx2 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
