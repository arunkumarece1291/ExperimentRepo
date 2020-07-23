package mission;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
//import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;






public class Cricket_App1 extends JFrame implements ActionListener{
static Rectangle rect1;
private JPanel contentPane;
public static JTable table;
private static JTable table_1;
private static JTable table_2;
static JLabel lblNewLabel;
private static JTable table_0;
static String  score1, score2, score3, score4, score5;
static RandomNumber random_number;
static RandomNumber1 random_number1;
    static int row, row1;
    private static JLabel lblSpin;
    static String SpinName1, SpinName2, SpinName3,SpinName4,SpinName5;
    static ArrayList alscore,al;
    static JTextField textField;
    static String  spinthree;
    private JFrame frame;
    static String strNew="";
    private JButton btnNewButton_2;
    private JTextField trans;
    private JTable table_13;
    int target=0;
private JButton btnNewButton_1;
private JTable table_3;
private JTable table_4;
private JTable table_6;
private JTable table_15;
static DefaultTableModel model2;
static int rowCount;
int count1=0;
JButton transbutton;
int wicketball;
int totalscore;
int scoreatwicket;
String o;
int m=0;
int runrate;
int totalwide,totalnoball=0;
private JScrollPane scrollPane_3;
int allout=0;
public static int count;
private JScrollPane scrollPane_11;
private JScrollPane scrollPane_12;
public static JTextField legbyescore;

static int p1id = 1, p2id = 2, TeamRun = 0, p1fours = 0, p2fours = 0, p1six = 0, p2six = 0, extras = 0, balls = 0,
pb1 = 0, pb2 = 0, wickets = 0, pb3 = 0,pb4 = 0,pb5 = 0,pb6 = 0,pb7 = 0,pb8 = 0,pb9 = 0,pb10 = 0,pb11=0,strike = 0, p1 = 0, p2 = 0,wide=0,noBall=0,legByes=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0,p11=0,p3fours = 0, p4fours = 0, p3six = 0, p4six = 0,p5fours = 0, p6fours = 0, p6six = 0, p5six = 0,p7fours = 0, p8fours = 0,p9fours = 0, p10fours = 0, p11fours = 0, p7six = 0, p8six = 0,p9six = 0, p10six = 0,p11six = 0;
static int overs = 0, srate1 = 0, srate2 = 0, legby = 0,srate3 = 0, srate4 = 0,srate5 = 0, srate6 = 0,srate7 = 0, srate8 = 0,srate9 = 0, srate10 = 0,srate11 = 0;

int striker=0;


JButton legbutton;
JButton hatrick;
JLabel wicket1;
JLabel wicket2;
JLabel wicket3;
JLabel wicket4;
JLabel wicket5;
JLabel wicket6;
JLabel wicket7;
JLabel wicket8;
JLabel wicket9;
JLabel wicket10;
int leg=0;

int count2;
int totalwicket=0;
int balltotal=0;
int b1s=0;
int b1wide=0;
int b1noball=0;
int b1dot=0;
int b1ballsbowled=0;
int b1wicket=0;
float b1economy=0f;


int b2s=0;
int b2wide=0;
int b2noball=0;
int b2dot=0;
int b2ballsbowled=0;
int b2wicket=0;
float b2economy=0f;


int b3s=0;
int b3wide=0;
int b3noball=0;
int b3dot=0;
int b3ballsbowled=0;
int b3wicket=0;
float b3economy=0f;
String tt;

int b4s=0;
int b4wide=0;
int b4noball=0;
int b4dot=0;
int b4ballsbowled=0;
int b4wicket=0;
float b4economy=0f;

int b5s=0;
int b5wide=0;
int b5noball=0;
int b5dot=0;
int b5ballsbowled=0;
int b5wicket=0;
float b5economy=0f;


static String score;
public static JTextField tscore;



/**
* Launch the application.
* 	 * @throws InterruptedException
*/






java.util.Timer myUtilTime= new Timer();
javax.swing.Timer tran= new javax.swing.Timer(3000,this);
javax.swing.Timer hat= new javax.swing.Timer(3000,this);
javax.swing.Timer ti= new javax.swing.Timer(1000,this);
javax.swing.Timer fini= new javax.swing.Timer(1000,this);
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {

	Cricket_App1 frame = new Cricket_App1();
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

// Values given in a static manner for spins 1 , 2 and 4
Object a[][] ={{"dot"},
{"four"},
{"wide"},
{"two"},
{"caught"},
{"three"},
{"noball"},
{"six"},
{"legbye"},
{"one"},
{"two"},
{"dot"}};

Object cd[][] ={{"six"},
{"dot"},
{"bowled"},
{"one"},
{"two"},
{"wide"},
{"four"},
{"two"},
{"legbye"},
{"noball"},
{"dot"},
{"four"}};


Object ef[][] ={{"LBW"},
{"dot"},
{"one"},
{"two"},
{"three"},
{"four"},
{"six"},
{"six"},
{"bowled"},
{"dot"},
{"dot"},
{"one"}};

String b []= {""};
private JTable table_5;
private JTextField overfield;
private JLabel lblNewLabel_7;
private JLabel extra;
private JTable table_7;
private JButton btnNewButton_3;
public  JTextField textField_1;



public Cricket_App1() throws InterruptedException  {
	
ti.start();
tran.start();
hat.start();
fini.start();
initialize();
}


private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(0, 00, 1390, 900);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

overfield = new JTextField();
overfield.setBounds(724, 320, 86, 20);
contentPane.add(overfield);
overfield.setColumns(10);

Startmatch1 sm1=new Startmatch1();

// Table: Spin 1
table_1 = new JTable();
table_1.setRowSelectionAllowed(false);
table_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
table_1.setModel(new DefaultTableModel(a,b));
table_1.setBorder(new LineBorder(Color.GRAY));
table_1.setBounds(28, 52, 85, 192);
contentPane.add(table_1);

JLabel lblSpin_1 = new JLabel("SPIN 1");
lblSpin_1.setFont(new Font("Tahoma", Font.BOLD, 14));
lblSpin_1.setBounds(28, 26, 52, 14);
contentPane.add(lblSpin_1);
SpinName1=lblSpin_1.getText();

// Table: Spin 2
table_2 = new JTable();
table_2.setRowSelectionAllowed(false);
table_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
table_2.setModel(new DefaultTableModel(cd,b));
table_2.setBorder(new LineBorder(Color.GRAY));
table_2.setBounds(119, 52, 85, 192);
contentPane.add(table_2);

JLabel lblSpin_2 = new JLabel("SPIN 2");
lblSpin_2.setFont(new Font("Tahoma", Font.BOLD, 14));
lblSpin_2.setBounds(109, 26, 63, 14);
contentPane.add(lblSpin_2);
SpinName2=lblSpin_2.getText();




textField = new JTextField();
textField.setBounds(88, 284, 107, 20);
contentPane.add(textField);

//Table: Spin 5
table = new JTable();
table.setEnabled(false);
table.setRowSelectionAllowed(false);
table.setFont(new Font("Tahoma", Font.PLAIN, 13));

table.setBorder(new LineBorder(Color.GRAY));
table.setBounds(421, 52, 85, 192);


contentPane.add(table);



textField_1 = new JTextField();
textField_1.setBounds(595, 25, 52, 20);
contentPane.add(textField_1);
textField_1.setEditable(false);
textField_1.setColumns(10);


 
 //target=Integer.valueOf(tt);
legbyescore = new JTextField();
legbyescore.setBounds(325, 477, 105, 29);
contentPane.add(legbyescore);
legbyescore.setVisible(false);
legbyescore.setColumns(10);

 legbutton = new JButton("Legbye");
 legbutton.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 		 Random ran=new Random();
		 count2=ran.nextInt(5);
		 table_0.addRowSelectionInterval(count2, count2);	
	     String text=table_0.getModel().getValueAt(count2, 0).toString();
	   
	     legbyescore.setText(text);

 	}
 });
 legbutton.setBounds(335, 526, 89, 23);
 legbutton.setVisible(false);
contentPane.add(legbutton);



 scrollPane_11 = new JScrollPane();
scrollPane_11.setBounds(330, 560, 107, 120);
contentPane.add(scrollPane_11);

table_0 = new JTable();
scrollPane_11.setViewportView(table_0);
Object col2[]= {"Legbye spin"};
DefaultTableModel df11=(DefaultTableModel) table_0.getModel();
df11.setColumnIdentifiers(col2);
Object a1[]= {"0"};
Object b1[]= {"1"};
Object c1[]= {"2"};
Object d1[]= {"3"};
Object e1[]= {"4"};
Object f1[]= {"runout"};

df11.addRow(a1);
df11.addRow(b1);
df11.addRow(c1);
df11.addRow(d1);
df11.addRow(e1);
df11.addRow(f1);
table_0.setModel(df11);






scrollPane_12 = new JScrollPane();
scrollPane_12.setBounds(446, 574, 105, 106);
contentPane.add(scrollPane_12);

table_6 = new JTable();
scrollPane_12.setViewportView(table_6);
Object col12[]= {"Hatrick wicket"};
DefaultTableModel df2=(DefaultTableModel) table_6.getModel();
df2.setColumnIdentifiers(col12);
Object a2[]= {"bowled"};
Object b2[]= {"stumped"};
Object c2[]= {"caught"};
Object d2[]= {"LBW"};
Object e2[]= {"runout"};


df2.addRow(a2);
df2.addRow(b2);
df2.addRow(c2);
df2.addRow(d2);
df2.addRow(e2);
table_6.setModel(df2);

trans = new JTextField();
trans.setBounds(325, 432, 112, 29);
contentPane.add(trans);
trans.setColumns(10);



wicket1 = new JLabel("");
wicket1.setBounds(700, 610, 100, 30);
contentPane.add(wicket1);

 wicket2 = new JLabel("");
wicket2.setBounds(810, 610, 100, 30);
contentPane.add(wicket2);
 wicket3 = new JLabel("");
wicket3.setBounds(920, 610, 100, 30);
contentPane.add(wicket3);
 wicket4 = new JLabel("");
wicket4.setBounds(1040, 610, 100, 30);
contentPane.add(wicket4);
 wicket5 = new JLabel("");
wicket5.setBounds(1160, 610, 100, 30);
contentPane.add(wicket5);
 wicket6 = new JLabel("");
wicket6.setBounds(700, 650, 100, 30);
contentPane.add(wicket6);
 wicket7 = new JLabel("");
wicket7.setBounds(810, 650, 100, 30);
contentPane.add(wicket7);
 wicket8 = new JLabel("");
wicket8.setBounds(920, 650, 100, 30);
contentPane.add(wicket8);
 wicket9 = new JLabel("");
wicket9.setBounds(1040, 650, 100, 30);
contentPane.add(wicket9);
 wicket10 = new JLabel("");
wicket10.setBounds(1160, 650, 105, 30);
contentPane.add(wicket10);

tscore = new JTextField();
tscore.setBounds(1250, 300, 50, 29);
contentPane.add(tscore);
tscore.setColumns(10);






extra = new JLabel("");
extra.setBounds(858, 323, 110, 14);
contentPane.add(extra);


JScrollPane scrollPane_1 = new JScrollPane();
scrollPane_1.setBounds(561, 574, 86, 106);
contentPane.add(scrollPane_1);
table_7 = new JTable();
scrollPane_1.setViewportView(table_7);
Object col13[]= {"LifeSaver"};
DefaultTableModel df12=(DefaultTableModel) table_7.getModel();
df12.setColumnIdentifiers(col13);
Object l1[]= {"four"};
Object l2[]= {"six"};
Object l3[]= {"three"};
Object l4[]= {"four"};
Object l5[]= {"six"};


df12.addRow(l1);
df12.addRow(l2);
df12.addRow(l3);
df12.addRow(l4);
df12.addRow(l5);
table_7.setModel(df12);
scrollPane_1.setViewportView(table_7);
JButton btnNewButton = new JButton("Life");
btnNewButton.setBounds(554, 526, 89, 23);
btnNewButton.setVisible(false);
contentPane.add(btnNewButton);




 hatrick = new JButton("Wicket");
 hatrick.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 		 Random ran=new Random();
		 count2=ran.nextInt(4);
		 table_6.addRowSelectionInterval(count2, count2);	
	     String text=table_6.getModel().getValueAt(count2, 0).toString();
	   
	     legbyescore.setText(text);		
	     score=legbyescore.getText();
	     
	     
	     JScrollPane scrollPane_13 = new JScrollPane();
			scrollPane_13.setBounds(700, 440, 600, 105);
			contentPane.add(scrollPane_13);
			 table_13 = new JTable();
			scrollPane_13.setViewportView(table_13);
			Object columnNames[] = { "Bowler name", "Balls Bowled","Dot Balls", "Runs Conceded", "Wide", "Noball", "Wicket","Economy" };
			DefaultTableModel df13=(DefaultTableModel) table_13.getModel();
			df13.setColumnIdentifiers(columnNames);
			table_13.setEnabled(false);
	     
			
			
			
			JScrollPane scrollPane_14 = new JScrollPane();
			scrollPane_14.setBounds(700, 90, 600, 200);
			contentPane.add(scrollPane_14);
			 table_15 = new JTable();
			scrollPane_14.setViewportView(table_15);
			Object columnNames1[] = { "Batsman name", "Runs Scored","Balls Faced", "fours", "sixes","S Rate" };
			DefaultTableModel df14=(DefaultTableModel) table_15.getModel();
			df14.setColumnIdentifiers(columnNames1);
			table_15.setEnabled(false);
			
			
			
			
			
			
			
	     
			 
		     if(((balltotal>59)&&(balltotal<=62))){
		    	 if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
					  totalwicket++;
					  scoreatwicket=totalscore;
					  b3wicket++; b3ballsbowled++;
					  b3dot++;
				  balltotal=balltotal+1;
				  
				  if(totalwicket==1) {
						p1=p1+0;
						pb1++;
						striker=0;
					}
					if(totalwicket==2) {
						p2=p2+0;
						pb2++;
						striker=0;
						
					}	
					
					if(totalwicket==3) {
						p3=p3+0;
						pb3++;
						striker=0;
					}
						
					
					if(totalwicket==4) {
						p4=p4+0;
						pb4++;
						striker=0;
					}
						
					
					if(totalwicket==5) {
						p5=p5+0;
						pb5++;
						striker=0;
						
						
					}
					if(totalwicket==6) {
						p6=p6+0;
						pb6++;
						striker=0;
					}
					if(totalwicket==7) {
						p7=p7+0;
						pb7++;
						striker=0;
					}
					if(totalwicket==8) {
						p8=p8+0;
						pb8++;
						striker=0;
					}
					if(totalwicket==9) {
						p9=p9+0;
						pb9++;
						striker=0;
					}
					if(totalwicket==10) {
						p10=p10+0;
						pb10++;
						
					}
					
				  
				  
				  
				  
				  
				  wicketball=balltotal;}
				  
				  b3economy=(float) ((b3s*6.0)/b3ballsbowled);
				  tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
				  }
		     else if((balltotal>66)&&(balltotal<=69)) {
		    	 
		    	 if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
						totalwicket++;
					b4wicket++;
					b4ballsbowled++;
					scoreatwicket=totalscore;
					balltotal++;
					if(totalwicket==1) {
						p1=p1+0;
						pb1++;
						striker=0;
					}
					if(totalwicket==2) {
						p2=p2+0;
						pb2++;
						striker=0;
						
					}	
					
					if(totalwicket==3) {
						p3=p3+0;
						pb3++;
						striker=0;
					}
						
					
					if(totalwicket==4) {
						p4=p4+0;
						pb4++;
						striker=0;
					}
						
					
					if(totalwicket==5) {
						p5=p5+0;
						pb5++;
						striker=0;
						
						
					}
					if(totalwicket==6) {
						p6=p6+0;
						pb6++;
						striker=0;
					}
					if(totalwicket==7) {
						p7=p7+0;
						pb7++;
						striker=0;
					}
					if(totalwicket==8) {
						p8=p8+0;
						pb8++;
						striker=0;
					}
					if(totalwicket==9) {
						p9=p9+0;
						pb9++;
						striker=0;
					}
					if(totalwicket==10) {
						p10=p10+0;
						pb10++;
						
					}
					
					wicketball=balltotal;
					 b4dot++;
				}
				
				b4economy=(float) ((b4s*6.0)/b4ballsbowled);
				tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
		    	 
		    	 
		     }
		     
		     else if(((balltotal>72)&&(balltotal<=75))||((balltotal>84)&&(balltotal<=87))||((balltotal>96)&&(balltotal<=99))||((balltotal>114)&&(balltotal<=117))) {
		    	 
		    	 if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
						totalwicket++;
					b5wicket++;
					b5ballsbowled++;
					scoreatwicket=totalscore;
					balltotal++;
					if(totalwicket==1) {
						p1=p1+0;
						pb1++;
						striker=0;
					}
					if(totalwicket==2) {
						p2=p2+0;
						pb2++;
						striker=0;
						
					}	
					
					if(totalwicket==3) {
						p3=p3+0;
						pb3++;
						striker=0;
					}
						
					
					if(totalwicket==4) {
						p4=p4+0;
						pb4++;
						striker=0;
					}
						
					
					if(totalwicket==5) {
						p5=p5+0;
						pb5++;
						striker=0;
						
						
					}
					if(totalwicket==6) {
						p6=p6+0;
						pb6++;
						striker=0;
					}
					if(totalwicket==7) {
						p7=p7+0;
						pb7++;
						striker=0;
					}
					if(totalwicket==8) {
						p8=p8+0;
						pb8++;
						striker=0;
					}
					if(totalwicket==9) {
						p9=p9+0;
						pb9++;
						striker=0;
					}
					if(totalwicket==10) {
						p10=p10+0;
						pb10++;
						
					}
					
					b5dot++;
					wicketball=balltotal;
				}
				
				b5economy=(float) ((b5s*6.0)/b5ballsbowled);
				tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
		    	 
		    	 
		     }
		     
		     else if(((balltotal>78)&&(balltotal<=81))||((balltotal>108)&&(balltotal<=111))) {
		    	  
		    	 
		    	  if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
						totalwicket++;
						b1wicket++;
						b1ballsbowled++;
						balltotal=balltotal+1;
						if(totalwicket==1) {
							p1=p1+0;
							pb1++;
							striker=0;
						}
						if(totalwicket==2) {
							p2=p2+0;
							pb2++;
							striker=0;
							
						}	
						
						if(totalwicket==3) {
							p3=p3+0;
							pb3++;
							striker=0;
						}
							
						
						if(totalwicket==4) {
							p4=p4+0;
							pb4++;
							striker=0;
						}
							
						
						if(totalwicket==5) {
							p5=p5+0;
							pb5++;
							striker=0;
							
							
						}
						if(totalwicket==6) {
							p6=p6+0;
							pb6++;
							striker=0;
						}
						if(totalwicket==7) {
							p7=p7+0;
							pb7++;
							striker=0;
						}
						if(totalwicket==8) {
							p8=p8+0;
							pb8++;
							striker=0;
						}
						if(totalwicket==9) {
							p9=p9+0;
							pb9++;
							striker=0;
						}
						if(totalwicket==10) {
							p10=p10+0;
							pb10++;
							
						}
						
						wicketball=balltotal;
						scoreatwicket=totalscore;
						 b1dot++;
						
					}
					
					
					b1economy=(float) ((b1s*6.0)/b1ballsbowled);
					tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
					
						
		     }
		     
		     else if(((balltotal>90)&&(balltotal<=93))||((balltotal>102)&&(balltotal<=105))) {
		    	 if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
						totalwicket++;
					b2wicket++;
					b2ballsbowled++;
					if(totalwicket==1) {
						p1=p1+0;
						pb1++;
						striker=0;
					}
					if(totalwicket==2) {
						p2=p2+0;
						pb2++;
						striker=0;
						
					}	
					
					if(totalwicket==3) {
						p3=p3+0;
						pb3++;
						striker=0;
					}
						
					
					if(totalwicket==4) {
						p4=p4+0;
						pb4++;
						striker=0;
					}
						
					
					if(totalwicket==5) {
						p5=p5+0;
						pb5++;
						striker=0;
						
						
					}
					if(totalwicket==6) {
						p6=p6+0;
						pb6++;
						striker=0;
					}
					if(totalwicket==7) {
						p7=p7+0;
						pb7++;
						striker=0;
					}
					if(totalwicket==8) {
						p8=p8+0;
						pb8++;
						striker=0;
					}
					if(totalwicket==9) {
						p9=p9+0;
						pb9++;
						striker=0;
					}
					if(totalwicket==10) {
						p10=p10+0;
						pb10++;
						
					}
					
					balltotal++;
					wicketball=balltotal;
					 b2dot++;
					scoreatwicket=totalscore;
					}
				
				b2economy=(float) ((b2s*6.0)/b2ballsbowled);
				tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
			 
		     }
		     
		     
		     if(totalwicket==1) {
					
					wicket1.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
				}
		if(totalwicket==2) {
					
					wicket2.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
				}
		if(totalwicket==3) {
			
			wicket3.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
		if(totalwicket==4) {
			
			wicket4.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
		if(totalwicket==5) {
			
			wicket5.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
		if(totalwicket==6) {
			
			wicket6.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
		if(totalwicket==7) {
			
			wicket7.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
		if(totalwicket==8) {
			
			wicket8.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
		if(totalwicket==9) {
			
			wicket9.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
		}
				
		if(totalwicket==10) {
			
			wicket10.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
			 hat.stop();
			 tran.stop();
		}
		     
		    
	    
	
	
	 
	 Object bo[]= {"Kapil Dev",b1ballsbowled,b1dot,b1s,b1wide,b1noball,b1wicket,b1economy};
        df13.addRow(bo);
        Object bo1[]= {"J Bumbrah",b2ballsbowled,b2dot,b2s,b2wide,b2noball,b2wicket,b2economy};
        df13.addRow(bo1);
        
        Object bo2[]= {"R Jadeja",b3ballsbowled,b3dot,b3s,b3wide,b3noball,b3wicket,b3economy};
        df13.addRow(bo2);
        Object bo3[]= {"R Ashwin",b4ballsbowled,b4dot,b4s,b4wide,b4noball,b4wicket,b4economy};
        df13.addRow(bo3);
        Object bo4[]= {"M Shami",b5ballsbowled,b5dot,b5s,b5wide,b5noball,b5wicket,b5economy};
        df13.addRow(bo4);
	
	table_13.setModel(df13);
	
	Object ba[]= {"S Anwar",p1,pb1,p1fours,p1six,srate1};
    df14.addRow(ba);
    Object ba1[]= {"Salman Butt",p2,pb2,p2fours,p2six,srate2};
    df14.addRow(ba1);
    
			
			  Object ba2[]= {"Babar Azam",p3,pb3,p3fours,p3six,srate3}; df14.addRow(ba2);
			  Object ba3[]= {"Younus Khan",p4,pb4,p4fours,p4six,srate4}; df14.addRow(ba3);
			  Object ba4[]= {"Mishbah ul haq",p5,pb5,p5fours,p5six,srate5}; df14.addRow(ba4);
			  Object ba5[]= {"Sarfraz Ahmaed",p6,pb6,p6fours,p6six,srate6}; df14.addRow(ba5);
			  Object ba6[]= {"S Afridi",p7,pb7,p7fours,p7six,srate7}; df14.addRow(ba6);
			  Object ba7[]= {"Wahab raiz",p8,pb8,p8fours,p8six,srate8};
			  df14.addRow(ba7); Object ba8[]= {"wasim akram",p9,pb9,p9fours,p9six,srate9};
			  df14.addRow(ba8); Object ba9[]= {"M Aamir",p10,pb10,p10fours,p10six,srate10};
			  df14.addRow(ba9); Object ba10[]= {"S Akthar",p11,pb11,p11fours,p11six,srate11};
			  df14.addRow(ba10);
	table_15.setModel(df14);

	if((balltotal>60)&&(balltotal<66)) {
		o="10";
		
		m++;
	}
	
	else if((balltotal>66)&&(balltotal<72)) {
		o="11";
		
		m++;
	}

	else if((balltotal>72)&&(balltotal<78)) {
		o="12";
		m++;
	}
	
	else if((balltotal>78)&&(balltotal<84)) {
		o="13";
		m++;
	}
	
	else if((balltotal>84)&&(balltotal<90)) {
		o="14";
		m++;
		
	}
	
	else if((balltotal>90)&&(balltotal<96)) {
		o="15";
		m++;
		
	}
	
	else if((balltotal>96)&&(balltotal<102)) {
		o="16";
		m++;
		if(score.contains("wide")) {
			m--;
		}
	}
	else if(balltotal==102) {
		o="17";}
	else if((balltotal>102)&&(balltotal<108)) {
		o="17";
		m++;
		if(score.contains("wide")) {
			m--;
		}
	}
	else if(balltotal==108) {
		o="18";}
	else if((balltotal>108)&&(balltotal<114)) {
		o="18";
		m++;
		if(score.contains("wide")) {
			m--;
		}
	}
	else if(balltotal==114) {
		o="19";}
	else if((balltotal>114)&&(balltotal<120)) {
		o="19";
		m++;
		if(score.contains("wide")) {
			m--;
		}
	}
	
	overfield.setText(o+"."+String.valueOf(m)); 
	
	if(totalwicket==10||balltotal==120||(totalscore>target)) {
		allout=1;
		  btnNewButton_3.doClick();}
	     
 	}
 });
 hatrick.setBounds(445, 526, 89, 23);
 hatrick.setVisible(false);
contentPane.add(hatrick);













// Input receiver
Timer timer1 = new Timer();
TimerTask task1 = new TimerTask()
{
int i = 0;
       public void run()
       {
    	   
//    	  To fetch the values from spin 1, 2, 4 and 5
    	   
        random_number=new RandomNumber();
        row=random_number.Random_Number();


        i++;

        System.out.println("Timer: "+i );



//Table 1
        if (i==1||i==5||i==9||i==14||i==19||i==24||i==29||i==34||i==39||i==43||i==47||i==51||i==56||i==61||i==66||i==71||i==76 ||i==81|| i==85||i==89||i==93||i==98||i==103||i==108||i==113||i==118)
        {
       
        score1=table_1.getValueAt(row, 0).toString();
        if(score1!=null) {

table_1.addRowSelectionInterval(row, row);
table_1.setBackground(Color.WHITE);
table_1.setForeground(Color.BLUE);        
textField.setText(SpinName1+" - "+score1);
       
        }
        }
//Table 2        
        else if(i==2||i==6||i==10||i==15||i==20||i==25||i==30||i==35||i==40||i==44||i==48||i==52||i==57||i==62||i==67||i==72||i==77 ||i==82|| i==86||i==90||i==94||i==99||i==104||i==109||i==114||i==119)
        {
        score2=table_2.getValueAt(row, 0).toString();
       
//Anti clock wise rotation of Table 2        
        if(i<=row)
        {
        row=11-row;
        }
        if(score2!=null) {

table_2.addRowSelectionInterval(row, row);
table_2.setBackground(Color.WHITE);
table_2.setForeground(Color.BLUE);
textField.setText(SpinName2+" - "+score2);
        }
        }
       
       
//Table 3
        else if(i==3||i==7||i==11||i==16||i==21||i==26||i==31||i==36||i==41||i==45||i==49||i==53||i==58||i==63||i==68||i==73||i==78 ||i==83|| i==87||i==91||i==95||i==100||i==105||i==110||i==115|| i==120)
        {
        	
        	RandomNumber1 random_number1=new RandomNumber1();
        	row1=random_number1.Random_Number1();
        	
        score3=table_3.getValueAt(row1, 0).toString();

        if(score3!=null) {

table_3.addRowSelectionInterval(row1, row1);
table_3.setBackground(Color.WHITE);
table_3.setForeground(Color.BLUE);
textField.setText(SpinName3+" - "+score3);
        }
        }
        
//Table 4        
        else if(i==4||i==8||i==27|| i==32||i==37||i==42|| i==64||i==69||i==88||i==92||i==96||i==101)
        {
        score4=table_4.getValueAt(row, 0).toString();
       
       
        if(score4!=null) {

table_4.addRowSelectionInterval(row, row);
table_4.setBackground(Color.WHITE);
table_4.setForeground(Color.BLUE);
textField.setText(SpinName4+" - "+score4);
        }
        }
        else if(i==12||i==17||i==22||i==46||i==50||i==54||i==59||i==74||i==79||i==84||i==106||i==111||i==116)
        {
        score4=table_4.getValueAt(row, 0).toString();
       
//Anti clock wise rotation of Table 4        
        if(i<=row)
        {
        row=11-row;
        }
        if(score4!=null) {

        table_4.addRowSelectionInterval(row, row);
table_4.setBackground(Color.WHITE);
table_4.setForeground(Color.BLUE);
textField.setText(SpinName4+" - "+score4);
        }
        }
       
//Table 5        
        else if(i==13||i==18||i==23||i==28||i==33||i==38||i==55||i==60||i==65||i==70||i==75||i==80||i==102||i==107||i==112||i==117)
        {
        score5=table.getValueAt(row, 0).toString();
       
       
//Anti clock wise rotation of Table 5        
        if(i<=row)
        {
        row=11-row;
        }
        if(score5!=null) {

table.addRowSelectionInterval(row, row);
table.setBackground(Color.WHITE);
table.setForeground(Color.BLUE);
textField.setText(SpinName5+" - "+score5);
        }
        }
        else if(i==97)
        {
        	 score5=table.getValueAt(2, 0).toString();
        	 table.addRowSelectionInterval(2, 2);
        	 table.setBackground(Color.WHITE);
        	 table.setForeground(Color.BLUE);
        	textField.setText(SpinName5+" - "+score5);
        	
        }

       }
       
   };
   
   long delay1 = 1000L;
   timer1.scheduleAtFixedRate(task1, delay1, 1000);
   
//Stop the timer at 120th second    
   timer1.schedule(new TimerTask() {
       
       public void run() {
          task1.cancel();
       }
   },120000);
   
   
   textField.setColumns(10);
   



lblSpin = new JLabel("SPIN 5");
lblSpin.setFont(new Font("Tahoma", Font.BOLD, 14));
lblSpin.setBounds(417, 25, 56, 16);
SpinName5=lblSpin.getText();
contentPane.add(lblSpin);
   

// Populating spin 5
btnNewButton_1 = new JButton("Dummy - Spin 5");
TimerTask task2 = new TimerTask()
{
int i = 0;
       public void run()
       {
        i++;

//        System.out.println("Timer ran (Input receiver to spin 5) "+i );
       
       
        if((i<=13))
        {
        btnNewButton_1.doClick(i);
        strNew = strNew+textField.getText().substring(8);
        }
       
        if(i==41)
        {
       
         strNew = "";
        }
        
        
        if((i>=42 && i<=54))
        {
        btnNewButton_1.doClick(i);
        strNew = strNew+textField.getText().substring(8);
        }
        if(i==88)
        {
       
        strNew = "";

        }
        if((i>=89 && i<=101))
        {
        btnNewButton_1.doClick(i);
        strNew = strNew+textField.getText().substring(8);
        }
       
       }
   };
   
   Timer timer2 = new Timer();
   
   long delay2= 1250L;
   timer2.scheduleAtFixedRate(task2, delay2, 1000);
   timer2.schedule(new TimerTask() {
       
       public void run() {
          task2.cancel();
       }
   },120000);
   
   
   
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {



String spin5array []= strNew.split(" ");

//Converting from 1 D to 2 D Array
String[][] matrix = new String[spin5array.length][]; 
   int r = 0;
   for (String row : spin5array) {
       matrix[r++] = row.split(" ");
   }

   Object cd [][] = matrix;
 
   table.setModel(new DefaultTableModel(cd,b));
   DefaultTableModel model1=(DefaultTableModel)table.getModel();
   model1.removeRow(0);

}
});

btnNewButton_1.setBounds(359, 299, 89, 23);
contentPane.add(btnNewButton_1);




// Table 3: Spin 3
table_3 = new JTable();
table_3.setRowSelectionAllowed(false);
table_3.setFont(new Font("Tahoma", Font.PLAIN, 13));

TimerTask task4 = new TimerTask() 
{
	int count = 0;
    public void run() 
    {
    	
    	count++;

if(count>=0 && count<=4||count>=13 && count<=16 ||count>=25 && count<=28||count>=37 && count<=40||count>=49 && count<=52||count>=61 && count<=64||count>=73 && count<=76||count>=85 && count<=88||count>=97 && count<=100||count>=109 && count<=112)
{
	Object zz[][] ={{"dot"},
			{"wide"},
			{"six"},
			{"legbye"}};
	table_3.setModel(new DefaultTableModel(zz,b));
	
}
if(count>=5 && count<=8||count>=17 && count<=20 ||count>=29 && count<=32||count>=41 && count<=44||count>=53 && count<=56||count>=65 && count<=68||count>=77 && count<=80||count>=89 && count<=92||count>=101 && count<=104||count>=113 && count<=116)
{
	Object xx[][] ={{"two"},
			{"three"},
			{"one"},
			{"LBW"}};
	table_3.setModel(new DefaultTableModel(xx,b));
	
}
if(count>=9 && count<=12||count>=21 && count<=24 ||count>=33 && count<=36||count>=45 && count<=48||count>=57 && count<=60||count>=69 && count<=72||count>=81 && count<=84||count>=93 && count<=96||count>=105 && count<=108||count>=117 && count<=120)
{
	Object cc[][] ={{"noball"},
			{"six"},
			{"four"},
			{"dot"}};
	table_3.setModel(new DefaultTableModel(cc,b));
}

}
};
Timer timer4 = new Timer();

long delay4 = 1000L;
timer4.scheduleAtFixedRate(task4, delay4, 1000);
timer4.schedule(new TimerTask() {
    
    public void run() {
       task4.cancel();
    }
},120000);

table_3.setBorder(new LineBorder(Color.GRAY));
table_3.setBounds(216, 53, 85, 192);
contentPane.add(table_3);


//Table 4: Spin 4
table_4 = new JTable();
table_4.setRowSelectionAllowed(false);
table_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
table_4.setModel(new DefaultTableModel(ef,b));
table_4.setBorder(new LineBorder(Color.GRAY));
table_4.setBounds(323, 52, 85, 192);
contentPane.add(table_4);

JLabel lblNewLabel_1 = new JLabel("SPIN 3");
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
lblNewLabel_1.setBounds(216, 26, 63, 14);
contentPane.add(lblNewLabel_1);
SpinName3=lblNewLabel_1.getText();


JLabel lblNewLabel_2 = new JLabel("SPIN 4");
lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
lblNewLabel_2.setBounds(313, 26, 61, 14);
contentPane.add(lblNewLabel_2);
SpinName4=lblNewLabel_2.getText();

JLabel lblNewLabel_3 = new JLabel("INPUT RECEIVER");
lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
lblNewLabel_3.setBounds(75, 255, 145, 14);
contentPane.add(lblNewLabel_3);

JScrollPane scrollPane = new JScrollPane();


//To display the recent 20 values - DWH
scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
       public void adjustmentValueChanged(AdjustmentEvent e) {  
           e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
       }
   });

scrollPane.setBounds(28, 343, 293, 343);
contentPane.add(scrollPane);



// Table 5: Data Ware House
table_5 = new JTable();

scrollPane.setViewportView(table_5);

JButton btnNewButton_2 = new JButton("Dummy - DWH");
TimerTask task3 = new TimerTask()
{
int i = 0;
       public void run()
       {
        i++;
//        System.out.println("Timer ran (IR to DWH): "+i );
        btnNewButton_2.doClick(i);
       }
   };
   
   Timer timer3 = new Timer();
   
   long delay3 = 1000L;
   
   timer3.scheduleAtFixedRate(task3, delay3, 1000);
   timer3.schedule(new TimerTask() {
       
       public void run() {
          task3.cancel();
       }
   },120000);
 
   
   
   btnNewButton_2.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent e) {


DefaultTableModel model2=(DefaultTableModel)table_5.getModel();

//Passing values from Input Receiver to the respective columns of  Data Ware House
String s1= textField.getText().substring(0,7);
String s2= textField.getText().substring(9);

//System.out.println("s1:   "+s1);
//System.out.println("s2:   "+s2);
model2.addRow(new Object[] {s1,s2});
}
});
   

btnNewButton_2.setBounds(359, 343, 127, 23);
contentPane.add(btnNewButton_2);


table_5.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
"Spin No.", "Runs"
}
));

btnNewButton_1.setVisible(false);
btnNewButton_2.setVisible(false);



transbutton = new JButton("Transmitter");
transbutton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		
		tt=textField_1.getText().toString();
	target=Integer.valueOf(tt);
		
		table_5.addRowSelectionInterval(count1, count1);
		String value=table_5.getModel().getValueAt(count1, 1).toString();
		trans.setText(value);

		
		count1=count1+1;
		if(count1==table_5.getRowCount()) {
			ti.stop();
		}

		if(trans.getText().contains("legbye")) {
			legbutton.doClick();
		}
		
		
		 if(trans.getText().contains("legbye")) {
			 score=legbyescore.getText();
			 
			 }
			 else {
				 score=trans.getText();
			 }
		
		
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(700, 440, 600, 105);
		contentPane.add(scrollPane_13);
		 table_13 = new JTable();
		scrollPane_13.setViewportView(table_13);
		Object columnNames[] = { "Bowler name", "Balls Bowled","Dot Balls", "Runs Conceded", "Wide", "Noball", "Wicket","Economy" };
		DefaultTableModel df13=(DefaultTableModel) table_13.getModel();
		df13.setColumnIdentifiers(columnNames);
		table_13.setEnabled(false);
		
		
		
		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setBounds(700, 90, 600, 200);
		contentPane.add(scrollPane_14);
		 table_15 = new JTable();
		scrollPane_14.setViewportView(table_15);
		Object columnNames1[] = { "Batsman name", "Runs Scored","Balls Faced", "fours", "sixes","S Rate" };
		DefaultTableModel df14=(DefaultTableModel) table_15.getModel();
		df14.setColumnIdentifiers(columnNames1);
		table_15.setEnabled(false);
		
		
if((b1ballsbowled<6)||((b1ballsbowled>=6)&&(b2ballsbowled==6)&&(b1ballsbowled<12))||((b3ballsbowled==24)&&(b2ballsbowled==12)&&(b1ballsbowled<18)&&(b4ballsbowled==24)&&(b5ballsbowled==6))||((b3ballsbowled==24)&&(b2ballsbowled==24)&&(b1ballsbowled<24)&&(b4ballsbowled==24)&&(b5ballsbowled==18))) {
		
		if(score.contains("one")) {
			
			b1ballsbowled++;
			balltotal=balltotal+1;
			b1s=b1s+1;
			 
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+1;
						pb1++;
						
						
					}
					else {
						p2=p2+1;
						pb2++;
						
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+1;
						pb3++;
						
					}
					else {
						p2=p2+1;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+1;
							pb4++;
							
					 }
					 else {
						 p3=p3+1;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+1;
							pb5++;
							
					 }
					 else {
						 p4=p4+1;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+1;
							pb6++;
							
					 }
					 else {
						 p5=p5+1;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+1;
							pb7++;
							
					 }
					 else {
						 p6=p6+1;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+1;
							pb8++;
							
					 }
					 else {
						 p7=p7+1;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+1;
							pb9++;
							
					 }
					 else {
						 p8=p8+1;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+1;
							pb10++;
							
					 }
					 else {
						 p9=p9+1;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+1;
							pb11++;
							
					 }
					 else {
						 p10=p10+1;
							pb10++;
					 }
					
					
				}
				 
	
			totalscore=totalscore+1;
			
			System.out.println(balltotal);
		}
		else if(score.contains("two")) {
			b1s=b1s+2;
			b1ballsbowled++;
			balltotal=balltotal+1;
			totalscore=totalscore+2;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+2;
					pb1++;
					
				}
				else {
					p2=p2+2;
					pb2++;
					
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+2;
					pb3++;
					
			
				}
				else {
					p2=p2+2;
					pb2++;
					
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+2;
					 
						pb4++;
					
				 }
				 else {
					 p3=p3+2;
						pb3++;
						
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+2;
						pb5++;
						
					
				 }
				 else {
					 p4=p4+2;
						pb4++;
						
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+2;
						pb6++;
						
				 }
				 else {
					 p5=p5+2;
						pb5++;
						
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+2;
						pb7++;
						
						
				 }
				 else {
					 p6=p6+2;
						pb6++;
						
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+2;
						pb8++;
						
						
				 }
				 else {
					 p7=p7+2;
						pb7++;
						
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+2;
						pb9++;
						
				 }
				 else {
					 p8=p8+2;
						pb8++;
						
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+2;
						pb10++;
						
						
				 }
				 else {
					 p9=p9+2;
						pb9++;
						
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+2;
					 
						pb11++;
					
				 }
				 else {
					 p10=p10+2;
						pb10++;
						
				 }
				
				
			}
			System.out.println(balltotal);
		}
		else if(score.contains("three")) {
			b1s=b1s+3;
			b1ballsbowled++;
			balltotal=balltotal+1;
			totalscore=totalscore+3;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+3;
					pb1++;
					striker=1;
				}
				else {
					p2=p2+3;
					pb2++;striker=0;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+3;
					pb3++;
					striker=1;
				}
				else {
					p2=p2+3;
					pb2++;striker=0;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+3;
						pb4++;
						striker=1;
				 }
				 else {
					 p3=p3+3;
						pb3++;striker=0;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+3;
						pb5++;
						striker=1;
				 }
				 else {
					 p4=p4+3;
						pb4++;striker=0;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+3;
						pb6++;
						striker=1;
				 }
				 else {
					 p5=p5+3;
						pb5++;striker=0;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+3;
						pb7++;
						striker=1;
				 }
				 else {
					 p6=p6+3;
						pb6++;striker=0;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+3;
						pb8++;
						striker=1;
				 }
				 else {
					 p7=p7+3;
						pb7++;striker=0;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+3;
						pb9++;
						striker=1;
				 }
				 else {
					 p8=p8+3;
						pb8++;striker=0;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+3;
						pb10++;
						striker=1;
				 }
				 else {
					 p9=p9+3;
						pb9++;striker=0;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+3;
						pb11++;
						striker=1;
				 }
				 else {
					 p10=p10+3;
						pb10++;striker=0;
				 }
				
				
			}
			System.out.println(balltotal);
		}
		else if(score.contains("four")) {
			b1s=b1s+4;
			b1ballsbowled++;
			balltotal=balltotal+1;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+4;
					p1fours++;
					pb1++;
					
				}
				else {
					p2=p2+4;
					p2fours++;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+4;
					p3fours++;
					pb3++;
			
				}
				else {
					p2=p2+4;
					pb2++;
					p4fours++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+4;
					 p4fours++;
						pb4++;
					
				 }
				 else {
					 p3=p3+4;
					 p3fours++;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+4;
					 p5fours++;
						pb5++;
					
				 }
				 else {
					 p4=p4+4;
					 p4fours++;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+4;
					 p6fours++;
						pb6++;
					
				 }
				 else {
					 p5=p5+4;
					 p5fours++;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+4;
					 p7fours++;
						pb7++;
						
				 }
				 else {
					 p6=p6+4;
						pb6++;
						p6fours++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+4;
						pb8++;
						p8fours++;
						
				 }
				 else {
					 p7=p7+4;
						pb7++;
						p7fours++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+4;
					 p9fours++;
						pb9++;
						
				 }
				 else {
					 p8=p8+4;
					 p8fours++;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+4;
						pb10++;
						p10fours++;
						
				 }
				 else {
					 p9=p9+4;
					 p9fours++;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+4;
					 p11fours++;
						pb11++;
					
				 }
				 else {
					 p10=p10+4;
						pb10++;
						p10fours++;
				 }
				
				
			}
			totalscore=totalscore+4;
			System.out.println(balltotal);
		}
		else if(score.contains("six")) {
			b1s=b1s+6;
			b1ballsbowled++;
			balltotal=balltotal+1;
			totalscore=totalscore+6;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+6;
					pb1++;
					p1six++;
					
				}
				else {
					p2=p2+6;
					pb2++;
					p2six++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+6;
					pb3++;
					p3six++;
			
				}
				else {
					p2=p2+6;
					pb2++;
					p2six++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+6;
						pb4++;
						p4six++;
					
				 }
				 else {
					 p3=p3+6;
						pb3++;
						p3six++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+6;
					 p5six++;
						pb5++;
					
				 }
				 else {
					 p4=p4+6;
					 p4six++;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+6;
						pb6++;
						p6six++;
				 }
				 else {
					 p5=p5+6;
						pb5++;
						p5six++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+6;
					 p7six++;
						pb7++;
						
				 }
				 else {
					 p6=p6+6;
						pb6++;
						p6six++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+6;
					 p8six++;
						pb8++;
						
				 }
				 else {
					 p7=p7+6;
					 p7six++;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+6;
						pb9++;
						p9six++;
				 }
				 else {
					 p8=p8+6;
						pb8++;
						p8six++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+6;
						pb10++;
						p10six++;
						
				 }
				 else {
					 p9=p9+6;
						pb9++;
						p9six++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+6;
					 p11six++;
						pb11++;
					
				 }
				 else {
					 p10=p10+6;
						pb10++;
						p10six++;
				 }
				
				
			}
			System.out.println(balltotal);
		}
		else if(score.contains("dot")) {
			b1s=b1s+0;
			b1dot++;
			b1ballsbowled++;
			balltotal=balltotal+1;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
			totalscore=totalscore+0;
			System.out.println(balltotal);
		}
		else if(score.contains("wide")) {
			b1s=b1s+1;
			b1wide=b1wide+1;
			totalwide++;
			totalscore=totalscore+1;
		}
		else if(score.contains("0")) {
			b1s=b1s+0;
		   leg=leg+0;
			totalscore=totalscore+0;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
			
			b1ballsbowled++;
			balltotal++;
		}
		else if(score.contains("1")) {
			b1s=b1s+1;
			leg=leg+1;
			b1ballsbowled++;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
			
			
			
			if(striker==1) {
				striker=0;
			}
			else {
				striker=1;
			}
			totalscore=totalscore+1;
			balltotal++;
		}
		else if(score.contains("2")) {
			b1s=b1s+2;
			leg=leg+2;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
			b1ballsbowled++;
			totalscore=totalscore+2;
			balltotal++;
		}
		else if(score.contains("3")) {
			b1s=b1s+1;
			b1ballsbowled++;
			leg=leg+3;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
			if(striker==1) {
				striker=0;
			}
			else {
				striker=1;
			}
			totalscore=totalscore+3;
			balltotal++;
		}
		else if(score.contains("4")) {
			b1s=b1s+1;
			b1ballsbowled++;
			leg=leg+4;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
			balltotal++;
			totalscore=totalscore+4;
		}
		else if(score.contains("noball")) {
			b1s=b1s+5;
			b1noball=b1noball+1;
			totalnoball++;
			totalscore=totalscore+5;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+4;
					p1fours++;
					pb1++;
					
				}
				else {
					p2=p2+4;
					p2fours++;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+4;
					p3fours++;
					pb3++;
			
				}
				else {
					p2=p2+4;
					pb2++;
					p4fours++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+4;
					 p4fours++;
						pb4++;
					
				 }
				 else {
					 p3=p3+4;
					 p3fours++;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+4;
					 p5fours++;
						pb5++;
					
				 }
				 else {
					 p4=p4+4;
					 p4fours++;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+4;
					 p6fours++;
						pb6++;
					
				 }
				 else {
					 p5=p5+4;
					 p5fours++;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+4;
					 p7fours++;
						pb7++;
						
				 }
				 else {
					 p6=p6+4;
						pb6++;
						p6fours++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+4;
						pb8++;
						p8fours++;
						
				 }
				 else {
					 p7=p7+4;
						pb7++;
						p7fours++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+4;
					 p9fours++;
						pb9++;
						
				 }
				 else {
					 p8=p8+4;
					 p8fours++;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+4;
						pb10++;
						p10fours++;
						
				 }
				 else {
					 p9=p9+4;
					 p9fours++;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+4;
					 p11fours++;
						pb11++;
					
				 }
				 else {
					 p10=p10+4;
						pb10++;
						p10fours++;
				 }
				
				
			}
			balltotal++;
			b1ballsbowled++;
		}
			else if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
			totalwicket++;
			b1wicket++;
			b1ballsbowled++;
			balltotal=balltotal+1;
			wicketball=balltotal;
			
				if(totalwicket==1) {
					p1=p1+0;
					pb1++;
					striker=0;
				}
				if(totalwicket==2) {
					p2=p2+0;
					pb2++;
					striker=0;
					
				}	
				
				if(totalwicket==3) {
					p3=p3+0;
					pb3++;
					striker=0;
				}
					
				
				if(totalwicket==4) {
					p4=p4+0;
					pb4++;
					striker=0;
				}
					
				
				if(totalwicket==5) {
					p5=p5+0;
					pb5++;
					striker=0;
					
					
				}
				if(totalwicket==6) {
					p6=p6+0;
					pb6++;
					striker=0;
				}
				if(totalwicket==7) {
					p7=p7+0;
					pb7++;
					striker=0;
				}
				if(totalwicket==8) {
					p8=p8+0;
					pb8++;
					striker=0;
				}
				if(totalwicket==9) {
					p9=p9+0;
					pb9++;
					striker=0;
				}
				if(totalwicket==10) {
					p10=p10+0;
					pb10++;
					
				}
				
				
				
			scoreatwicket=totalscore;
			 b1dot++;
			
		}
	
		b1economy=(float) ((b1s*6.0)/b1ballsbowled);
		tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
		
			
		}
	




	
else if((b2ballsbowled<6)&&(b1ballsbowled==6)||((b2ballsbowled<12)&&(b1ballsbowled==12))||((b3ballsbowled==24)&&(b2ballsbowled<18)&&(b1ballsbowled==18)&&(b4ballsbowled==24)&&(b5ballsbowled==12))||((b3ballsbowled==24)&&(b2ballsbowled<24)&&(b1ballsbowled==18)&&(b4ballsbowled==24)&&(b5ballsbowled==18))) 
		 {
		 
			if(score.contains("one")) {
				
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+1;
						pb1++;
						striker=1;
					}
					else {
						p2=p2+1;
						pb2++;striker=0;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+1;
						pb3++;
						striker=1;
					}
					else {
						p2=p2+1;
						pb2++;striker=0;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+1;
							pb4++;
							striker=1;
					 }
					 else {
						 p3=p3+1;
							pb3++;striker=0;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+1;
							pb5++;
							striker=1;
					 }
					 else {
						 p4=p4+1;
							pb4++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+1;
							pb6++;
							striker=1;
					 }
					 else {
						 p5=p5+1;
							pb5++;striker=0;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+1;
							pb7++;
							striker=1;
					 }
					 else {
						 p6=p6+1;
							pb6++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+1;
							pb8++;
							striker=1;
					 }
					 else {
						 p7=p7+1;
							pb7++;striker=0;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+1;
							pb9++;
							striker=1;
					 }
					 else {
						 p8=p8+1;
							pb8++;striker=0;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+1;
							pb10++;
							striker=1;
					 }
					 else {
						 p9=p9+1;
							pb9++;striker=0;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+1;
							pb11++;
							striker=1;
					 }
					 else {
						 p10=p10+1;
							pb10++;striker=0;
					 }
					
					
				}
				totalscore=totalscore+1;
				b2s=b2s+1;
				b2ballsbowled++;
				balltotal++;
			}
			else if(score.contains("two")) {
				
				b2s=b2s+2;
				b2ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+2;
						pb1++;
						
					}
					else {
						p2=p2+2;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+2;
						pb3++;
				
					}
					else {
						p2=p2+2;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+2;
							pb4++;
						
					 }
					 else {
						 p3=p3+2;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+2;
							pb5++;
						
					 }
					 else {
						 p4=p4+2;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+2;
							pb6++;
						
					 }
					 else {
						 p5=p5+2;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+2;
							pb7++;
							
					 }
					 else {
						 p6=p6+2;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+2;
							pb8++;
							
					 }
					 else {
						 p7=p7+2;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+2;
							pb9++;
							
					 }
					 else {
						 p8=p8+2;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+2;
							pb10++;
							
					 }
					 else {
						 p9=p9+2;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+2;
							pb11++;
						
					 }
					 else {
						 p10=p10+2;
							pb10++;
					 }
					
					
				}
				balltotal++;
				totalscore=totalscore+2;
			}
			else if(score.contains("three")) {
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+3;
						pb1++;
						striker=1;
					}
					else {
						p2=p2+3;
						pb2++;striker=0;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+3;
						pb3++;
						striker=1;
					}
					else {
						p2=p2+3;
						pb2++;striker=0;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+3;
							pb4++;
							striker=1;
					 }
					 else {
						 p3=p3+3;
							pb3++;striker=0;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+3;
							pb5++;
							striker=1;
					 }
					 else {
						 p4=p4+3;
							pb4++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+3;
							pb6++;
							striker=1;
					 }
					 else {
						 p5=p5+3;
							pb5++;striker=0;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+3;
							pb7++;
							striker=1;
					 }
					 else {
						 p6=p6+3;
							pb6++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+3;
							pb8++;
							striker=1;
					 }
					 else {
						 p7=p7+3;
							pb7++;striker=0;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+3;
							pb9++;
							striker=1;
					 }
					 else {
						 p8=p8+3;
							pb8++;striker=0;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+3;
							pb10++;
							striker=1;
					 }
					 else {
						 p9=p9+3;
							pb9++;striker=0;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+3;
							pb11++;
							striker=1;
					 }
					 else {
						 p10=p10+3;
							pb10++;striker=0;
					 }
					
					
				}
				b2s=b2s+3;
				b2ballsbowled++;
				balltotal++;
				totalscore=totalscore+3;
			}
			else if(score.contains("four")) {
				b2s=b2s+4;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+4;
						p1fours++;
						pb1++;
						
					}
					else {
						p2=p2+4;
						p2fours++;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+4;
						p3fours++;
						pb3++;
				
					}
					else {
						p2=p2+4;
						pb2++;
						p4fours++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+4;
						 p4fours++;
							pb4++;
						
					 }
					 else {
						 p3=p3+4;
						 p3fours++;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+4;
						 p5fours++;
							pb5++;
						
					 }
					 else {
						 p4=p4+4;
						 p4fours++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+4;
						 p6fours++;
							pb6++;
						
					 }
					 else {
						 p5=p5+4;
						 p5fours++;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+4;
						 p7fours++;
							pb7++;
							
					 }
					 else {
						 p6=p6+4;
							pb6++;
							p6fours++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+4;
							pb8++;
							p8fours++;
							
					 }
					 else {
						 p7=p7+4;
							pb7++;
							p7fours++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+4;
						 p9fours++;
							pb9++;
							
					 }
					 else {
						 p8=p8+4;
						 p8fours++;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+4;
							pb10++;
							p10fours++;
							
					 }
					 else {
						 p9=p9+4;
						 p9fours++;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+4;
						 p11fours++;
							pb11++;
						
					 }
					 else {
						 p10=p10+4;
							pb10++;
							p10fours++;
					 }
					
					
				}
				b2ballsbowled++;
				balltotal++;
				totalscore=totalscore+4;
			}
			else if(score.contains("six")) {
				b2s=b2s+6;
				b2ballsbowled++;
				balltotal++;
				
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+6;
						pb1++;
						p1six++;
						
					}
					else {
						p2=p2+6;
						pb2++;
						p2six++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+6;
						pb3++;
						p3six++;
				
					}
					else {
						p2=p2+6;
						pb2++;
						p2six++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+6;
							pb4++;
							p4six++;
						
					 }
					 else {
						 p3=p3+6;
							pb3++;
							p3six++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+6;
						 p5six++;
							pb5++;
						
					 }
					 else {
						 p4=p4+6;
						 p4six++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+6;
							pb6++;
							p6six++;
					 }
					 else {
						 p5=p5+6;
							pb5++;
							p5six++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+6;
						 p7six++;
							pb7++;
							
					 }
					 else {
						 p6=p6+6;
							pb6++;
							p6six++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+6;
						 p8six++;
							pb8++;
							
					 }
					 else {
						 p7=p7+6;
						 p7six++;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+6;
							pb9++;
							p9six++;
					 }
					 else {
						 p8=p8+6;
							pb8++;
							p8six++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+6;
							pb10++;
							p10six++;
							
					 }
					 else {
						 p9=p9+6;
							pb9++;
							p9six++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+6;
						 p11six++;
							pb11++;
						
					 }
					 else {
						 p10=p10+6;
							pb10++;
							p10six++;
					 }
					
					
				}
				totalscore=totalscore+6;
			}
			else if(score.contains("dot")) {
				b2s=b2s+0;
				b2dot++;
				b2ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				balltotal++;
				totalscore=totalscore+0;
			}
			else if(score.contains("wide")) {
				b2s=b2s+1;
				b2wide=b2wide+1;
				totalwide++;
				totalscore=totalscore+1;
			}
			
			
			else if(score.contains("0")) {
				b2s=b2s+0;
			leg=leg+0;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
				totalscore=totalscore+0;
				b2ballsbowled++;
				balltotal++;
			}
			else if(score.contains("1")) {
				b2s=b2s+1;
				leg=leg+1;
				b2ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+1;
				balltotal++;
			}
			else if(score.contains("2")) {
				b2s=b2s+2;
				leg=leg+2;
				b2ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				totalscore=totalscore+2;
				balltotal++;
			}
			else if(score.contains("3")) {
				b2s=b1s+1;
				b2ballsbowled++;
				leg=leg+3;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+3;
				balltotal++;
			}
			else if(score.contains("4")) {
				b2s=b1s+1;
				b2ballsbowled++;
				leg=leg+4;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				balltotal++;
				totalscore=totalscore+4;
			}
			
			
			
			
			
			else if(score.contains("noball")) {
				b2s=b2s+5;
				b2noball=b2noball+1;
                totalnoball++;
				totalscore=totalscore+5;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+4;
						p1fours++;
						pb1++;
						
					}
					else {
						p2=p2+4;
						p2fours++;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+4;
						p3fours++;
						pb3++;
				
					}
					else {
						p2=p2+4;
						pb2++;
						p4fours++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+4;
						 p4fours++;
							pb4++;
						
					 }
					 else {
						 p3=p3+4;
						 p3fours++;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+4;
						 p5fours++;
							pb5++;
						
					 }
					 else {
						 p4=p4+4;
						 p4fours++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+4;
						 p6fours++;
							pb6++;
						
					 }
					 else {
						 p5=p5+4;
						 p5fours++;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+4;
						 p7fours++;
							pb7++;
							
					 }
					 else {
						 p6=p6+4;
							pb6++;
							p6fours++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+4;
							pb8++;
							p8fours++;
							
					 }
					 else {
						 p7=p7+4;
							pb7++;
							p7fours++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+4;
						 p9fours++;
							pb9++;
							
					 }
					 else {
						 p8=p8+4;
						 p8fours++;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+4;
							pb10++;
							p10fours++;
							
					 }
					 else {
						 p9=p9+4;
						 p9fours++;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+4;
						 p11fours++;
							pb11++;
						
					 }
					 else {
						 p10=p10+4;
							pb10++;
							p10fours++;
					 }
					
					
				}
				balltotal++;
				b2ballsbowled++;
			}
				else if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
					totalwicket++;
				b2wicket++;
				b2ballsbowled++;
				balltotal++;
				if(totalwicket==1) {
					p1=p1+0;
					pb1++;
					striker=0;
				}
				if(totalwicket==2) {
					p2=p2+0;
					pb2++;
					striker=0;
					
				}	
				
				if(totalwicket==3) {
					p3=p3+0;
					pb3++;
					striker=0;
				}
					
				
				if(totalwicket==4) {
					p4=p4+0;
					pb4++;
					striker=0;
				}
					
				
				if(totalwicket==5) {
					p5=p5+0;
					pb5++;
					striker=0;
					
					
				}
				if(totalwicket==6) {
					p6=p6+0;
					pb6++;
					striker=0;
				}
				if(totalwicket==7) {
					p7=p7+0;
					pb7++;
					striker=0;
				}
				if(totalwicket==8) {
					p8=p8+0;
					pb8++;
					striker=0;
				}
				if(totalwicket==9) {
					p9=p9+0;
					pb9++;
					striker=0;
				}
				if(totalwicket==10) {
					p10=p10+0;
					pb10++;
					
				}
				
				
				wicketball=balltotal;
				 b2dot++;
				scoreatwicket=totalscore;
				}
			
			b2economy=(float) ((b2s*6.0)/b2ballsbowled);
			tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
			 }
	
	

	        
		
		

	 
else if((b3ballsbowled<6)&&(b2ballsbowled==12)&&(b1ballsbowled==12)||((b3ballsbowled<12)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled==6))||((b3ballsbowled<18)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled==12))||((b3ballsbowled<24)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled==18)))		

		  {
		  
		  if(score.contains("one")) {
			  if(totalwicket==0) {
					if(striker==0) {
						p1=p1+1;
						pb1++;
						striker=1;
					}
					else {
						p2=p2+1;
						pb2++;striker=0;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+1;
						pb3++;
						striker=1;
					}
					else {
						p2=p2+1;
						pb2++;striker=0;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+1;
							pb4++;
							striker=1;
					 }
					 else {
						 p3=p3+1;
							pb3++;striker=0;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+1;
							pb5++;
							striker=1;
					 }
					 else {
						 p4=p4+1;
							pb4++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+1;
							pb6++;
							striker=1;
					 }
					 else {
						 p5=p5+1;
							pb5++;striker=0;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+1;
							pb7++;
							striker=1;
					 }
					 else {
						 p6=p6+1;
							pb6++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+1;
							pb8++;
							striker=1;
					 }
					 else {
						 p7=p7+1;
							pb7++;striker=0;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+1;
							pb9++;
							striker=1;
					 }
					 else {
						 p8=p8+1;
							pb8++;striker=0;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+1;
							pb10++;
							striker=1;
					 }
					 else {
						 p9=p9+1;
							pb9++;striker=0;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+1;
							pb11++;
							striker=1;
					 }
					 else {
						 p10=p10+1;
							pb10++;striker=0;
					 }
					
					
				}
		  
		  b3ballsbowled++; balltotal=balltotal+1; b3s=b3s+1;totalscore=totalscore+1;
		  
		  } else if(score.contains("two")) { b3s=b3s+2;
		  if(totalwicket==0) {
				if(striker==0) {
					p1=p1+2;
					pb1++;
					
				}
				else {
					p2=p2+2;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+2;
					pb3++;
			
				}
				else {
					p2=p2+2;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+2;
						pb4++;
					
				 }
				 else {
					 p3=p3+2;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+2;
						pb5++;
					
				 }
				 else {
					 p4=p4+2;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+2;
						pb6++;
					
				 }
				 else {
					 p5=p5+2;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+2;
						pb7++;
						
				 }
				 else {
					 p6=p6+2;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+2;
						pb8++;
						
				 }
				 else {
					 p7=p7+2;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+2;
						pb9++;
						
				 }
				 else {
					 p8=p8+2;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+2;
						pb10++;
						
				 }
				 else {
					 p9=p9+2;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+2;
						pb11++;
					
				 }
				 else {
					 p10=p10+2;
						pb10++;
				 }
				
				
			}
		  totalscore=totalscore+2;b3ballsbowled++;
		  balltotal=balltotal+1; System.out.println(balltotal); } else
		  if(score.contains("three")) { b3s=b3s+3; b3ballsbowled++;
		  if(totalwicket==0) {
				if(striker==0) {
					p1=p1+3;
					pb1++;
					striker=1;
				}
				else {
					p2=p2+3;
					pb2++;striker=0;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+3;
					pb3++;
					striker=1;
				}
				else {
					p2=p2+3;
					pb2++;striker=0;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+3;
						pb4++;
						striker=1;
				 }
				 else {
					 p3=p3+3;
						pb3++;striker=0;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+3;
						pb5++;
						striker=1;
				 }
				 else {
					 p4=p4+3;
						pb4++;striker=0;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+3;
						pb6++;
						striker=1;
				 }
				 else {
					 p5=p5+3;
						pb5++;striker=0;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+3;
						pb7++;
						striker=1;
				 }
				 else {
					 p6=p6+3;
						pb6++;striker=0;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+3;
						pb8++;
						striker=1;
				 }
				 else {
					 p7=p7+3;
						pb7++;striker=0;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+3;
						pb9++;
						striker=1;
				 }
				 else {
					 p8=p8+3;
						pb8++;striker=0;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+3;
						pb10++;
						striker=1;
				 }
				 else {
					 p9=p9+3;
						pb9++;striker=0;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+3;
						pb11++;
						striker=1;
				 }
				 else {
					 p10=p10+3;
						pb10++;striker=0;
				 }
				
				
			}
		  totalscore=totalscore+3;
		  balltotal=balltotal+1; System.out.println(balltotal); } else
		  if(score.contains("four")) { b3s=b3s+4; b3ballsbowled++;
		  totalscore=totalscore+4;
		  if(totalwicket==0) {
				if(striker==0) {
					p1=p1+4;
					p1fours++;
					pb1++;
					
				}
				else {
					p2=p2+4;
					p2fours++;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+4;
					p3fours++;
					pb3++;
			
				}
				else {
					p2=p2+4;
					pb2++;
					p4fours++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+4;
					 p4fours++;
						pb4++;
					
				 }
				 else {
					 p3=p3+4;
					 p3fours++;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+4;
					 p5fours++;
						pb5++;
					
				 }
				 else {
					 p4=p4+4;
					 p4fours++;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+4;
					 p6fours++;
						pb6++;
					
				 }
				 else {
					 p5=p5+4;
					 p5fours++;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+4;
					 p7fours++;
						pb7++;
						
				 }
				 else {
					 p6=p6+4;
						pb6++;
						p6fours++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+4;
						pb8++;
						p8fours++;
						
				 }
				 else {
					 p7=p7+4;
						pb7++;
						p7fours++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+4;
					 p9fours++;
						pb9++;
						
				 }
				 else {
					 p8=p8+4;
					 p8fours++;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+4;
						pb10++;
						p10fours++;
						
				 }
				 else {
					 p9=p9+4;
					 p9fours++;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+4;
					 p11fours++;
						pb11++;
					
				 }
				 else {
					 p10=p10+4;
						pb10++;
						p10fours++;
				 }
				
				
			}
		  balltotal=balltotal+1; System.out.println(balltotal); } else
		  if(score.contains("six")) { b3s=b3s+6; b3ballsbowled++;
		  totalscore=totalscore+6;
		  
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+6;
					pb1++;
					p1six++;
					
				}
				else {
					p2=p2+6;
					pb2++;
					p2six++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+6;
					pb3++;
					p3six++;
			
				}
				else {
					p2=p2+6;
					pb2++;
					p2six++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+6;
						pb4++;
						p4six++;
					
				 }
				 else {
					 p3=p3+6;
						pb3++;
						p3six++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+6;
					 p5six++;
						pb5++;
					
				 }
				 else {
					 p4=p4+6;
					 p4six++;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+6;
						pb6++;
						p6six++;
				 }
				 else {
					 p5=p5+6;
						pb5++;
						p5six++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+6;
					 p7six++;
						pb7++;
						
				 }
				 else {
					 p6=p6+6;
						pb6++;
						p6six++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+6;
					 p8six++;
						pb8++;
						
				 }
				 else {
					 p7=p7+6;
					 p7six++;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+6;
						pb9++;
						p9six++;
				 }
				 else {
					 p8=p8+6;
						pb8++;
						p8six++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+6;
						pb10++;
						p10six++;
						
				 }
				 else {
					 p9=p9+6;
						pb9++;
						p9six++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+6;
					 p11six++;
						pb11++;
					
				 }
				 else {
					 p10=p10+6;
						pb10++;
						p10six++;
				 }
				
				
			}
		  balltotal=balltotal+1; System.out.println(balltotal); } else
		  if(score.contains("dot")) { b3s=b3s+0; b3dot++;
		  if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}b3ballsbowled++;
		  totalscore=totalscore+0;
		  balltotal=balltotal+1; System.out.println(balltotal); } else
		  if(score.contains("wide")) {
			  b3s=b3s+1; 
			  b3wide=b3wide+1;
			  totalwide++;
		  
		  
		  
		  
		  
		  totalscore=totalscore+1;} 
		  
			else if(score.contains("0")) {
				b3s=b3s+0;
			leg=leg+0;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
				totalscore=totalscore+0;
				b3ballsbowled++;
				balltotal++;
			}
			else if(score.contains("1")) {
				b3s=b3s+1;
				leg=leg+1;
				b3ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+1;
				balltotal++;
			}
			else if(score.contains("2")) {
				b3s=b3s+2;
				leg=leg+2;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				b3ballsbowled++;
				totalscore=totalscore+2;
				balltotal++;
			}
			else if(score.contains("3")) {
				b3s=b3s+1;
				b3ballsbowled++;
				leg=leg+3;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+3;
				balltotal++;
			}
			else if(score.contains("4")) {
				b3s=b3s+1;
				b3ballsbowled++;
				leg=leg+4;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				balltotal++;
				totalscore=totalscore+4;
			}
		  
		  
		  else
		  if(score.contains("noball")) { b3s=b3s+5; 
		  totalnoball++;b3noball=b3noball+1;
		  if(totalwicket==0) {
				if(striker==0) {
					p1=p1+4;
					p1fours++;
					pb1++;
					
				}
				else {
					p2=p2+4;
					p2fours++;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+4;
					p3fours++;
					pb3++;
			
				}
				else {
					p2=p2+4;
					pb2++;
					p4fours++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+4;
					 p4fours++;
						pb4++;
					
				 }
				 else {
					 p3=p3+4;
					 p3fours++;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+4;
					 p5fours++;
						pb5++;
					
				 }
				 else {
					 p4=p4+4;
					 p4fours++;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+4;
					 p6fours++;
						pb6++;
					
				 }
				 else {
					 p5=p5+4;
					 p5fours++;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+4;
					 p7fours++;
						pb7++;
						
				 }
				 else {
					 p6=p6+4;
						pb6++;
						p6fours++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+4;
						pb8++;
						p8fours++;
						
				 }
				 else {
					 p7=p7+4;
						pb7++;
						p7fours++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+4;
					 p9fours++;
						pb9++;
						
				 }
				 else {
					 p8=p8+4;
					 p8fours++;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+4;
						pb10++;
						p10fours++;
						
				 }
				 else {
					 p9=p9+4;
					 p9fours++;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+4;
					 p11fours++;
						pb11++;
					
				 }
				 else {
					 p10=p10+4;
						pb10++;
						p10fours++;
				 }
				
				
			}
		  totalscore=totalscore+5;
		  balltotal++;
		  b3ballsbowled++;} else
		  if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
			  totalwicket++;
			  scoreatwicket=totalscore;
			  b3wicket++; b3ballsbowled++;
			  if(totalwicket==1) {
					p1=p1+0;
					pb1++;
					striker=0;
				}
				if(totalwicket==2) {
					p2=p2+0;
					pb2++;
					striker=0;
					
				}	
				
				if(totalwicket==3) {
					p3=p3+0;
					pb3++;
					striker=0;
				}
					
				
				if(totalwicket==4) {
					p4=p4+0;
					pb4++;
					striker=0;
				}
					
				
				if(totalwicket==5) {
					p5=p5+0;
					pb5++;
					striker=0;
					
					
				}
				if(totalwicket==6) {
					p6=p6+0;
					pb6++;
					striker=0;
				}
				if(totalwicket==7) {
					p7=p7+0;
					pb7++;
					striker=0;
				}
				if(totalwicket==8) {
					p8=p8+0;
					pb8++;
					striker=0;
				}
				if(totalwicket==9) {
					p9=p9+0;
					pb9++;
					striker=0;
				}
				if(totalwicket==10) {
					p10=p10+0;
					pb10++;
					
				}
				
			  b3dot++;
		  balltotal=balltotal+1;
		  wicketball=balltotal;}
		  
		  b3economy=(float) ((b3s*6.0)/b3ballsbowled);
		  tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
		  }

else if((b3ballsbowled==6)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled<6)||((b3ballsbowled==12)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled<12))||((b3ballsbowled==18)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled<18))||((b3ballsbowled==24)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled<24)))
{
	if(score.contains("one")) {
		  if(totalwicket==0) {
				if(striker==0) {
					p1=p1+1;
					pb1++;
					striker=1;
				}
				else {
					p2=p2+1;
					pb2++;striker=0;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+1;
					pb3++;
					striker=1;
				}
				else {
					p2=p2+1;
					pb2++;striker=0;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+1;
						pb4++;
						striker=1;
				 }
				 else {
					 p3=p3+1;
						pb3++;striker=0;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+1;
						pb5++;
						striker=1;
				 }
				 else {
					 p4=p4+1;
						pb4++;striker=0;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+1;
						pb6++;
						striker=1;
				 }
				 else {
					 p5=p5+1;
						pb5++;striker=0;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+1;
						pb7++;
						striker=1;
				 }
				 else {
					 p6=p6+1;
						pb6++;striker=0;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+1;
						pb8++;
						striker=1;
				 }
				 else {
					 p7=p7+1;
						pb7++;striker=0;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+1;
						pb9++;
						striker=1;
				 }
				 else {
					 p8=p8+1;
						pb8++;striker=0;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+1;
						pb10++;
						striker=1;
				 }
				 else {
					 p9=p9+1;
						pb9++;striker=0;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+1;
						pb11++;
						striker=1;
				 }
				 else {
					 p10=p10+1;
						pb10++;striker=0;
				 }
				
				
			}
				totalscore=totalscore+1;
				b4s=b4s+1;
				b4ballsbowled++;
				balltotal++;
			}
			else if(score.contains("two")) {
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+2;
						pb1++;
						
					}
					else {
						p2=p2+2;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+2;
						pb3++;
				
					}
					else {
						p2=p2+2;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+2;
							pb4++;
						
					 }
					 else {
						 p3=p3+2;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+2;
							pb5++;
						
					 }
					 else {
						 p4=p4+2;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+2;
							pb6++;
						
					 }
					 else {
						 p5=p5+2;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+2;
							pb7++;
							
					 }
					 else {
						 p6=p6+2;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+2;
							pb8++;
							
					 }
					 else {
						 p7=p7+2;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+2;
							pb9++;
							
					 }
					 else {
						 p8=p8+2;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+2;
							pb10++;
							
					 }
					 else {
						 p9=p9+2;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+2;
							pb11++;
						
					 }
					 else {
						 p10=p10+2;
							pb10++;
					 }
					
					
				}
				b4s=b4s+2;
				b4ballsbowled++;
				totalscore=totalscore+2;
				balltotal++;
			}
			else if(score.contains("three")) {
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+3;
						pb1++;
						striker=1;
					}
					else {
						p2=p2+3;
						pb2++;striker=0;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+3;
						pb3++;
						striker=1;
					}
					else {
						p2=p2+3;
						pb2++;striker=0;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+3;
							pb4++;
							striker=1;
					 }
					 else {
						 p3=p3+3;
							pb3++;striker=0;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+3;
							pb5++;
							striker=1;
					 }
					 else {
						 p4=p4+3;
							pb4++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+3;
							pb6++;
							striker=1;
					 }
					 else {
						 p5=p5+3;
							pb5++;striker=0;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+3;
							pb7++;
							striker=1;
					 }
					 else {
						 p6=p6+3;
							pb6++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+3;
							pb8++;
							striker=1;
					 }
					 else {
						 p7=p7+3;
							pb7++;striker=0;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+3;
							pb9++;
							striker=1;
					 }
					 else {
						 p8=p8+3;
							pb8++;striker=0;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+3;
							pb10++;
							striker=1;
					 }
					 else {
						 p9=p9+3;
							pb9++;striker=0;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+3;
							pb11++;
							striker=1;
					 }
					 else {
						 p10=p10+3;
							pb10++;striker=0;
					 }
					
					
				}
				b4s=b4s+3;
				b4ballsbowled++;
				totalscore=totalscore+3;
				balltotal++;
			}
			else if(score.contains("four")) {
				b4s=b4s+4;
				b4ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+4;
						p1fours++;
						pb1++;
						
					}
					else {
						p2=p2+4;
						p2fours++;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+4;
						p3fours++;
						pb3++;
				
					}
					else {
						p2=p2+4;
						pb2++;
						p4fours++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+4;
						 p4fours++;
							pb4++;
						
					 }
					 else {
						 p3=p3+4;
						 p3fours++;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+4;
						 p5fours++;
							pb5++;
						
					 }
					 else {
						 p4=p4+4;
						 p4fours++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+4;
						 p6fours++;
							pb6++;
						
					 }
					 else {
						 p5=p5+4;
						 p5fours++;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+4;
						 p7fours++;
							pb7++;
							
					 }
					 else {
						 p6=p6+4;
							pb6++;
							p6fours++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+4;
							pb8++;
							p8fours++;
							
					 }
					 else {
						 p7=p7+4;
							pb7++;
							p7fours++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+4;
						 p9fours++;
							pb9++;
							
					 }
					 else {
						 p8=p8+4;
						 p8fours++;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+4;
							pb10++;
							p10fours++;
							
					 }
					 else {
						 p9=p9+4;
						 p9fours++;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+4;
						 p11fours++;
							pb11++;
						
					 }
					 else {
						 p10=p10+4;
							pb10++;
							p10fours++;
					 }
					
					
				}
				totalscore=totalscore+4;
				balltotal++;
			}
			else if(score.contains("six")) {
				b4s=b4s+6;
				totalscore=totalscore+6;
				b4ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+6;
						pb1++;
						p1six++;
						
					}
					else {
						p2=p2+6;
						pb2++;
						p2six++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+6;
						pb3++;
						p3six++;
				
					}
					else {
						p2=p2+6;
						pb2++;
						p2six++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+6;
							pb4++;
							p4six++;
						
					 }
					 else {
						 p3=p3+6;
							pb3++;
							p3six++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+6;
						 p5six++;
							pb5++;
						
					 }
					 else {
						 p4=p4+6;
						 p4six++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+6;
							pb6++;
							p6six++;
					 }
					 else {
						 p5=p5+6;
							pb5++;
							p5six++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+6;
						 p7six++;
							pb7++;
							
					 }
					 else {
						 p6=p6+6;
							pb6++;
							p6six++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+6;
						 p8six++;
							pb8++;
							
					 }
					 else {
						 p7=p7+6;
						 p7six++;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+6;
							pb9++;
							p9six++;
					 }
					 else {
						 p8=p8+6;
							pb8++;
							p8six++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+6;
							pb10++;
							p10six++;
							
					 }
					 else {
						 p9=p9+6;
							pb9++;
							p9six++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+6;
						 p11six++;
							pb11++;
						
					 }
					 else {
						 p10=p10+6;
							pb10++;
							p10six++;
					 }
					
					
				}
				balltotal++;
			}
			else if(score.contains("dot")) {
				b4s=b4s+0;
				b4dot++;
				 if(totalwicket==0) {
						if(striker==0) {
							p1=p1+0;
							pb1++;
							
						}
						else {
							p2=p2+0;
							pb2++;
						}
						
					}
					 
						
					if(totalwicket==1) {
						if(striker==0) {
							p3=p3+0;
							pb3++;
					
						}
						else {
							p2=p2+0;
							pb2++;
						}
						
					}	
				
					
					 if(totalwicket==2) {
						 if(striker==0) {
							 p4=p4+0;
								pb4++;
							
						 }
						 else {
							 p3=p3+0;
								pb3++;
						 }
						
						
					}
					
					 if(totalwicket==3) {
						 if(striker==0) {
							 p5=p5+0;
								pb5++;
							
						 }
						 else {
							 p4=p4+0;
								pb4++;
						 }
						
						
					}
					 
					 if(totalwicket==4) {
						 if(striker==0) {
							 p6=p6+0;
								pb6++;
							
						 }
						 else {
							 p5=p5+0;
								pb5++;
						 }
						
						
					}
			
					 if(totalwicket==5) {
						 if(striker==0) {
							 p7=p7+0;
								pb7++;
								
						 }
						 else {
							 p6=p6+0;
								pb6++;
						 }
						
						
					}
					 
					 if(totalwicket==6) {
						 if(striker==0) {
							 p8=p8+0;
								pb8++;
								
						 }
						 else {
							 p7=p7+0;
								pb7++;
						 }
						
						
					}
					 if(totalwicket==7) {
						 if(striker==0) {
							 p9=p9+0;
								pb9++;
								
						 }
						 else {
							 p8=p8+0;
								pb8++;
						 }
						
						
					}
					 
					 
					 if(totalwicket==8) {
						 if(striker==0) {
							 p10=p10+0;
								pb10++;
								
						 }
						 else {
							 p9=p9+0;
								pb9++;
						 }
						
						
					}
					 if(totalwicket==9) {
						 if(striker==0) {
							 p11=p11+0;
								pb11++;
							
						 }
						 else {
							 p10=p10+0;
								pb10++;
						 }
						
						
					}
				totalscore=totalscore+0;
				b4ballsbowled++;
				balltotal++;
			}
			else if(score.contains("wide")) {
				b4s=b4s+1;
				b4wide=b4wide+1;
				totalwide++;
				totalscore=totalscore+1;
			}
	
	
			else if(score.contains("0")) {
				b4s=b4s+0;
			leg=leg+0;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
				totalscore=totalscore+0;
				b4ballsbowled++;
				balltotal++;
			}
			else if(score.contains("1")) {
				b4s=b4s+1;
				leg=leg+1;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				b4ballsbowled++;
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+1;
				balltotal++;
			}
			else if(score.contains("2")) {
				b4s=b4s+2;
				leg=leg+2;
				b4ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				totalscore=totalscore+2;
				balltotal++;
			}
			else if(score.contains("3")) {
				b4s=b4s+1;
				b4ballsbowled++;
				leg=leg+3;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+3;
				balltotal++;
			}
			else if(score.contains("4")) {
				b4s=b4s+1;
				b4ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				leg=leg+4;
				balltotal++;
				totalscore=totalscore+4;
			}
	
	
	
	
	
	
			else if(score.contains("noball")) {
				b4s=b4s+5;
				totalnoball++;
				b4noball=b4noball+1;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+4;
						p1fours++;
						pb1++;
						
					}
					else {
						p2=p2+4;
						p2fours++;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+4;
						p3fours++;
						pb3++;
				
					}
					else {
						p2=p2+4;
						pb2++;
						p4fours++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+4;
						 p4fours++;
							pb4++;
						
					 }
					 else {
						 p3=p3+4;
						 p3fours++;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+4;
						 p5fours++;
							pb5++;
						
					 }
					 else {
						 p4=p4+4;
						 p4fours++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+4;
						 p6fours++;
							pb6++;
						
					 }
					 else {
						 p5=p5+4;
						 p5fours++;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+4;
						 p7fours++;
							pb7++;
							
					 }
					 else {
						 p6=p6+4;
							pb6++;
							p6fours++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+4;
							pb8++;
							p8fours++;
							
					 }
					 else {
						 p7=p7+4;
							pb7++;
							p7fours++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+4;
						 p9fours++;
							pb9++;
							
					 }
					 else {
						 p8=p8+4;
						 p8fours++;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+4;
							pb10++;
							p10fours++;
							
					 }
					 else {
						 p9=p9+4;
						 p9fours++;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+4;
						 p11fours++;
							pb11++;
						
					 }
					 else {
						 p10=p10+4;
							pb10++;
							p10fours++;
					 }
					
					
				}
				totalscore=totalscore+5;
				balltotal++;
				b4ballsbowled++;
			}
				else if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
					totalwicket++;
				b4wicket++;
				b4ballsbowled++;
				if(totalwicket==1) {
					p1=p1+0;
					pb1++;
					striker=0;
				}
				if(totalwicket==2) {
					p2=p2+0;
					pb2++;
					striker=0;
					
				}	
				
				if(totalwicket==3) {
					p3=p3+0;
					pb3++;
					striker=0;
				}
					
				
				if(totalwicket==4) {
					p4=p4+0;
					pb4++;
					striker=0;
				}
					
				
				if(totalwicket==5) {
					p5=p5+0;
					pb5++;
					striker=0;
					
					
				}
				if(totalwicket==6) {
					p6=p6+0;
					pb6++;
					striker=0;
				}
				if(totalwicket==7) {
					p7=p7+0;
					pb7++;
					striker=0;
				}
				if(totalwicket==8) {
					p8=p8+0;
					pb8++;
					striker=0;
				}
				if(totalwicket==9) {
					p9=p9+0;
					pb9++;
					striker=0;
				}
				if(totalwicket==10) {
					p10=p10+0;
					pb10++;
					
				}
				
				scoreatwicket=totalscore;
				balltotal++;
				wicketball=balltotal;
				 b4dot++;
			}
			
			b4economy=(float) ((b4s*6.0)/b4ballsbowled);
			tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
			
			
		}

else if((b3ballsbowled==24)&&(b2ballsbowled==12)&&(b1ballsbowled==12)&&(b4ballsbowled==24)&&(b5ballsbowled<6)||((b3ballsbowled==24)&&(b2ballsbowled==12)&&(b1ballsbowled==18)&&(b4ballsbowled==24)&&(b5ballsbowled<12))||((b3ballsbowled==24)&&(b2ballsbowled==18)&&(b1ballsbowled==18)&&(b4ballsbowled==24)&&(b5ballsbowled<18))||((b3ballsbowled==24)&&(b2ballsbowled==24)&&(b1ballsbowled==24)&&(b4ballsbowled==24)&&(b5ballsbowled<24)))
{
			if(score.contains("one")) { 
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+1;
						pb1++;
						striker=1;
					}
					else {
						p2=p2+1;
						pb2++;striker=0;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+1;
						pb3++;
						striker=1;
					}
					else {
						p2=p2+1;
						pb2++;striker=0;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+1;
							pb4++;
							striker=1;
					 }
					 else {
						 p3=p3+1;
							pb3++;striker=0;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+1;
							pb5++;
							striker=1;
					 }
					 else {
						 p4=p4+1;
							pb4++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+1;
							pb6++;
							striker=1;
					 }
					 else {
						 p5=p5+1;
							pb5++;striker=0;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+1;
							pb7++;
							striker=1;
					 }
					 else {
						 p6=p6+1;
							pb6++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+1;
							pb8++;
							striker=1;
					 }
					 else {
						 p7=p7+1;
							pb7++;striker=0;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+1;
							pb9++;
							striker=1;
					 }
					 else {
						 p8=p8+1;
							pb8++;striker=0;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+1;
							pb10++;
							striker=1;
					 }
					 else {
						 p9=p9+1;
							pb9++;striker=0;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+1;
							pb11++;
							striker=1;
					 }
					 else {
						 p10=p10+1;
							pb10++;striker=0;
					 }
					
					
				}
				totalscore=totalscore+1;
				b5s=b5s+1;
				b5ballsbowled++;
				balltotal++;
			}
			
				else if(score.contains("two")) {
					if(totalwicket==0) {
						if(striker==0) {
							p1=p1+2;
							pb1++;
							
						}
						else {
							p2=p2+2;
							pb2++;
						}
						
					}
					 
						
					if(totalwicket==1) {
						if(striker==0) {
							p3=p3+2;
							pb3++;
					
						}
						else {
							p2=p2+2;
							pb2++;
						}
						
					}	
				
					
					 if(totalwicket==2) {
						 if(striker==0) {
							 p4=p4+2;
								pb4++;
							
						 }
						 else {
							 p3=p3+2;
								pb3++;
						 }
						
						
					}
					
					 if(totalwicket==3) {
						 if(striker==0) {
							 p5=p5+2;
								pb5++;
							
						 }
						 else {
							 p4=p4+2;
								pb4++;
						 }
						
						
					}
					 
					 if(totalwicket==4) {
						 if(striker==0) {
							 p6=p6+2;
								pb6++;
							
						 }
						 else {
							 p5=p5+2;
								pb5++;
						 }
						
						
					}
			
					 if(totalwicket==5) {
						 if(striker==0) {
							 p7=p7+2;
								pb7++;
								
						 }
						 else {
							 p6=p6+2;
								pb6++;
						 }
						
						
					}
					 
					 if(totalwicket==6) {
						 if(striker==0) {
							 p8=p8+2;
								pb8++;
								
						 }
						 else {
							 p7=p7+2;
								pb7++;
						 }
						
						
					}
					 if(totalwicket==7) {
						 if(striker==0) {
							 p9=p9+2;
								pb9++;
								
						 }
						 else {
							 p8=p8+2;
								pb8++;
						 }
						
						
					}
					 
					 
					 if(totalwicket==8) {
						 if(striker==0) {
							 p10=p10+2;
								pb10++;
								
						 }
						 else {
							 p9=p9+2;
								pb9++;
						 }
						
						
					}
					 if(totalwicket==9) {
						 if(striker==0) {
							 p11=p11+2;
								pb11++;
							
						 }
						 else {
							 p10=p10+2;
								pb10++;
						 }
						
						
					}
				b5s=b5s+2;
				b5ballsbowled++;
				totalscore=totalscore+2;
				balltotal++;
			}
			else if(score.contains("three")) {
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+3;
						pb1++;
						striker=1;
					}
					else {
						p2=p2+3;
						pb2++;striker=0;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+3;
						pb3++;
						striker=1;
					}
					else {
						p2=p2+3;
						pb2++;striker=0;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+3;
							pb4++;
							striker=1;
					 }
					 else {
						 p3=p3+3;
							pb3++;striker=0;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+3;
							pb5++;
							striker=1;
					 }
					 else {
						 p4=p4+3;
							pb4++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+3;
							pb6++;
							striker=1;
					 }
					 else {
						 p5=p5+3;
							pb5++;striker=0;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+3;
							pb7++;
							striker=1;
					 }
					 else {
						 p6=p6+3;
							pb6++;striker=0;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+3;
							pb8++;
							striker=1;
					 }
					 else {
						 p7=p7+3;
							pb7++;striker=0;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+3;
							pb9++;
							striker=1;
					 }
					 else {
						 p8=p8+3;
							pb8++;striker=0;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+3;
							pb10++;
							striker=1;
					 }
					 else {
						 p9=p9+3;
							pb9++;striker=0;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+3;
							pb11++;
							striker=1;
					 }
					 else {
						 p10=p10+3;
							pb10++;striker=0;
					 }
					
					
				}
				b5s=b5s+3;
				b5ballsbowled++;
				totalscore=totalscore+3;
				balltotal++;
			}
			else if(score.contains("four")) {
				b5s=b5s+4;
				b5ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+4;
						p1fours++;
						pb1++;
						
					}
					else {
						p2=p2+4;
						p2fours++;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+4;
						p3fours++;
						pb3++;
				
					}
					else {
						p2=p2+4;
						pb2++;
						p4fours++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+4;
						 p4fours++;
							pb4++;
						
					 }
					 else {
						 p3=p3+4;
						 p3fours++;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+4;
						 p5fours++;
							pb5++;
						
					 }
					 else {
						 p4=p4+4;
						 p4fours++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+4;
						 p6fours++;
							pb6++;
						
					 }
					 else {
						 p5=p5+4;
						 p5fours++;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+4;
						 p7fours++;
							pb7++;
							
					 }
					 else {
						 p6=p6+4;
							pb6++;
							p6fours++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+4;
							pb8++;
							p8fours++;
							
					 }
					 else {
						 p7=p7+4;
							pb7++;
							p7fours++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+4;
						 p9fours++;
							pb9++;
							
					 }
					 else {
						 p8=p8+4;
						 p8fours++;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+4;
							pb10++;
							p10fours++;
							
					 }
					 else {
						 p9=p9+4;
						 p9fours++;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+4;
						 p11fours++;
							pb11++;
						
					 }
					 else {
						 p10=p10+4;
							pb10++;
							p10fours++;
					 }
					
					
				}
				totalscore=totalscore+4;
				balltotal++;
			}
			else if(score.contains("six")) {
				b5s=b5s+6;
				totalscore=totalscore+6;
				b5ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+6;
						pb1++;
						p1six++;
						
					}
					else {
						p2=p2+6;
						pb2++;
						p2six++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+6;
						pb3++;
						p3six++;
				
					}
					else {
						p2=p2+6;
						pb2++;
						p2six++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+6;
							pb4++;
							p4six++;
						
					 }
					 else {
						 p3=p3+6;
							pb3++;
							p3six++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+6;
						 p5six++;
							pb5++;
						
					 }
					 else {
						 p4=p4+6;
						 p4six++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+6;
							pb6++;
							p6six++;
					 }
					 else {
						 p5=p5+6;
							pb5++;
							p5six++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+6;
						 p7six++;
							pb7++;
							
					 }
					 else {
						 p6=p6+6;
							pb6++;
							p6six++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+6;
						 p8six++;
							pb8++;
							
					 }
					 else {
						 p7=p7+6;
						 p7six++;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+6;
							pb9++;
							p9six++;
					 }
					 else {
						 p8=p8+6;
							pb8++;
							p8six++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+6;
							pb10++;
							p10six++;
							
					 }
					 else {
						 p9=p9+6;
							pb9++;
							p9six++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+6;
						 p11six++;
							pb11++;
						
					 }
					 else {
						 p10=p10+6;
							pb10++;
							p10six++;
					 }
					
					
				}
				balltotal++;
			}
			else if(score.contains("dot")) {
				b5s=b5s+0;
				b5dot++;
				totalscore=totalscore+0;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				b5ballsbowled++;
				balltotal++;
			}
			else if(score.contains("wide")) {
				b5s=b5s+1;
				b5wide=b5wide+1;
				totalwide++;
				totalscore=totalscore+1;
			}
			
			
			
			
			else if(score.contains("0")) {
				b5s=b5s+0;
			leg=leg+0;
			if(totalwicket==0) {
				if(striker==0) {
					p1=p1+0;
					pb1++;
					
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}
			 
				
			if(totalwicket==1) {
				if(striker==0) {
					p3=p3+0;
					pb3++;
			
				}
				else {
					p2=p2+0;
					pb2++;
				}
				
			}	
		
			
			 if(totalwicket==2) {
				 if(striker==0) {
					 p4=p4+0;
						pb4++;
					
				 }
				 else {
					 p3=p3+0;
						pb3++;
				 }
				
				
			}
			
			 if(totalwicket==3) {
				 if(striker==0) {
					 p5=p5+0;
						pb5++;
					
				 }
				 else {
					 p4=p4+0;
						pb4++;
				 }
				
				
			}
			 
			 if(totalwicket==4) {
				 if(striker==0) {
					 p6=p6+0;
						pb6++;
					
				 }
				 else {
					 p5=p5+0;
						pb5++;
				 }
				
				
			}
	
			 if(totalwicket==5) {
				 if(striker==0) {
					 p7=p7+0;
						pb7++;
						
				 }
				 else {
					 p6=p6+0;
						pb6++;
				 }
				
				
			}
			 
			 if(totalwicket==6) {
				 if(striker==0) {
					 p8=p8+0;
						pb8++;
						
				 }
				 else {
					 p7=p7+0;
						pb7++;
				 }
				
				
			}
			 if(totalwicket==7) {
				 if(striker==0) {
					 p9=p9+0;
						pb9++;
						
				 }
				 else {
					 p8=p8+0;
						pb8++;
				 }
				
				
			}
			 
			 
			 if(totalwicket==8) {
				 if(striker==0) {
					 p10=p10+0;
						pb10++;
						
				 }
				 else {
					 p9=p9+0;
						pb9++;
				 }
				
				
			}
			 if(totalwicket==9) {
				 if(striker==0) {
					 p11=p11+0;
						pb11++;
					
				 }
				 else {
					 p10=p10+0;
						pb10++;
				 }
				
				
			}
				totalscore=totalscore+0;
				b5ballsbowled++;
				balltotal++;
			}
			else if(score.contains("1")) {
				b5s=b5s+1;
				leg=leg+1;
				b5ballsbowled++;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+1;
				balltotal++;
			}
			else if(score.contains("2")) {
				b5s=b5s+2;
				leg=leg+2;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				b5ballsbowled++;
				totalscore=totalscore+2;
				balltotal++;
			}
			else if(score.contains("3")) {
				b5s=b5s+1;
				b5ballsbowled++;
				leg=leg+3;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				if(striker==1) {
					striker=0;
				}
				else {
					striker=1;
				}
				totalscore=totalscore+3;
				balltotal++;
			}
			else if(score.contains("4")) {
				b5s=b5s+1;
				b5ballsbowled++;
				leg=leg+4;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+0;
						pb1++;
						
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+0;
						pb3++;
				
					}
					else {
						p2=p2+0;
						pb2++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+0;
							pb4++;
						
					 }
					 else {
						 p3=p3+0;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+0;
							pb5++;
						
					 }
					 else {
						 p4=p4+0;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+0;
							pb6++;
						
					 }
					 else {
						 p5=p5+0;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+0;
							pb7++;
							
					 }
					 else {
						 p6=p6+0;
							pb6++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+0;
							pb8++;
							
					 }
					 else {
						 p7=p7+0;
							pb7++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+0;
							pb9++;
							
					 }
					 else {
						 p8=p8+0;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+0;
							pb10++;
							
					 }
					 else {
						 p9=p9+0;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+0;
							pb11++;
						
					 }
					 else {
						 p10=p10+0;
							pb10++;
					 }
					
					
				}
				balltotal++;
				totalscore=totalscore+4;
			}
			else if(score.contains("noball")) {
				b5s=b5s+5;
				totalwide++;
				b5noball=b5noball+1;
				totalscore=totalscore+5;
				if(totalwicket==0) {
					if(striker==0) {
						p1=p1+4;
						p1fours++;
						pb1++;
						
					}
					else {
						p2=p2+4;
						p2fours++;
						pb2++;
					}
					
				}
				 
					
				if(totalwicket==1) {
					if(striker==0) {
						p3=p3+4;
						p3fours++;
						pb3++;
				
					}
					else {
						p2=p2+4;
						pb2++;
						p4fours++;
					}
					
				}	
			
				
				 if(totalwicket==2) {
					 if(striker==0) {
						 p4=p4+4;
						 p4fours++;
							pb4++;
						
					 }
					 else {
						 p3=p3+4;
						 p3fours++;
							pb3++;
					 }
					
					
				}
				
				 if(totalwicket==3) {
					 if(striker==0) {
						 p5=p5+4;
						 p5fours++;
							pb5++;
						
					 }
					 else {
						 p4=p4+4;
						 p4fours++;
							pb4++;
					 }
					
					
				}
				 
				 if(totalwicket==4) {
					 if(striker==0) {
						 p6=p6+4;
						 p6fours++;
							pb6++;
						
					 }
					 else {
						 p5=p5+4;
						 p5fours++;
							pb5++;
					 }
					
					
				}
		
				 if(totalwicket==5) {
					 if(striker==0) {
						 p7=p7+4;
						 p7fours++;
							pb7++;
							
					 }
					 else {
						 p6=p6+4;
							pb6++;
							p6fours++;
					 }
					
					
				}
				 
				 if(totalwicket==6) {
					 if(striker==0) {
						 p8=p8+4;
							pb8++;
							p8fours++;
							
					 }
					 else {
						 p7=p7+4;
							pb7++;
							p7fours++;
					 }
					
					
				}
				 if(totalwicket==7) {
					 if(striker==0) {
						 p9=p9+4;
						 p9fours++;
							pb9++;
							
					 }
					 else {
						 p8=p8+4;
						 p8fours++;
							pb8++;
					 }
					
					
				}
				 
				 
				 if(totalwicket==8) {
					 if(striker==0) {
						 p10=p10+4;
							pb10++;
							p10fours++;
							
					 }
					 else {
						 p9=p9+4;
						 p9fours++;
							pb9++;
					 }
					
					
				}
				 if(totalwicket==9) {
					 if(striker==0) {
						 p11=p11+4;
						 p11fours++;
							pb11++;
						
					 }
					 else {
						 p10=p10+4;
							pb10++;
							p10fours++;
					 }
					
					
				}
				balltotal++;
				b5ballsbowled++;
			}
				else if(score.contains("bowled")||score.contains("caught")||score.contains("LBW")||score.contains("stumped")) {
					totalwicket++;
				b5wicket++;
				b5ballsbowled++;
				scoreatwicket=totalscore;
				if(totalwicket==1) {
					p1=p1+0;
					pb1++;
					striker=0;
				}
				if(totalwicket==2) {
					p2=p2+0;
					pb2++;
					striker=0;
					
				}	
				
				if(totalwicket==3) {
					p3=p3+0;
					pb3++;
					striker=0;
				}
					
				
				if(totalwicket==4) {
					p4=p4+0;
					pb4++;
					striker=0;
				}
					
				
				if(totalwicket==5) {
					p5=p5+0;
					pb5++;
					striker=0;
					
					
				}
				if(totalwicket==6) {
					p6=p6+0;
					pb6++;
					striker=0;
				}
				if(totalwicket==7) {
					p7=p7+0;
					pb7++;
					striker=0;
				}
				if(totalwicket==8) {
					p8=p8+0;
					pb8++;
					striker=0;
				}
				if(totalwicket==9) {
					p9=p9+0;
					pb9++;
					striker=0;
				}
				if(totalwicket==10) {
					p10=p10+0;
					pb10++;
					
				}
				
				balltotal++;
				b5dot++;
				wicketball=balltotal;
			}
			
			b5economy=(float) ((b5s*6.0)/b5ballsbowled);
			tscore.setText(String.valueOf(totalscore)+"/"+String.valueOf(totalwicket));
			
			
		}


if(balltotal==6||balltotal==12||balltotal==18||balltotal==24||balltotal==30||balltotal==36||balltotal==42||balltotal==48||balltotal==54||balltotal==60||balltotal==66||balltotal==72||balltotal==78||balltotal==84||balltotal==90||balltotal==96||balltotal==102||balltotal==108||balltotal==114) {
	m=0;
	if(striker==1) {
		striker=0;
	}
	else if(striker==0){
		striker=1;
		
	}
	
	
}

if(pb1>0) {
	srate1=(p1*100)/pb1;
	}
	if(pb2>0) {
	srate2=(p2*100)/pb2;
	}
	if(pb3>0) {
		srate3=(p3*100)/pb3;
		}
	if(pb4>0) {
		srate4=(p4*100)/pb4;
		}
	if(pb5>0) {
		srate5=(p5*100)/pb5;
		}
	if(pb6>0) {
		srate6=(p6*100)/pb6;
		}
	if(pb7>0) {
		srate7=(p7*100)/pb7;
		}
	if(pb8>0) {
		srate8=(p8*100)/pb8;
		}
	if(pb9>0) {
		srate9=(p9*100)/pb9;
		}
	if(pb10>0) {
		srate10=(p10*100)/pb10;
		}
	if(pb11>0) {
		srate11=(p11*100)/pb11;
		}




if(balltotal<6) {
	o="0";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==6) {
	o="1";
}
else if((balltotal>6)&&(balltotal<12)) {
	o="1";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==12) {
	o="2";}
else if((balltotal>12)&&(balltotal<18)) {
	o="2";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==18) {
	o="3";}
else if((balltotal>18)&&(balltotal<24)) {
	o="3";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==24) {
	o="4";}
else if((balltotal>24)&&(balltotal<30)) {
	o="4";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==30) {
	o="5";}
else if((balltotal>30)&&(balltotal<36)) {
	o="5";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==36) {
	o="6";}
else if((balltotal>36)&&(balltotal<42)) {
	o="6";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==42) {
	o="7";}
else if((balltotal>42)&&(balltotal<48)) {
	o="7";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==48) {
	o="8";}
else if((balltotal>48)&&(balltotal<54)) {
	o="8";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==54) {
	o="9";}
else if((balltotal>54)&&(balltotal<60)) {
	o="9";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==60) {
	o="10";}
else if((balltotal>60)&&(balltotal<66)) {
	o="10";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==66) {
	o="11";}
else if((balltotal>66)&&(balltotal<72)) {
	o="11";
	if(score.contains("wide")) {
		m--;
	}
	m++;
}
else if(balltotal==72) {
	o="12";}
else if((balltotal>72)&&(balltotal<78)) {
	o="12";
	m++;
}
else if(balltotal==78) {
	o="13";}
else if((balltotal>78)&&(balltotal<84)) {
	o="13";
	m++;
}
else if(balltotal==84) {
	o="14";}
else if((balltotal>84)&&(balltotal<90)) {
	o="14";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==90) {
	o="15";}
else if((balltotal>90)&&(balltotal<96)) {
	o="15";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==96) {
	o="16";}
else if((balltotal>96)&&(balltotal<102)) {
	o="16";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==102) {
	o="17";}
else if((balltotal>102)&&(balltotal<108)) {
	o="17";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==108) {
	o="18";}
else if((balltotal>108)&&(balltotal<114)) {
	o="18";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==114) {
	o="19";}
else if((balltotal>114)&&(balltotal<120)) {
	o="19";
	m++;
	if(score.contains("wide")) {
		m--;
	}
}
else if(balltotal==120) {
	o="20";
	m=0;
}
if(balltotal>0) {
runrate=((totalscore*6)/balltotal);
}



if(totalwicket==1) {
	
	wicket1.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==2) {
	
	wicket2.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==3) {

wicket3.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==4) {

wicket4.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==5) {

wicket5.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==6) {

wicket6.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==7) {

wicket7.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==8) {

wicket8.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}
if(totalwicket==9) {

wicket9.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
}

if(totalwicket==10) {

wicket10.setText("W-"+totalwicket+" "+"B-"+wicketball+ " "+"run-"+scoreatwicket);
tran.stop();
}





		 
Object bo[]= {"Kapil Dev",b1ballsbowled,b1dot,b1s,b1wide,b1noball,b1wicket,b1economy};
df13.addRow(bo);
Object bo1[]= {"J Bumbrah",b2ballsbowled,b2dot,b2s,b2wide,b2noball,b2wicket,b2economy};
df13.addRow(bo1);

Object bo2[]= {"R Jadeja",b3ballsbowled,b3dot,b3s,b3wide,b3noball,b3wicket,b3economy};
df13.addRow(bo2);
Object bo3[]= {"R Ashwin",b4ballsbowled,b4dot,b4s,b4wide,b4noball,b4wicket,b4economy};
df13.addRow(bo3);
Object bo4[]= {"M Shami",b5ballsbowled,b5dot,b5s,b5wide,b5noball,b5wicket,b5economy};
df13.addRow(bo4);

table_13.setModel(df13);

Object ba[]= {"S Anwar",p1,pb1,p1fours,p1six,srate1};
df14.addRow(ba);
Object ba1[]= {"Salman Butt",p2,pb2,p2fours,p2six,srate2};
df14.addRow(ba1);

	
	  Object ba2[]= {"Babar Azam",p3,pb3,p3fours,p3six,srate3}; df14.addRow(ba2);
	  Object ba3[]= {"Younus Khan",p4,pb4,p4fours,p4six,srate4}; df14.addRow(ba3);
	  Object ba4[]= {"Mishbah ul haq",p5,pb5,p5fours,p5six,srate5}; df14.addRow(ba4);
	  Object ba5[]= {"Sarfraz Ahmaed",p6,pb6,p6fours,p6six,srate6}; df14.addRow(ba5);
	  Object ba6[]= {"S Afridi",p7,pb7,p7fours,p7six,srate7}; df14.addRow(ba6);
	  Object ba7[]= {"Wahab raiz",p8,pb8,p8fours,p8six,srate8};
	  df14.addRow(ba7); Object ba8[]= {"wasim akram",p9,pb9,p9fours,p9six,srate9};
	  df14.addRow(ba8); Object ba9[]= {"M Aamir",p10,pb10,p10fours,p10six,srate10};
	  df14.addRow(ba9); Object ba10[]= {"S Akthar",p11,pb11,p11fours,p11six,srate11};
	  df14.addRow(ba10);
table_15.setModel(df14);
		
		extra.setText("(L- "+leg+"  wide- "+totalwide+" N- "+totalnoball+")");
		overfield.setText(o+"."+String.valueOf(m));
		
		if(totalwicket==10||balltotal==120||(totalscore>target)) {
			if(allout==0) {
			  btnNewButton_3.doClick();}}
		
		
		
		
		 
		
	}
});
transbutton.setBounds(331, 398, 106, 23);
transbutton.setVisible(false);
contentPane.add(transbutton);
JLabel lblNewLabel_4 = new JLabel("BATSMAN CARD");
lblNewLabel_4.setBounds(664, 47, 107, 26);
contentPane.add(lblNewLabel_4);
JLabel lblNewLabel_5 = new JLabel("BOWLERS CARD");
lblNewLabel_5.setBounds(664, 378, 107, 29);
contentPane.add(lblNewLabel_5);
JLabel lblNewLabel_6 = new JLabel("FALL OF WICKET");
lblNewLabel_6.setBounds(664, 561, 107, 14);
contentPane.add(lblNewLabel_6);
JLabel lblOvers = new JLabel("OVERS");
lblOvers.setBounds(676, 323, 46, 14);
contentPane.add(lblOvers);
lblNewLabel_7 = new JLabel("Extras:");
lblNewLabel_7.setBounds(813, 323, 40, 14);
contentPane.add(lblNewLabel_7);


JLabel lblNewLabel_8 = new JLabel("DATA WAREHOUSE");
lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
lblNewLabel_8.setBounds(49, 315, 171, 20);
contentPane.add(lblNewLabel_8);
JLabel lblNewLabel_9 = new JLabel("TARGET");
lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_9.setBounds(533, 26, 52, 16);
contentPane.add(lblNewLabel_9);


btnNewButton_3 = new JButton("Finish");
btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		Result r=new Result();
		if((totalscore>target)&&(totalwicket<10)) {
		r.lblNewLabel.setText("PAKISTAN WON ");	
		tran.stop();
		}
		else {
			r.lblNewLabel.setText("INDIA WON");
			tran.stop();
		}
		r.setVisible(true);
		dispose();
	}
});
btnNewButton_3.setVisible(false);
btnNewButton_3.setBounds(1229, 360, 89, 23);
contentPane.add(btnNewButton_3);

JLabel lblNewLabel_10 = new JLabel("LEGBYE");
lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_10.setBounds(335, 512, 73, 20);
contentPane.add(lblNewLabel_10);
JLabel lblNewLabel_11 = new JLabel("HATRICKWICKET");
lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_11.setBounds(434, 516, 110, 14);
contentPane.add(lblNewLabel_11);
JLabel lblNewLabel_12 = new JLabel("LIFESAVER");
lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_12.setBounds(561, 516, 82, 14);
contentPane.add(lblNewLabel_12);
JLabel lblNewLabel_13 = new JLabel("TRANSMITTER");
lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
lblNewLabel_13.setBounds(335, 416, 95, 14);
contentPane.add(lblNewLabel_13);



}

public void actionPerformed(ActionEvent e) {
	

	  if(e.getSource()==hat) 
	{
		  if(runrate>8) {
		  
		  if((balltotal>59&&balltotal<=62))
		  {
		  	((javax.swing.Timer) tran).stop();
           hatrick.doClick();
           
		  	
		  	}
		  }
		  
	  }
	  if(e.getSource()==tran) 
	  {
	
		  transbutton.doClick();
		
	  }
	  
	  if((balltotal==63)) {
		  ((javax.swing.Timer) hat).stop();
		  ((javax.swing.Timer) tran).restart();
		 
		  transbutton.doClick();

	  }
	 
	  

	  
}
}

