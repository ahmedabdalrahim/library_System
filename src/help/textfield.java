
package help;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTextField;



public class textfield  extends JTextField{

 public textfield(int x){
 super(x);
 setOpaque(false);
 }
 
 @Override
 protected void paintComponent(Graphics g){
     
     g.setColor(Color.decode("#FDD017"));
     g.fillRoundRect(0,0,getWidth()-1, getHeight()-1,30, 30);
     super.paintComponent(g);
 }
 @Override
 protected void paintBorder(Graphics g){
     g.setColor(Color.decode("#AF7817"));
     g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 30, 30);
 
 }
}
