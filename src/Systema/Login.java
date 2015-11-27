package Systema;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener{
	public JPanel[] pa;
	public JPanel ps;
	public JLabel[] space;
	public JButton[] bn;
	public Image img;
	public JLabel la1,la2,la3,la4,la5;
	public JButton b1, b2, b3,b4;
	public JTextField tf1,tf2;
	int i;
	public Login(){
		ps = new JPanel();
		pa = new JPanel[100];
		space = new JLabel[10];
		b1 = new JButton("입금");
		b2 = new JButton("출금");
		b3 = new JButton("잔액조회");
		b4 = new JButton("회원정보변경");
		
		la1 = new JLabel("계좌");
		la2 = new JLabel("조회");
		la4 = new JLabel("안녕하십니까");
		la5 = new JLabel("★★BankSytem★★");
		
		
		for (i = 0; i < space.length; i++) {
			space[i] = new JLabel();
		}
		for(i = 0; i< pa.length; i++){
			pa[i] = new JPanel();
		}
		
		
		pa[1].add(la5);
		
		pa[2].add(pa[4]);
		
		pa[3].add(la4);
		
		pa[4].setLayout(new GridLayout(2,2));
		pa[4].add(b1);
		pa[4].add(b2);
		pa[4].add(b3);
		pa[4].add(b4);
		
		pa[5].setLayout(new BorderLayout());
		pa[5].add(pa[1],BorderLayout.NORTH);
		pa[5].add(pa[2],BorderLayout.CENTER);
		pa[5].add(pa[3],BorderLayout.SOUTH);
		//pa[1]~pa[5]까지는 로그인 됬을시 뜨는 상태창 입니다.
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);
		
		
		
		add(pa[5]);
		setVisible(true);
		setSize(300,200);
		setLocation(810,390);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
		
		
	}
	public static void main(String args[]){
		new Login();
	}
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj.equals(b1)){
			new LoginSet();
		}
		if(obj.equals(b2)){
			new LoginGet();
		}
		if(obj.equals(b4)){
			new JoinReset();
		}
			
		}
}
