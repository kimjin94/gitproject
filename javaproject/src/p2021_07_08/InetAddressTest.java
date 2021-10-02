package p2021_07_08;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest implements ActionListener { 				// 상속받으면 오는 추상 메소드는 반드시 오버라이딩한다.
	private Frame f;
	private List list;
	private TextField tf;
	private InetAddress address;

	// constructor
	public InetAddressTest() {
		f = new Frame("InetAddress");
		list = new List(10);
		tf = new TextField(25); // 약 25자를 입력가능한 크기 설정

		// window 종료 이벤트 // 창닫기 기능
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Panel p = new Panel();
		p.add(new Label("HOST", Label.CENTER));
		p.add(tf);

		f.add(list, "Center");
		f.add(p, "South");
		f.setSize(300, 300); 			 // 창크기 설정
		f.setLocation(300, 300);		 // 좌상단 기준의로 300픽셸 떨어진 위치에 프레임을 위치 시킴
		f.setResizable(false); 			 // 크기변경 불가 true 값으로 설정하면 변경가능
		f.setVisible(true); 			 // 화면 출력
		tf.addActionListener(this);
	}// 생성자 end

	// 버튼 이벤트를 처리하는 메소드
	public void actionPerformed(ActionEvent ae) {				 // 추상메소드 오버라이딩을 반드시 해야한다.
		list.removeAll();
		// 텍스트 필드에 입력된 내용을 저장
		String name = tf.getText();// kbs.co.kr
		System.out.println("name = " + name);

		try {
			// Host 명을 받아들여 InetAddress 클래스 객체 생성
			address = InetAddress.getByName(name);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}

		// InetAddress 클래스에 정의된 메소드
		list.add("InetAddress : " + address);
		list.add("Host Name : " + address.getHostName());
		list.add("Host Address : " + address.getHostAddress());

		try {
			list.add("");
			list.add("LocalHost : " + InetAddress.getLocalHost());
			list.add("LocalHost Name : " + InetAddress.getLocalHost().getHostName());		// 사용자 컴퓨터 이름
			list.add("LocalHost address : " + InetAddress.getLocalHost().getHostAddress());	// 사용자 IP주소값
		} catch (UnknownHostException ue) {
			System.out.println(ue);
		}

		// 텍스트 필드에 값을 입력한 후 엔터를 치고 난 후 텍스트 필드를
		// 깨끗이 지우고 포커스를 텍스트 필드에 맞춘다.
		tf.setText("");
		tf.requestFocus();
	}

	public static void main(String[] args) {
		InetAddressTest it = new InetAddressTest();
	}
}
