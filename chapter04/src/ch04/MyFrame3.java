package ch04;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {

	private Image image;
	// 멤버 변수선언 이미지명을 받는 녀석

	// 변수를 대입할 수 있다는 것 ! 항상 활용해보기
	public ImagePanel(String Name) {
		image = new ImageIcon(Name).getImage();
	}

	public ImagePanel() {
		image = new ImageIcon("image.jpg").getImage(); // 루트 경로 내에 저장(해당 Java Project 파일)
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}
////////////////////////////////////////////////////////////////////////////////

public class MyFrame3 extends JFrame {

	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;
	// 추가
	// 수정

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Jpanel에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel("image.jpg");
		imagePanel2 = new ImagePanel("image2.jpg");
		button = new JButton("버튼입니다.");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		add(imagePanel);
		add(imagePanel2);

		imagePanel.add(button);
	}

	public static void main(String[] args) {
		new MyFrame3();
	} // end of main

} // end of class
