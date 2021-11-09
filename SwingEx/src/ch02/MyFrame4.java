package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {

	JButton button;
	JButton button2;

	// 코드 수정
	// 1. 버튼2 생성
	// 2. add,
	// 3. 이벤트 리스너 등록 --> 익명 구현 객체를 사용해서 처리
	// 4. 실행확인

	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("익명구현객체 사용해보기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("버튼 2");

	}

	private void setInitLayout() {
		setVisible(true);
		add(button, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
	}

	private void addEventListener() {

		ActionListener ac = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 됨");
				System.out.println("추후 알아서 구분 코드 작성해주세요.");
			}
		};

		// 익명 구현 객체
		// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수있다.

		button.addActionListener(ac);
		button2.addActionListener(ac);

//		button2.addActionListener(new ActionListener() {
//			  public void actionPerformed(ActionEvent e) {
//				  System.out.println("버튼2가 클릭되었습니다.");
//		}
//		});

//		button.addActionListener(new ActionListner() {	
//			// 추상 메서드를 일반 메서드로 구현했다.
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
	} // end of addEventListener

	public static void main(String[] args) {
		// MyFrame4 mf = new MyFrame4();
		// mf.button.setText("안녕하세요");

		// 익명 클래스 (인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할 수는 없다.
		new MyFrame4();

	}

}

