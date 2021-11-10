package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스를 선언한다.
interface CallbackBtnAction {
	public abstract void clickedAddBtn();

	public void clickedMinusBtn();

	// 메서드 3개 추가 생성
	public abstract void clickedMultiplyBtn();

	public void clickedDividedBtn();

	public abstract void clickedSquareBtn();

	// 매가변수로 값 전달 가능
	public void passValue(int value);

} // end of interface

// 콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의한다.
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
		// 콜백되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스 콜백 받았습니다.");
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
		System.out.println("value 값을 전달 받음 : " + value);
		label.setText(value + "");
	}

} // end of MainActivity

// 콜리 (호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	// 문제 1. 버튼 3개 생성
	JButton btnMultiply;
	JButton btnDivided;
	JButton btnSquare;
	JButton btnPassValue;

	// 1. 멤버 변수로 선언을 해 준다.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요 !!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnMultiply = new JButton("곱하기 버튼(*2)");
		btnDivided = new JButton("나누기 버튼(/2)");
		btnSquare = new JButton("제곱 버튼");
		btnPassValue = new JButton("값 전달 버튼");

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

		// 1. 버튼 구분
		JButton targetBtn = (JButton) e.getSource();
		if (targetBtn == btnAdd) {
			// 더하기 버튼
			callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus) {
			// 빼기 버튼
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
