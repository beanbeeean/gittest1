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
		setTitle("이미지 백그라운드 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다."); // err -> 콘솔 창에 빨간 문구로 표시
			System.exit(0); // 자체 종료되는 코드
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
				// 삼항연산자로 사용해서 코드를 작성해 주세요. // switch문으로 바꿔보기
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

	// 내부 클래스

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}

} // end of class
