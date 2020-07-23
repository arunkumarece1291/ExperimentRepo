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
import javax.swing.JTextField;

public class Startmatch1 extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1 ;
public	static  JLabel lblNewLabel_2;
public   JTextField textField;
public JTextField textField_1;
private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startmatch1 frame = new Startmatch1();
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
	public Startmatch1() {
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
		
			textField_1 = new JTextField();
			textField_1.setBounds(595, 262, 86, 20);
			contentPane.add(textField_1);
			textField_1.setEditable(false);
			textField_1.setColumns(10);


		
		
		JButton btnNewButton_1 = new JButton("2 nd INNINGS SCORECARD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cricket_App1 c1=new Cricket_App1();
					c1.textField_1.setText(textField_1.getText());
					c1.setVisible(true);
					dispose();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				
					lblNewLabel_1.setText("Match Started 2nd Innings is Running");
					
					
			
				
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
		
		lblNewLabel_3 = new JLabel("TARGET");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(519, 264, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
		
	}
}
