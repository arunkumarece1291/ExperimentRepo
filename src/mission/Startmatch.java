package mission;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Startmatch extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1 ;
public	static  JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startmatch frame = new Startmatch();
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
	public Startmatch() {
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360,1200 );
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNewLabel = new JLabel("");
		 lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setBackground(new Color(255, 0, 204));
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
			lblNewLabel.setBounds(459, 202, 432, 23);
			contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("TOSS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Match Started INDIA won the toss choose to BAT");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(577, 125, 149, 37);
		contentPane.add(btnNewButton);
		

		
		
		JButton btnNewButton_1 = new JButton("1 st INNINGS SCORECARD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String check=lblNewLabel.getText();
				if(check.equals("Match Started INDIA won the toss choose to BAT")) {
					lblNewLabel_1.setText("Match Started 1st Innings is Running");
					Cricket_App.main(new String[] {});
					dispose();
				}
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.setBounds(555, 299, 186, 23);
		contentPane.add(btnNewButton_1);
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(306, 333, 318, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(339, 390, 268, 14);
		contentPane.add(lblNewLabel_2);
		
	}
}
