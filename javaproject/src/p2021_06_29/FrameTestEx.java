package p2021_06_29;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTestEx extends Frame {

    public FrameTestEx() {
	
//	f = new Frame( "Frame Test" );
	super("Frame Test");	// 부모 클레스 생성자 호출

	addWindowListener( new WindowAdapter() {
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
        });
	
	setSize( 400, 300 );
	setLocation( 100, 100 );
	setBackground( Color.green );
	setVisible( true );
    }//생성자 end

    public static void main( String[] args ) {
		FrameTestEx ft = new FrameTestEx();
    }
}