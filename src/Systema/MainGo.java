package Systema;

/*
 * pa0 ùȭ�� �г�
 * pa1 �����ڸ�� �α��� ȸ������ �г�
 * pa2 ���̵� ��й�ȣ �г�
 * pa4 ���̵� ��й�ȣ �г� 2
 * pa5 ���̵� ��й�ȣ �г� 3
 * pa6 ���̵� ��й�ȣ �г� 4
 * pa7 ���̵� ��й�ȣ �г� 5
 * p3 �����г�
 * 
 */

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Date.DBAction;

public class MainGo extends Frame implements ActionListener {
	public JPanel[] pa;
	public JLabel[] space;
	public cav cav1;
	public JLabel la1, la2, la3;
	public JButton b1, b2, b3;
	public JTextField tf1, tf2;

	int i;

	public MainGo() {

		cav1 = new cav();
		pa = new JPanel[10];
		space = new JLabel[10];
		la1 = new JLabel("���̵� : ");
		la2 = new JLabel("��й�ȣ : ");
		la3 = new JLabel("�ڡ�BankSytem�ڡ�");
		tf1 = new JTextField("", 10);
		tf2 = new JTextField("", 10);

		b1 = new JButton("�����ڸ��");
		b2 = new JButton("�α���");
		b3 = new JButton("ȸ������");
		for (i = 0; i < space.length; i++) {
			space[i] = new JLabel();
		}
		for (i = 0; i < pa.length; i++) {
			pa[i] = new JPanel();
		}

		pa[0].setLayout(new BorderLayout());
		pa[0].add(pa[3], BorderLayout.NORTH);
		pa[0].add(pa[2], BorderLayout.CENTER);
		pa[0].add(pa[1], BorderLayout.SOUTH);

		pa[1].add(b1);
		pa[1].add(space[1]);
		pa[1].add(b2);
		pa[1].add(space[2]);
		pa[1].add(b3);

		pa[2].setLayout(new GridLayout(1, 2));
		pa[2].add(cav1);
		pa[2].add(pa[4]);

		pa[3].add(la3);

		pa[4].setLayout(new GridLayout(2, 1));
		pa[4].add(pa[5]);
		pa[4].add(pa[6]);

		pa[5].add(la1);
		pa[5].add(tf1);

		pa[6].add(la2);
		pa[6].add(tf2);

		add(pa[0]);
		setLocation(810, 390);
		setSize(300, 300);
		setResizable(false);
		setVisible(true);

		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		new MainGo();

	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj.equals(b3)) {
			new Join();
		}
		if (obj.equals(b2)) {
			information();
		}

	}

	public void information() {
		DBAction db = DBAction.getInstance();
		Connection con = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		String id, pw;
		String sql;
		try {
			stmt = con.createStatement();
			sql = "SELECT * FROM bankuser where id='" + tf1.getText() + "'";
			rs = stmt.executeQuery(sql); // ����� ���ڵ带 ������

			if (rs.next()) {
				pw = rs.getString("pw");
				if (pw.equals(tf2.getText())) {
					new Login();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ����!");
		} finally {
			try {

				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class cav extends Canvas {
	public Image img;

	public cav() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		img = tool.getImage("C:/Users/mymin_000/Pictures/gold.jpg");
	}

	public void paint(Graphics g) {
		g.drawImage(img, 25, 40, 100, 100, this);
	}

}
