/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComboBox;

/**
 *
 * @author en-mokhtar
 */
public class comp extends JComboBox{
    public comp(){
 
 
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
