package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�̹��� ��׶��� ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
		} catch (Exception e) {
			System.err.println("������ �����ϴ�."); // err -> �ܼ� â�� ���� ������ ǥ��
			System.exit(0); // ��ü ����Ǵ� �ڵ�
		}

		imagePanel = new MyImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// ���׿����ڷ� ����ؼ� �ڵ带 �ۼ��� �ּ���. // switch������ �ٲ㺸��
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					// yPoint -= 10;
					yPoint = (yPoint < -10) ? yPoint = -10 : yPoint - 10;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint += 10;
					yPoint = (yPoint > 390) ? yPoint = 390 : yPoint;
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint -= 10;
					if (xPoint < -20) {
						xPoint = -20;
					}
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint += 10;
					xPoint = (xPoint > 422) ? xPoint = 422 : xPoint;
				}

				repaint();
			} // end of keyPressed

		});
	}

	// ���� Ŭ����

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}

} // end of class
