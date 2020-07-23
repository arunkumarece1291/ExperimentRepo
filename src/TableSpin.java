import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class TableSpin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 * 
	 */
	
	
//	class MouseListenerExample extends JFrame implements MouseListener{  
//	    
//	    MouseListenerExample(){  
//	       addMouseListener(this);  
//	   
//	    }  
//	    public void mouseClicked(MouseEvent e) {  
//	      textField.setText(table.toString());  
//	    }
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}  
//	}
//	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableSpin frame = new TableSpin();
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
	public TableSpin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
//		table.addMouseWheelListener(new MouseWheelListener() {
//			public void mouseWheelMoved(MouseWheelEvent e) {
//			}
//		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				textField.setText(object[0][0]);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Values", "Pointer"},
				{"2", null},
				{"Wide", null},
				{"6", null},
				{"NoBall", null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setBounds(32, 63, 118, 80);
		contentPane.add(table);
		
		textField = new JTextField();
		textField.setBounds(32, 174, 118, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		//textField.setText(Object[0][0]);
	}
	}
