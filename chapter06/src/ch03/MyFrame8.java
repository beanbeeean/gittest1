package ch03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BorderLayout borderLayout;
	JButton button1;
	JButton button2;
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	MyImagePanel imagePanel;

	JPanel jPanel;

	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마리오");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		try {
			backgroundImage = ImageIO.read(new File("back12.jpg"));
			imageIcon1 = ImageIO.read(new File("mario4.png"));
		} catch (Exception e) {
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}
		borderLayout = new BorderLayout();
		imagePanel = new MyImagePanel();

		jPanel = new JPanel();

		button1 = new JButton("Start");
		button2 = new JButton("Stop");

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);

		jPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		jPanel.setPreferredSize(new Dimension(500, 100));

		this.add(jPanel, borderLayout.SOUTH);
		jPanel.add(button1);
		jPanel.add(button2);

	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				System.out.println("e : " + xPoint);
				
				int keyCode = e.getKeyCode();
				
				if (keyCode == KeyEvent.VK_UP) {
					yPoint = (yPoint < 0) ? yPoint = 0 : yPoint - 10;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint > 320) ? yPoint = 320 : yPoint + 10;
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint < 0) ? xPoint = 0 : xPoint - 10;
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint > 440) ? xPoint = 440 : xPoint + 10;
				}
				
				repaint();
			}

		});

	}

	// 내부 클래스

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 40, 40, null);
		}
	}

	public static void main(String[] args) {
		new MyFrame8();

	}

} // end of class
