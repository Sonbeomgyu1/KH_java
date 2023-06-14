package kh.lclass.chat_sever;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener {
	//컴파일 시 인식할 SeverGUI으로 만들어진 객체 고유 ID
	private static final long serialVersionUID = 1L;
	
	private JTextArea jta = new JTextArea(40, 25);  //채팅 창
	private JTextField jtf = new JTextField(25);  // 글 입력 부분
	private SeverBackground sb = new SeverBackground();
	public ServerGUI () {
		//생성자에서는 초기화 ( 즉 화면 초기화)
		setBounds(200, 100, 400, 600);  //창이 뜨는 위치
		setTitle("서버창");
		
		jta.setEditable(false);  //채팅창은 입력되지 않도록함
		jta.setFont(new Font("맑은고딕",Font.PLAIN, 18)); //글자 폰트 ,크기
		jta.setBackground(new Color(230, 255, 230));
		
		add(jta, BorderLayout.CENTER);  //센터에다가 보더레이아웃
		add(jtf, BorderLayout.SOUTH);  
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		sb.setGui(this);
		sb.setting();
		
	}
	
	//TODO 새 메시지를 받았을떄 메소드 호출됨.
	public void appendMsg(String msg) {
		// jta (채팅창)에 msg를 추가함.
		jta.append(msg);
		jta.append("\n");
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//입력창에 글 입력하고 enter key를 눌렀을떄 
		String msg = jtf.getText();
		System.out.println(msg);
		jtf.setText(""); //입력창 입력된 글을 초기화
		//TODO client 들에게 전달함.
				//입력창에 글 입력하고 enter key를 눌렀을떄 
	}
	
	
}
