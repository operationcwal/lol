package Systema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class JoinReset extends Frame implements ActionListener {
	public JPanel[] pa;
	public JLabel[] space;
	public cav cav1;
	public JLabel la1,la2,la3,la4,la5;
	public JButton b1, b2, b3;
	public JTextField tf1,tf2,tf3,tf4;
	int i;

	public JoinReset(){
		pa = new JPanel[10];
		space = new JLabel[10];
		la1 = new JLabel("★★회원정보수정★★");
		la2 = new JLabel("아이디 : ");
		la3 = new JLabel("이름 :  ");
		la4 = new JLabel("비밀번호 : ");
		la5 = new JLabel("재입력 : ");
		
		tf1= new JTextField("",10);
		tf2= new JTextField("",10);
		tf3= new JTextField("",10);
		tf4= new JTextField("",10);
		
		b1 = new JButton("변경하기");
		b2 = new JButton("취소");
		
		
		for (i = 0; i < space.length; i++) {
			space[i] = new JLabel();
		}
		for(i = 0; i< pa.length; i++){
			pa[i] = new JPanel();
		}
		
		add(pa[0],BorderLayout.NORTH);
		add(pa[1],BorderLayout.CENTER);
		add(pa[2],BorderLayout.SOUTH);
		
		tf1.enable(false);
		
		pa[0].add(la1);
		
		pa[1].add(pa[3]);
		
		pa[2].add(b1);
		pa[2].add(space[0]);
		pa[2].add(b2);
		
		pa[3].setLayout(new GridLayout(4,2));
		pa[3].add(la2);
		pa[3].add(pa[4]);
		pa[3].add(la3);
		pa[3].add(pa[5]);
		pa[3].add(la4);
		pa[3].add(pa[6]);
		pa[3].add(la5);
		pa[3].add(pa[7]);
		
		pa[4].add(tf1);
		
		pa[5].add(tf2);
		
		pa[6].add(tf3);
		
		pa[7].add(tf4);
		
		setVisible(true);
		setLocation(810,390);
		setSize(400,400);
		setResizable(false);
		
		b2.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
		
	}
	public static void main(String ags[]){
	
	}
	public void actionPerformed(ActionEvent e) {
	Object obj = e.getSource();
	
	if(obj.equals(b2)){
		setVisible(false);
	}
		
	}
	
}
