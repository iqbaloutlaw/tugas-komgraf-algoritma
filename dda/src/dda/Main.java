/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dda;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CHHANNZ
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public Main() {
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                     
        JFrame frame = new JFrame("algoritma garis dda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs = new garis();
        grs.setx1(10);
        grs.sety1(20);
        grs.setx2(100);
        grs.sety2(60);
        grs.setBackground(Color.WHITE);
        frame.add(grs);
        frame.setSize(600,480);
        frame.setVisible(true);
    }
}
