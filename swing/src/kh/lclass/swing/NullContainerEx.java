package kh.lclass.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hekko, press Buttos!");
		la.setLocation(130,50);
		la.setSize(200,20);
		c.add(la);
		
		for(int i = 1; i < 10; i ++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼생성
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b); //버튼을 켄텐트팬에 부착
		}
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
