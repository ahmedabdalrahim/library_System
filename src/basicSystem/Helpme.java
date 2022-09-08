package basicSystem;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Helpme {

    static public void error(String message) {
        
       
        UIManager.put("OptionPane.background", Color.decode("#FDD017"));
        UIManager.put("Panel.background", Color.decode("#FDD017"));
        UIManager.put("Button.background", Color.decode("#AF7817"));
        UIManager.put("Button.setForeground",(Color.decode("#7E3517")));                
        JOptionPane.showMessageDialog(null, message, "information", JOptionPane.INFORMATION_MESSAGE);
    }

    static public void form(JFrame forme, String titel, String img) {
        try {
            forme.setLocationRelativeTo(null);
            Image jpg = ImageIO.read(Helpme.class.getResource(img));
            forme.setIconImage(jpg);
            forme.setTitle(titel);
            forme.getContentPane().setBackground(Color.decode("#FDD017"));
            forme.setVisible(true);
        } catch (IOException ex) {
            error(ex.getMessage());
        }

    }

}
