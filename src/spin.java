

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/**
 *
 * @author Piet
 */
public class spin extends JFrame {
 
   /**
    * Creates new form Clock2
    */
   public spin(){
      ClockPanel clock = new ClockPanel(300, 300, 1);
      this.setContentPane(clock);
      clock.setLayout(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.pack();
      this.setLocationRelativeTo(null);
      this.setVisible(true);
      clock.startClock();
   }
 
    
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]){
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">  
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. 
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html  
       */
      try{
         for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }catch(ClassNotFoundException ex){
         java.util.logging.Logger.getLogger(spin.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }catch(InstantiationException ex){
         java.util.logging.Logger.getLogger(spin.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }catch(IllegalAccessException ex){
         java.util.logging.Logger.getLogger(spin.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }catch(javax.swing.UnsupportedLookAndFeelException ex){
         java.util.logging.Logger.getLogger(spin.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
      }
        //</editor-fold>  
 
      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable(){
         public void run(){
            new spin();
         }
      });
   }  // end of main()
}  // end class Clock2
 
/************************************************************************/
/*   the clock panel
/************************************************************************/
 
class ClockPanel extends JPanel {
    
   //-------------------------
   // decalrations
   //-------------------------
   int width;
   int heigth;
   int timeInterval;
   Timer timer;
   Font font = new Font("TimesRoman", Font.BOLD, 20);
    
   //----------------------------------------------
   // constructors
   //----------------------------------------------
   public ClockPanel() {
      this(300, 300, 1);
   }
   //-------------------------
   public ClockPanel(int width, int heigth, int timeInterval) {
      this.width = width;
      this.heigth = heigth;
      this.timeInterval = timeInterval;
       
      ActionListener al = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            repaint();
         }
      };
       
      timer = new Timer(1000 * timeInterval, al);
   }
    
   //----------------------------------------------
   // utility methods
   //----------------------------------------------
   public void startClock() {
      timer.start();
   }
    
   public void stopClock() {
      timer.stop();
   }
    
   //----------------------------------------------
   // preferredSize
   //----------------------------------------------
   @Override
   public Dimension getPreferredSize() {
      return new Dimension(width, heigth);
   }
 
   //----------------------------------------------
   //  paintComponent
   //----------------------------------------------
   @Override
   protected void paintComponent(Graphics g_normal) {
       
      //---------------------------------------------------
      // clear to background
      //---------------------------------------------------
      super.paintComponent(g_normal);
       
      //---------------------------------------------------
      //   declarations
      //---------------------------------------------------
      int xhour, yhour, xminute, yminute, xsecond;
      int ysecond, second, minute, hour;
      int xcenter, ycenter;
      int lastxs, lastys, lastxm, lastym, lastxh, lastyh;
       
      Date currentDate;
      SimpleDateFormat formatter=new SimpleDateFormat("s",Locale.getDefault());
       
      //---------------------------------------------------
      //   calculations
      //---------------------------------------------------
       
      currentDate=new Date();
      formatter.applyPattern("s");
      second=Integer.parseInt(formatter.format(currentDate));
      formatter.applyPattern("m");
      minute=Integer.parseInt(formatter.format(currentDate));
      formatter.applyPattern("h");
      hour=Integer.parseInt(formatter.format(currentDate));
       
      //----------------------------------------------------
      //   more calculations
      //----------------------------------------------------
       
      xcenter = this.getWidth() / 2;
      ycenter = this.getHeight() / 2;
       
      //----------------------------------------------------
      // if you change the size of your frame, then the
      // clock neatly adjusts its size, but the hands
      // do not. Now, change the following code such that
      // the hands have correct lengths...
      // Hint: think of your ellips formula's
      //----------------------------------------------
      xsecond=(int)(Math.cos(second*3.14f/30-3.14f/2) * xcenter * .8 + xcenter);
      ysecond=(int)(Math.sin(second*3.14f/30-3.14f/2) * xcenter * .8 + ycenter);
      //xminute=(int)(Math.cos(minute*3.14f/30-3.14f/2) * xcenter * .8 + xcenter);
      //yminute=(int)(Math.sin(minute*3.14f/30-3.14f/2) * xcenter * .8 + ycenter);
      //xhour=(int)(Math.cos((hour*30+minute/2)*3.14f/180-3.14f/2) * xcenter * .6 + xcenter);
      //yhour=(int)(Math.sin((hour*30+minute/2)*3.14f/180-3.14f/2) * xcenter * .6 + ycenter);
       
      //------------------------------------------------------
      // and finally, the drawings
      //------------------------------------------------------
       
      Graphics2D g = (Graphics2D) g_normal.create();
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                         RenderingHints.VALUE_ANTIALIAS_ON
      );
      g.setFont(font);
      //-------------------------------------------------------
      g.setColor(Color.black);
      g.fillOval(0, 0, getWidth(), getHeight());
 
      g.setColor(Color.green);
      g.drawString("4", 10, ycenter);
      g.drawString("6", getWidth() - 20, ycenter);
      g.drawString("NoBall", xcenter-20, 20);
      g.drawString("Wide", xcenter-20, getHeight() - 20);
       
      g.setColor(Color.ORANGE);
      g.drawLine(xcenter, ycenter, xsecond, ysecond);
      g.setStroke(new BasicStroke(3.0f));
      g.setColor(Color.red);
      //g.drawLine(xcenter, ycenter - 1, xminute, yminute);
      g.setColor(Color.BLUE);
      //g.drawLine(xcenter, ycenter-1, xhour, yhour);
   }
} 
   //----------------------------------------------
   //  end of class ClockPanel
   //----------------------------------------------