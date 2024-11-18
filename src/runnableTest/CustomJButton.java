package runnableTest;

import java.util.Map;

import javax.swing.JButton;

public class CustomJButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomJButton(String name, Map<String, Runnable> actions) { // 버튼 이름, map을 매개변수로 받는 생성자 정의
		super(name); // 상속클래스는 상위생성자 먼저 호출, 여기서 상위 생성자는 JButton() 이므로 JButton(name) 인것
		
		this.addActionListener(e -> {
			Runnable action = actions.get(name); // hashMap의 구조가 JButton의 이름을 key로 Runnable(method)를 value로 가짐, 
			// 즉 버튼의 이름과 연결된 method를 action에 할당하는것과 같음
			
			if (action != null) {
				action.run(); // method 실행
			} else {
				System.out.println("이 버튼의 이름에 할당된 method가 없습니다.");
			}
		});	// actionlistener 말고 mouseListener이나 mouseMotionListener을 써서 버튼 전체에 무언가를 추가할 수도 있음
	}
}
