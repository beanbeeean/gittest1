package ch01;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame 
implements ActionListener {

	BorderLayout borderLayout; 
	JPanel panel1; 
	JPanel panel2;
	JButton button1;
	JButton button2;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	@Override
	protected void initData() {
		super.initData();
		setTitle("�̺�Ʈ ������ ���� 3");
		setSize(500, 500);
		borderLayout = new BorderLayout();
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		button1 = new JButton("������");
		button2 = new JButton("�����");
	}
	
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		setLayout(borderLayout);
		
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);
		
		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);
		
		panel2.add(button1);
		panel2.add(button2);
	}
	
	@Override
	protected void addEventListener() {
		super.addEventListener();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 1 ��ư�̴��� ������ panal1 ������ ���������� ���� 
		// 2 ��ư�� ���� ������ panal1 ������ ��������� ���� 
		JButton button = (JButton)e.getSource();
		if(button.getText().equals(button1.getText())) {
			panel1.setBackground(Color.red);
		} else {
			panel1.setBackground(Color.yellow);
		}
	}
	
	// �����Լ� 
	public static void main(String[] args) {
		new ColorChangeFrame();
	}
	
} // end of class 







