package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Win_2 extends Frame {
	
	public Win_2() {
		setSize(500, 500);
		setVisible(true);
		//WindowExit exit = new WindowExit();
		//this.addWindowListener(exit);
		
		this.addWindowListener(new WindowExit());
	}
	
	class WindowExit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(-1);
		}
	}

	public static void main(String[] args) {
		new Win_2();
				
		
	}//end main()

}//end class
