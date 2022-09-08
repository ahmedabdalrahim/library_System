/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicSystem;

import static basicSystem.Helpme.error;
import gui.library;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author en-mokhtar
 */
public class ExtrLibrary {

    public static manager man = new manager(2);

    public static student stud = new student(2);
    public static borrow borr = new borrow();
    public static scientific bookalm = new scientific();
    public static scientific liter = new scientific();
    public static scientific booklet=new scientific();
    public static void run(JFrame f) {

        try {
            f.setLocationRelativeTo(null);
            Image jpg = ImageIO.read(ExtrLibrary.class.getResource("lib.png"));
            f.setIconImage(jpg);
            f.setTitle("Library");
            f.getContentPane().setBackground(Color.white);
            f.setVisible(true);
        } catch (IOException ex) {
            error(ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        numberday f=new numberday();
//        System.out.println(f.datea("30/01/2020"));
        library b = new library();
         run(b);
//        jstudents j = new jstudents();
//        run(j);
//        Object b[] = new Object[2];
////           
//     
//        man.setName("ahmed");
//        man.setPass("1245");
//        man.add();

    }

}
