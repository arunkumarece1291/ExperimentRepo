package finalpkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class match extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					match frame = new match();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public match() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIndia = new JLabel("INDIA Vs PAKISTAN");
		lblIndia.setForeground(new Color(255, 102, 0));
		lblIndia.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblIndia.setBounds(256, 11, 224, 26);
		contentPane.add(lblIndia);
		
		JButton btnToss = new JButton("TOSS");
		btnToss.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnToss.setForeground(new Color(0, 0, 153));
		btnToss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("INDIA WON THE TOSS AND CHOOSE TO BAT FIRST");	
				
			}
		});
		btnToss.setBounds(275, 121, 89, 23);
		contentPane.add(btnToss);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(145, 155, 417, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnstInnings = new JButton("1st INNINGS");
		btnstInnings.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnstInnings.setForeground(new Color(0, 0, 153));
		btnstInnings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cricket_App.main(new String[] {});
			}
		});
		btnstInnings.setBounds(256, 231, 167, 23);
		contentPane.add(btnstInnings);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/ICC-Finals.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(0, 0, 662, 403);
		contentPane.add(lblNewLabel);
		
	}
}
