package java019_inner.part05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Win_3 extends Frame {
	public Win_3() {
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
					
	}

	public static void main(String[] args) {
		new Win_3();

	}

}
