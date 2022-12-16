package java021_network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//서버에는 각 클라이언트가 보낸 정보가 필요. 클라이언트 => 서버 => 클라이언트
//클라이언트에게는 스레드가 두개 필요. 입력 스레드 1, 출력 스레드 1

public class Java221_ChatClient implements ActionListener, Runnable {

	String host;
	int port;
	String userName;
	private JFrame frm;
	private JPanel pan;
	private JTextArea taOutput;
	private JLabel lbName;
	private JTextField tfInput;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	Thread th;
	
	public Java221_ChatClient(String host, int port) {
		this.host = host;
		this.port = port;
		
		System.out.printf("사용자 이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		userName = sc.nextLine();
		if (userName.equals(""))
			userName = "guest";
		
		initComponent();
		
	}//end Java221_ChatClient()
	
	private void initComponent() {
		frm = new JFrame("채팅 프로그램 [" + host + ":" + port + "]");
		taOutput = new JTextArea();
		taOutput.setEditable(false);

		tfInput = new JTextField(10);
		pan = new JPanel();
		lbName = new JLabel("입력: ");

		JScrollPane scroll = new JScrollPane(taOutput);

		frm.add(BorderLayout.CENTER, scroll);
		frm.add(BorderLayout.SOUTH, pan);

		pan.setLayout(new BorderLayout());
		pan.add(lbName, BorderLayout.WEST);
		pan.add(tfInput, BorderLayout.CENTER);
		
		tfInput.addActionListener(this);

		frm.setSize(400, 400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				stop();
			}
		});
	}// end initComponent()////////////////////////////
	
	private void stop() {
		if(th!=null) {
			th.interrupt();
			th=null;
			try {
			    dataIn.close();
				dataOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		frm.setVisible(false);
		frm.dispose();
		System.exit(0);
	}// end stop()/////////////////////////////////////
	
	//서버와 연결
	private void iniStart() {
		Socket socket = null;
		try {
			socket = new Socket(host, port);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			dataIn = new DataInputStream(new BufferedInputStream(is));
			dataOut = new DataOutputStream(new BufferedOutputStream(os));
								
		} catch (IOException e) {
			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		th = new Thread(this);
		th.start();
		
	}//end iniStart()	
		
	public static void main(String[] args) {
		Java221_ChatClient client = new Java221_ChatClient("172.16.142.25", 7777);
		client.iniStart();
		
	}//end main()

	@Override
	public void actionPerformed(ActionEvent e) {
		String Message = userName + " : " + e.getActionCommand();
		
		try {
			//서버로 메세지 보냄
			dataOut.writeUTF(Message);
			dataOut.flush();
			
			//입력창 초기화
			tfInput.setText("");
			tfInput.requestFocus();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}//end actionPerformed()

	@Override
	public void run() {
		System.out.println("메세지 수신 대기중");
		while(!Thread.interrupted()) {
			try {
				String line = dataIn.readUTF();
				taOutput.append(line + "\r\n");
			} catch (IOException e) {
				break;
			}
			
		}
	}//end run()//////////////////////////////////////

}//end class
