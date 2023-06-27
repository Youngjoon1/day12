package Quiz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends Thread {

	public static void main(String[] args) {

		
		boolean bool = true;

		JFrame frame = new JFrame("시간");

		//틀 생성
		Container c = frame.getContentPane();

		//내용생성
		JLabel label = new JLabel("test gui");
		c.add(label);
		label.setFont(new Font(null, 0, 50));
		//글꼴 , 스타일, 크기
		label.setHorizontalAlignment(JLabel.CENTER);

		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();//프레임 사이즈 설정

		frame.setVisible(true);

		//종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		SimpleDateFormat ss = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 ss초");
		
		while(true) {
		String time = ss.format(new Date());
		label.setText(time);
		}
	}

}
