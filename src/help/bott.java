
package help;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;





public class bott  extends JButton{

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("OverridableMethodCallInConstructor")
 public bott(){
 
 setOpaque(false);
 setContentAreaFilled(false);
 setForeground(Color.decode("#7E3517"));
 setCursor(new Cursor(Cursor.HAND_CURSOR));
 }

   
 
 @Override
 protected void paintComponent(Graphics g){
     g.setColor(Color.decode("#E9AB17"));
     g.fillRoundRect(0,0,getWidth()-1, getHeight()-1,30, 30);
     super.paintComponent(g);
 }
 @Override
 protected void paintBorder(Graphics g){
     g.setColor(Color.decode("#AF7817"));
     g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 30, 30);
 
 }
}
