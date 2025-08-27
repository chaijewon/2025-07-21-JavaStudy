package com.sist.client;
import javax.swing.*; // 윈도우 관련 API
import java.awt.*; // Layout => 배치 
import java.awt.event.*; // 이벤트 => 인터페이스 => Listener
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
/*
 *  new Runnable(()->{
 *     
 *  })
 *  
 *  let a=()=>{
 *  }
 */
public class ChatClientForm extends JFrame 
implements ActionListener,Runnable{
    JTextArea ta; // 채팅 문장열 출력 
    JTextField tf; // 채팅 문자열 전송 
    JButton b1,b2;
    String name; // [이름] 문자열
    // 네트워크 관련 
    Socket s;// 서버와 연결 
    BufferedReader in;// 서버에서 보낸 데이터 읽기
    OutputStream out; // 서버로 데이터 전송 
    public ChatClientForm()
    {
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	tf=new JTextField();
    	b1=new JButton("접속");
    	b2=new JButton("종료");
    	
    	// 배치 
    	setLayout(null);
    	js.setBounds(10, 15, 450, 500);
    	add(js);
    	tf.setBounds(10,520,300,30);
    	b1.setBounds(315, 520, 70, 30);
    	b2.setBounds(390, 520, 70, 30);
    	add(tf);add(b1);add(b2);
    	setSize(480, 600);
    	setVisible(true);
    	tf.setEnabled(false);
    	ta.setEditable(false);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	tf.addActionListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ChatClientForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			name=JOptionPane.showInputDialog("이름 입력:");
			try
			{
				s=new Socket("localhost",3355);
				out=s.getOutputStream();
				in=new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
			
			new Thread(this).start();
			// 서버에서 보내는 문자열을 받아서 채팅창에 출력 해라 
			b1.setEnabled(false);
			tf.setEnabled(true);
			tf.requestFocus();
		}
		else if(e.getSource()==b2)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			if(msg.length()<1)
			{
				return;
			}
			
			try
			{
				out.write(("["+name+"]"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			tf.setText("");
			tf.requestFocus();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 서버에서 들어오는 채팅문자열 처리
		try
		{
			while(true)
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
			}
		}catch(Exception ex) {}
	}

}
