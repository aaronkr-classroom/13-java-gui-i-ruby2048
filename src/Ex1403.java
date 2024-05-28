import javax.swing.*;
import java.awt.*;

public class Ex1403 extends JFrame {
	public Ex1403() {
		setTitle("계산기");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롬돋음", Font.BOLD, 20));
		titlePanel.add(title);
		
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		JPanel btnJPanel1 = new JPanel();
		btnJPanel1.setBounds(0, 80, 300, 40);
		add(btnJPanel1);
		JButton plus = new JButton("+");
		btnJPanel1.add(plus);
		JButton minus = new JButton("-");
		btnJPanel1.add(minus);
		
		JPanel btnJPanel2 = new JPanel();
		btnJPanel2.setBounds(0, 120, 300, 40);
		add(btnJPanel2);
		JButton mult = new JButton("*");
		btnJPanel1.add(mult);
		JButton div = new JButton("/");
		btnJPanel1.add(div);
		
		JPanel resJPanel = new JPanel();
		resJPanel.setBounds(0, 160, 300, 40);
		add(resJPanel);
		JLabel lbl1 = new JLabel("결과값 : ");
		btnJPanel1.add(lbl1);
		JLabel lbl2 = new JLabel("");
		btnJPanel1.add(lbl2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1403();
	}

}
