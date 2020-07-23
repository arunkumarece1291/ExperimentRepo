package mymodule;
// integrated till DWH

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import mymodule.RandomNumber;
import mymodule.RandomNumber1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;






public class UpdatedTeam1 extends JFrame {
static Rectangle rect1;
private JPanel contentPane;
public static JTable table;
private static JTable table_1;
private static JTable table_2;
static JLabel lblNewLabel;
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
private JButton btnNewButton_1;
private JTable table_3;
private JTable table_4;
static DefaultTableModel model2;
static int rowCount;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {

UpdatedTeam1 frame = new UpdatedTeam1();
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
Object a[][] ={{"0"},
{"4"},
{"Wide"},
{"2"},
{"Catch"},
{"3"},
{"NoBall"},
{"6"},
{"LegBye"},
{"1"},
{"2"},
{"0"}};

Object cd[][] ={{"6"},
{"0"},
{"CleanBowled"},
{"1"},
{"2"},
{"Wide"},
{"4"},
{"2"},
{"LegBye"},
{"NoBall"},
{"0"},
{"4"}};


Object ef[][] ={{"LBW"},
{"0"},
{"1"},
{"2"},
{"3"},
{"4"},
{"6"},
{"6"},
{"CleanBowled"},
{"0"},
{"0"},
{"1"}};

String b []= {""};
private JTable table_5;






public UpdatedTeam1() {
initialize();
}


private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 994, 730);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);




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
			{"6"},
			{"LegBye"}};
	table_3.setModel(new DefaultTableModel(zz,b));
	
}
if(count>=5 && count<=8||count>=17 && count<=20 ||count>=29 && count<=32||count>=41 && count<=44||count>=53 && count<=56||count>=65 && count<=68||count>=77 && count<=80||count>=89 && count<=92||count>=101 && count<=104||count>=113 && count<=116)
{
	Object xx[][] ={{"2"},
			{"3"},
			{"1"},
			{"lbw"}};
	table_3.setModel(new DefaultTableModel(xx,b));
	
}
if(count>=9 && count<=12||count>=21 && count<=24 ||count>=33 && count<=36||count>=45 && count<=48||count>=57 && count<=60||count>=69 && count<=72||count>=81 && count<=84||count>=93 && count<=96||count>=105 && count<=108||count>=117 && count<=120)
{
	Object cc[][] ={{"noball"},
			{"6"},
			{"4"},
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

}
}

