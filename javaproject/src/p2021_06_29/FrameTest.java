package p2021_06_29;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
	
    private Frame f;			// 필드

    public FrameTest() {	// 생성자		 // 창 프레임
		f = new Frame( "Frame Test" );	 // 타이틀 바에 출력
		f.setSize( 400, 300 );			 // 창크기
		f.setLocation( 100, 100 );		// 초기 위치값 (좌측상단)
		f.setBackground( Color.green );
		f.setVisible( true );
		f.setResizable(false);    

	f.addWindowListener( new WindowAdapter() {	// 창을 닫는 코드
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
    });

	}//생성자 end

    public static void main( String[] args ) {
		FrameTest ft = new FrameTest();		//생성자 호출 코드
    }
}