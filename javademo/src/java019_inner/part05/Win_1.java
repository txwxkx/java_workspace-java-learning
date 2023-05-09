package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Win_1 extends Frame {
	
	public Win_1() {
		setSize(500, 500);
		setVisible(true);
		
		WindowExit exit = new WindowExit();
		this.addWindowListener(exit); //this.가 가르키는건 Frame
	}
	
	class WindowExit implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//시스템 종료
			System.exit(-1);			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}//end WindowListener
	
	public static void main(String[] args) {
		new Win_1();
	}

}
