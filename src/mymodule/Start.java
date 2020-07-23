package mymodule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Start extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStartMatch = new JButton("Start Match");
		btnStartMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				UpdatedTeam1.main(new String[] {});
			
			}
		});
		btnStartMatch.setBounds(181, 102, 89, 23);
		contentPane.add(btnStartMatch);
		
		JLabel lblNewLabel = new JLabel("India vs Pakistan");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(160, 11, 190, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIn = new JLabel("India won the toss and choose to bat");
		lblIn.setBounds(130, 62, 271, 14);
		contentPane.add(lblIn);
		
		JLabel lblOdi = new JLabel("ODI 2 of 3 (Ind wins 1-0)");
		lblOdi.setBounds(160, 37, 231, 14);
		contentPane.add(lblOdi);
	}
}
