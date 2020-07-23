import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;

//Owner: Manikandan K// 
public class ActiveSpin extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	
	int i;
	String a[];
	String b[];
	JComboBox comboBox;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActiveSpin frame = new ActiveSpin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public ActiveSpin() throws InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String spin2values[]= {"6", "0", "Bowled", "1", "2", "Wide", "4", "2", "LegBye", "NoBall", "0", "4"};
		//textField_1.setText("Spin 2"+" "+spin2values[2]);
		
		JComboBox comboBox = new JComboBox(spin2values);
		comboBox.setBounds(41, 26, 96, 22);
		contentPane.add(comboBox);
		comboBox.setSelectedItem(null);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String value=comboBox.getSelectedItem().toString();
				
				
				textField_1.setText("Spin 2"+" "+value);
				textField_2.setText(value);
		
				
			}
		});
		
		
		
		String spin3values[]= {"NoBall", "6", "4", "0", "0"};
		JComboBox comboBox_1 = new JComboBox(spin3values);
		comboBox_1.setBounds(168, 26, 77, 22);
		contentPane.add(comboBox_1);
		comboBox_1.setSelectedItem(null);
		
		JLabel lblSpin = new JLabel("Spin 2");
		lblSpin.setForeground(Color.RED);
		lblSpin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpin.setBounds(62, 1, 48, 14);
		contentPane.add(lblSpin);
		
		JLabel lblSpin_1 = new JLabel("Spin 3");
		lblSpin_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpin_1.setForeground(Color.RED);
		lblSpin_1.setBounds(183, 1, 48, 14);
		contentPane.add(lblSpin_1);
		
//		JButton btnNewButton = new JButton("Select");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) 
//			{
//			
//					String value=(String) comboBox.getSelectedItem();
//					textField_1.setText("Spin 2"+" "+value);
//					textField_2.setText(value);
//			
//				
//							
//			}
//		});
//		btnNewButton.setBounds(48, 81, 89, 23);
//		contentPane.add(btnNewButton);
//		
//		String tryy[]= {"USA", "India", "UK", "Russia", "China"};
//		
//		
//			ArrayList<String> al = new ArrayList<String>();
//			al.add(tryy[0]);
//			al.add(tryy[1]);
//			al.add(tryy[2]);
//			al.add(tryy[3]);
//			al.add(tryy[4]);
//			
//			Iterator< String> it = al.iterator();
//			while(it.hasNext())
//			{
//			System.out.println(it.next());
//					
//			}
//		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(41, 129, 96, 59);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIpRecevier = new JLabel("I/P Recevier");
		lblIpRecevier.setBounds(62, 199, 75, 14);
		contentPane.add(lblIpRecevier);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 230, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTransmitter = new JLabel("Transmitter");
		lblTransmitter.setBounds(183, 261, 72, 14);
		contentPane.add(lblTransmitter);
		
		table = new JTable();
		table.setBounds(190, 87, 1, 1);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(190, 113, 77, 1);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table_2.setBounds(347, 87, -101, 101);
		contentPane.add(table_2);
		
		

		
		
		
		
		
		
		
		
		
		
	}
}
