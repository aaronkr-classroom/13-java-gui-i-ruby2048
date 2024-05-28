import javax.swing.*;
import java.awt.*;

public class Ex1404 extends JFrame {
	public Ex1404() {
		setTitle("계산기");
		setSize(300, 250);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롬돋음", Font.BOLD, 20));
		titlePanel.add(title);
		
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		JPanel btnJPanel = new JPanel();
		btnJPanel.setBounds(100, 80, 100, 80);
		
		btnJPanel.setLayout(new GridLayout(2, 2, 10, 5));
		add(btnJPanel);
		JButton plus = new JButton("+");
		btnJPanel.add(plus);
		JButton minus = new JButton("-");
		btnJPanel.add(minus);
		JButton mult = new JButton("*");
		btnJPanel.add(mult);
		JButton div = new JButton("/");
		btnJPanel.add(div);
		
		JPanel resJPanel = new JPanel();
		resJPanel.setBounds(0, 160, 300, 40);
		add(resJPanel);
		JLabel lbl1 = new JLabel("결과값 : ");
		btnJPanel.add(lbl1);
		JLabel lbl2 = new JLabel("");
		btnJPanel.add(lbl2);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1404();
	}

}