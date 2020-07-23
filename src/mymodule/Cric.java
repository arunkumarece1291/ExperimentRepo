package mymodule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;

import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;


public class Cric extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_10;
	private JTextField textField;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_3;
	JButton btnClear;
	JButton btnLoad;
	int rowcount=0;
	int rc;
	int s3rowcount=0;
	int sno=1;
	private JScrollPane scrollPane_6;
	int count = 0;

	Timer tt=new Timer(1000,this);
	Timer tt1=new Timer(1000,this);
	Timer tt2=new Timer(1004,this);
	//private JButton btnLoad;
	Timer tt3=new Timer(9000,this);
	Timer tt4=new Timer(9004,this);
	/**
	* Launch the application.
	*/
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	Cricket frame = new Cricket();
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
	public Cric() {
	tt.start();
	tt2.start();
	tt3.start();
	tt4.start();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(0, 0, 1200, 900);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(41, 32, 138, 262);
	contentPane.add(scrollPane);

	table = new JTable();
	scrollPane.setViewportView(table);
	Object col1[]= {"spin 2"};
	DefaultTableModel df=(DefaultTableModel) table.getModel();
	df.setColumnIdentifiers(col1);
	Object a[]= {"six"};
	Object b[]= {"dot"};
	Object c[]= {"bowled"};
	Object d[]= {"one"};
	Object e[]= {"two"};
	Object f[]= {"wide"};
	Object g[]= {"four"};
	Object h[]= {"two"};
	Object i[]= {"legbye"};
	Object j[]= {"noball"};
	Object k[]= {"dot"};
	Object l[]= {"four"};



	df.addRow(a);
	df.addRow(b);
	df.addRow(c);
	df.addRow(d);
	df.addRow(e);
	df.addRow(f);
	df.addRow(g);
	df.addRow(h);
	df.addRow(i);
	df.addRow(j);
	df.addRow(k);
	df.addRow(l);
	table.setModel(df);

	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(229, 32, 136, 264);
	contentPane.add(scrollPane_1);

	table_1 = new JTable();
	scrollPane_1.setViewportView(table_1);
	Object col2[]= {"spin 3"};
	DefaultTableModel df1=(DefaultTableModel) table_1.getModel();
	df1.setColumnIdentifiers(col2);
	Object a1[]= {"noball"};
	Object b1[]= {"six"};
	Object c1[]= {"four"};
	Object d1[]= {"dot"};
//	Object e1[]= {"dot"};
//	Object f1[]= {"wide"};
//	Object g1[]= {"six"};
//	Object h1[]= {"legbye"};
//	Object i1[]= {"two"};
//	Object j1[]= {"three"};
//	Object k1[]= {"one"};
//	Object l1[]= {"LBW"};

	df1.addRow(a1);
	df1.addRow(b1);
	df1.addRow(c1);
	df1.addRow(d1);
//	df1.addRow(e1);
//	df1.addRow(f1);
//	df1.addRow(g1);
//	df1.addRow(h1);
//	df1.addRow(i1);
//	df1.addRow(j1);
//	df1.addRow(k1);
//	df1.addRow(l1);

	
	table_1.setModel(df1);




	rc=table.getRowCount()-1;
	rowcount=rc;
	btnNewButton = new JButton("Spin 2");
	btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	if(rowcount==0) {

	table.addRowSelectionInterval(rowcount, rowcount);
	String value=table.getModel().getValueAt(rowcount, 0).toString();
	textField.setText("Spin 2: "+ value); //@@@@@
	rowcount=rc;
	}
	else {
	table.addRowSelectionInterval(rowcount, rowcount);
	String value=table.getModel().getValueAt(rowcount, 0).toString();
	textField.setText("Spin 2: "+value); //@@@@@
	rowcount=rowcount-1;
	}

	}
	});

	btnNewButton.setBounds(64, 313, 89, 23);
	contentPane.add(btnNewButton);

	btnNewButton_1 = new JButton("Spin 3");
	btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	if(s3rowcount==3) {
	table_1.addRowSelectionInterval(s3rowcount, s3rowcount);
	String value=table_1.getModel().getValueAt(s3rowcount, 0).toString();
	textField.setText("Spin 3: " +value);
	s3rowcount=0;

	}
	else {
	table_1.addRowSelectionInterval(s3rowcount, s3rowcount);
	String value=table_1.getModel().getValueAt(s3rowcount, 0).toString();
	textField.setText("Spin 3: " + value);
	s3rowcount=s3rowcount+1;
	}

	}
	});
	btnNewButton_1.setBounds(254, 313, 89, 23);
	contentPane.add(btnNewButton_1);


	scrollPane_6 = new JScrollPane();
	scrollPane_6.setBounds(479, 335, 244, 255);
	contentPane.add(scrollPane_6);

	table_10 = new JTable();
	scrollPane_6.setViewportView(table_10);
	Object col[]= {"sno","Data Warehouse"};
	DefaultTableModel data=(DefaultTableModel) table_10.getModel();
	data.setColumnIdentifiers(col);
	table_10.setModel(data);

	textField = new JTextField();
	textField.setBounds(164, 409, 130, 35);
	contentPane.add(textField);
	textField.setColumns(10);



	btnNewButton_3 = new JButton(" Data WareHouse");
	btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {


	//String ss = textField.getText();
	StringBuffer sx = new StringBuffer(textField.getText());
	sx.delete(0, 8);
	System.out.println(sx);
	
	Object dataarray[]= {sx};
	data.addRow(dataarray);
	if(table_10.getRowCount()==120) {
	tt.stop();
	tt1.stop();
	tt2.stop();
	tt3.stop();
	tt4.stop();
	}
	sno++;





	}
	});
	btnNewButton_3.setBounds(506, 295, 172, 23);
	contentPane.add(btnNewButton_3);
	
	JLabel lblInputRecevier = new JLabel("Input Recevier");
	lblInputRecevier.setBounds(191, 455, 111, 14);
	contentPane.add(lblInputRecevier);
	
	btnClear = new JButton("clear");
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			
			table_1.setModel(new DefaultTableModel(null, new Object[] {"Spin 3"}));
			
			count++;
		
		}
	});
	btnClear.setBounds(393, 42, 89, 23);
	contentPane.add(btnClear);
	
	btnLoad = new JButton("Load");
	btnLoad.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			
			if(count==1 || count==4 || count==7 || count==10 ||count==13||count==16)
			{
				table_1 = new JTable();
				scrollPane_1.setViewportView(table_1);
				Object col2[]= {"spin 3"};
				DefaultTableModel df1=(DefaultTableModel) table_1.getModel();
				df1.setColumnIdentifiers(col2);
				Object a1[]= {"dot"};
				Object b1[]= {"wide"};
				Object c1[]= {"six"};
				Object d1[]= {"legbye"};

				df1.addRow(a1);
				df1.addRow(b1);
				df1.addRow(c1);
				df1.addRow(d1);
			
				table_1.setModel(df1);
	
			}

			else if(count==2 || count==5 || count==8 ||count==11||count==14)
			{
				table_1 = new JTable();
				scrollPane_1.setViewportView(table_1);
				Object col2[]= {"spin 3"};
				DefaultTableModel df1=(DefaultTableModel) table_1.getModel();
				df1.setColumnIdentifiers(col2);
				Object a1[]= {"two"};
				Object b1[]= {"three"};
				Object c1[]= {"one"};
				Object d1[]= {"lbw"};

				df1.addRow(a1);
				df1.addRow(b1);
				df1.addRow(c1);
				df1.addRow(d1);

				
				table_1.setModel(df1);
			}

			else if(count==3||count==6 ||count==9 || count==12||count==15)
			{
				table_1 = new JTable();
				scrollPane_1.setViewportView(table_1);
				Object col2[]= {"spin 3"};
				DefaultTableModel df1=(DefaultTableModel) table_1.getModel();
				df1.setColumnIdentifiers(col2);
				Object a1[]= {"noball"};
				Object b1[]= {"six"};
				Object c1[]= {"four"};
				Object d1[]= {"dot"};

				df1.addRow(a1);
				df1.addRow(b1);
				df1.addRow(c1);
				df1.addRow(d1);

				
				table_1.setModel(df1);
			}

			
			
			
			
		}
	});
	btnLoad.setBounds(393, 82, 89, 23);
	contentPane.add(btnLoad);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub


	if(e.getSource()==tt) {
	tt1.start();
	btnNewButton.doClick();
	tt.stop();
	}
	if(e.getSource()==tt1) {
	tt.restart();
	btnNewButton_1.doClick();
	tt1.stop();
	}

	if(e.getSource()==tt2) {
	btnNewButton_3.doClick();
	}

	if(e.getSource()==tt3)
	{
		btnClear.doClick();
		//tt3.stop();
		
	}
	if(e.getSource()==tt4)
	{
		btnLoad.doClick();
		
	}
	
	}
	}

