package ch02;

import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivityEx1 extends JFrame implements CallbackBtn2{

	JLabel label;
	int count;
	
	public MainActivityEx1() {	
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("∏ﬁ¿Œ");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel(count + "");
		add(label);
	}
	
	private void setInitLayout() {		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
	}
	

	@Override
	public void clickedAddBtn() {
		count++;
		label.setText(count + "");		
	}

	@Override
	public void clickedMinusBtn() {
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void clickedReturnBtn() {
		count = 0;
		label.setText(count + "");
	}

	@Override
	public void plusHundred(int value) {
		count += value;
		label.setText(count + "");
	}
	
}
