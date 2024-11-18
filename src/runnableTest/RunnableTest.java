package runnableTest;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.JFrame;

public class RunnableTest {
	public static void main(String[] args) {
		DAO dao = new DAO(); // 따라서 여기서 미리 할당해두어야함
		
		HashMap<String, Runnable> actions = new HashMap<String, Runnable>();
		actions.put("추가", dao::methodA); //여기서 메서드 참조를 하려면 클래스가 아니라 불러온 인스턴스가 필요 (위의 dao할당 필요)
		actions.put("삭제", dao::methodB);
		actions.put("수정", dao::methodC);
		// 각각 insert, delete, update 라는 키와 method가 연결된 map
		// 새로운 method가 필요하면 여기에 추가
		JFrame frame = new JFrame();
		
		frame.setSize(new Dimension(1000,1000));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		CustomJButton insertJButton = new CustomJButton("추가", actions);
		CustomJButton deleteJButton = new CustomJButton("삭제", actions);
		CustomJButton updateJButton = new CustomJButton("수정", actions);
		// 여기에 버튼 추가
		frame.add(insertJButton);
		frame.add(deleteJButton);
		frame.add(updateJButton);
		
		frame.setVisible(true);
	}
}	// 이 방법은 JButton의 이름과 listener의 method를 연결시킨 방법
	// JButton의 이름을 잘 조절해야함
