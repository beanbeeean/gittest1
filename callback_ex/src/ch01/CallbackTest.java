package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �������̽��� �����Ѵ�.
interface CallbackBtnAction {
	public abstract void clickedAddBtn();

	public void clickedMinusBtn();

	// �޼��� 3�� �߰� ����
	public abstract void clickedMultiplyBtn();

	public void clickedDividedBtn();

	public abstract void clickedSquareBtn();

	// �Ű������� �� ���� ����
	public void passValue(int value);

} // end of interface

// �ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 �����Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);

	}

	@Override
	public void clickedAddBtn() {
		// �ݹ�Ǿ����� �޼��� :
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedMultiplyBtn() {
		count *= 2;
		label.setText(count + "");

	}

	@Override
	public void clickedDividedBtn() {
		count /= 2;
		label.setText(count + "");

	}

	@Override
	public void clickedSquareBtn() {

		count *= count;
		label.setText(count + "");

	}

	@Override
	public void passValue(int value) {
		System.out.println("value ���� ���� ���� : " + value);
		label.setText(value + "");
	}

} // end of MainActivity

// �ݸ� (ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ�� �Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	// ���� 1. ��ư 3�� ����
	JButton btnMultiply;
	JButton btnDivided;
	JButton btnSquare;
	JButton btnPassValue;

	// 1. ��� ������ ������ �� �ش�.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿� !!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnMultiply = new JButton("���ϱ� ��ư(*2)");
		btnDivided = new JButton("������ ��ư(/2)");
		btnSquare = new JButton("���� ��ư");
		btnPassValue = new JButton("�� ���� ��ư");

		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnMultiply);
		add(btnDivided);
		add(btnSquare);
		add(btnPassValue);

		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivided.addActionListener(this);
		btnSquare.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1. ��ư ����
		JButton targetBtn = (JButton) e.getSource();
		if (targetBtn == btnAdd) {
			// ���ϱ� ��ư
			callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus) {
			// ���� ��ư
			callbackBtnAction.clickedMinusBtn();
		} else if (targetBtn == btnMultiply) {
			callbackBtnAction.clickedMultiplyBtn();
		} else if (targetBtn == btnDivided) {
			callbackBtnAction.clickedDividedBtn();
		} else if (targetBtn == btnSquare) {
			callbackBtnAction.clickedSquareBtn();
		} else {
			callbackBtnAction.passValue(100);
		}

	}

}

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);

	}

}
