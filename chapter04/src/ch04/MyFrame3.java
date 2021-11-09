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
	// ��� �������� �̹������� �޴� �༮

	// ������ ������ �� �ִٴ� �� ! �׻� Ȱ���غ���
	public ImagePanel(String Name) {
		image = new ImageIcon(Name).getImage();
	}

	public ImagePanel() {
		image = new ImageIcon("image.jpg").getImage(); // ��Ʈ ��� ���� ����(�ش� Java Project ����)
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
	// �߰�
	// ����

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Jpanel�� �̹��� �ֱ�");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel("image.jpg");
		imagePanel2 = new ImagePanel("image2.jpg");
		button = new JButton("��ư�Դϴ�.");

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
