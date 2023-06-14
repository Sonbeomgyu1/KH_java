package kh.lclass.chat_client;

import javax.swing.JOptionPane;

public class ClientRun {

	public static void main(String[] args) {
		// 사용자 nickName을 GUI를 통해서 입력받음.
		String nickname =JOptionPane.showInputDialog("닉네임을 입력해주세요");
		//닉네임을 정하는 창
		new ClientGUI(nickname); // 객체 생성-->생성자에 화면 초기화 + event등록
	}

}
