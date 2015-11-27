package Systema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.*;

public class Join extends Frame implements ActionListener {
	public JPanel[] pa;
	public JLabel[] space;
	public cav cav1;
	public JLabel la1, la2, la3, la4, la5;
	public JButton b1, b2, b3;
	public JTextField tf1, tf2, tf3, tf4;
	public String[] infoid, infoname, infopas;
	String[] arg = new String[10];
	int i ;

	public Join() {
		pa = new JPanel[10];
		space = new JLabel[10];
		la1 = new JLabel("★★회원가입★★");
		la2 = new JLabel("아이디 : ");
		la3 = new JLabel("이름 :  ");
		la4 = new JLabel("비밀번호 : ");
		la5 = new JLabel("재입력 : ");

		tf1 = new JTextField("", 10);
		tf2 = new JTextField("", 10);
		tf3 = new JTextField("", 10);
		tf4 = new JTextField("", 10);

		b1 = new JButton("가입하기");
		b2 = new JButton("취소");
		b3 = new JButton("Test");

		for (i = 0; i < space.length; i++) {
			space[i] = new JLabel();
		}
		for (i = 0; i < pa.length; i++) {
			pa[i] = new JPanel();
		}

		add(pa[0], BorderLayout.NORTH);
		add(pa[1], BorderLayout.CENTER);
		add(pa[2], BorderLayout.SOUTH);

		pa[0].add(la1);

		pa[1].add(pa[3]);

		pa[2].add(b1);
		pa[2].add(space[0]);
		pa[2].add(b2);
		pa[2].add(b3);

		pa[3].setLayout(new GridLayout(4, 2));
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
		setLocation(810, 390);
		setSize(400, 400);
		setResizable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});

	}

	public static void main(String ags[]) {
		new Join();
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String id = tf1.getText();
		String name = tf2.getText();
		String pas = tf3.getText();
		String repas = tf4.getText();
		i=0;
		
		
		if (obj.equals(b2)) {
			setVisible(false);
		}
		if (obj.equals(b1)) {
			arg[i] = id;
		}
		if (obj.equals(b3)) {
			for(i=0 ; i<10 ; i++){
			System.out.println(arg[i]);
			}
			
			}
			
				
		

	}

}
