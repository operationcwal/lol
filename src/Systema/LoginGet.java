package Systema;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginGet extends Frame implements ActionListener{
	public JPanel[] pa;
	public JLabel[] space;
	public JButton[] bn;
	public Image img;
	public JLabel la3,la4,la5;
	public Button b1, b2, b3,b4;
	public JTextField tf1,tf2;
	int i;

	public LoginGet(){
		bn = new JButton[10];
		pa = new JPanel[10];
		space = new JLabel[10];
		for(i = 0; i<bn.length;i++){
			bn[i] = new JButton();
		}
		b1 = new Button("출금");
		b2 = new Button("취소");
		bn[0] = new JButton("0");
		bn[1] = new JButton("1");
		bn[2] = new JButton("2");
		bn[3] = new JButton("3");
		bn[4] = new JButton("4");
		bn[5] = new JButton("5");
		bn[6] = new JButton("6");
		bn[7] = new JButton("7");
		bn[8] = new JButton("8");
		bn[9] = new JButton("9");
		tf1 = new JTextField("",20);
		la3 = new JLabel("★출금메뉴★");
		
		for (i = 0; i < space.length; i++) {
			space[i] = new JLabel();
		}
		for(i = 0; i< pa.length; i++){
			pa[i] = new JPanel();
		}
		

		add(pa[2],BorderLayout.NORTH);
		add(pa[0],BorderLayout.CENTER);
		add(pa[1],BorderLayout.SOUTH);
		
		
		pa[0].setLayout(new GridLayout(4,3,20,20));
		pa[0].add(bn[1]);
		pa[0].add(bn[2]);
		pa[0].add(bn[3]);
		pa[0].add(bn[4]);
		pa[0].add(bn[5]);
		pa[0].add(bn[6]);
		pa[0].add(bn[7]);
		pa[0].add(bn[8]);
		pa[0].add(bn[9]);
		pa[0].add(space[0]);
		pa[0].add(bn[0]);
		
		pa[1].add(b1);
		pa[1].add(space[2]);
		pa[1].add(b2);
		
		pa[2].setLayout(new GridLayout(2,1));
		pa[2].add(pa[4]);
		pa[2].add(pa[3]);
		
		pa[3].add(tf1);
		
		pa[4].add(la3);
		
/*		pa[5].setLayout(new BorderLayout());
		pa[5].add(pa[0],BorderLayout.CENTER);*/
	
		

		b2.addActionListener(this);
		
		setVisible(true);
		setSize(400,400);
		setLocation(810,390);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
		
	}
	public static void main(String args[]){
//		new LoginSet();
	}

	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	
		
	}
}
