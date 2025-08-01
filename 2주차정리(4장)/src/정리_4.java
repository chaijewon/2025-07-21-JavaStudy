/*
 *   다중 조건문 = 선택문 
 *   형식)
 *            | 진입 
 *        if(조건문)
 *        {
 *            조건 true => 문장 수행 => 종료  
 *            조건 false 
 *        }        | 다음 조건문으로 이동 
 *        else if(조건문)
 *        {
 *            조건 true => 문장 수행 => 종료  
 *            조건 false 
 *        }        | 다음 조건문으로 이동 
 *        else if(조건문)
 *        {
 *            조건 true => 문장 수행 => 종료  
 *            조건 false 
 *        }        | 다음 조건문으로 이동 
 *        else
 *        {
 *            해당 조건이 없는 경우 => 수행 
 *        }
 *        한개의 문장만 수행 
 *        
 *        ==> 범위가 지정되면 다중조건문 
 *            범위가 없는 경우 switch
 *            -------------------- 키보드 값 
 *                                 게임 
 *        
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 정리_4 extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5;
    public 정리_4()
    {
    	// 초기화 => 생성자 
    	b1=new JButton("맛집");
    	b2=new JButton("레시피");
    	b3=new JButton("여행");
    	b4=new JButton("쇼핑");
    	b5=new JButton("예약");
    	
    	JPanel p=new JPanel();
    	p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
    	
    	add("North",p);
    	
    	setSize(450, 300);
    	setVisible(true);
    	// 버튼 클릭시에 처리 => 이벤트 등록 
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 정리_4();
	}
	// 버튼 클릭시 자동으로 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "맛집 버튼 클릭");
		}
		else if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(this, "레시피 버튼 클릭");
		}
	}

}
