package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivityEx1 extends JFrame implements ActionListener{

	JButton btnAdd;
	JButton btnMinus;
	JButton btnReturn;
	JButton btnPlusH;
	
	CallbackBtn2 callbackBtn2;
	
	public SubActivityEx1(CallbackBtn2 callbackBtn2) {
		this.callbackBtn2 = callbackBtn2;
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnReturn = new JButton("�ʱ�ȭ ��ư");
		btnPlusH = new JButton("100 �߰� ��ư");
		
		add(btnAdd);
		add(btnMinus);
		add(btnReturn);		
		add(btnPlusH);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
	}
	
	private void addEventListener() {
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnReturn.addActionListener(this);
		btnPlusH.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnAdd) {
			callbackBtn2.clickedAddBtn();
		} else if (targetBtn == btnMinus) {
			callbackBtn2.clickedMinusBtn();
		} else if (targetBtn == btnReturn) {
			callbackBtn2.clickedReturnBtn();
		} else {
			callbackBtn2.plusHundred(100);
		}
		
	}
	
	
}
