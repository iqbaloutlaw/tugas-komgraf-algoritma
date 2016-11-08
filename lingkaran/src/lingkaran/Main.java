/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author CHhannZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("algoritma pembuat lingkaran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

        gambar gbr = new gambar();
        gbr.setxc(100);
        gbr.setyc(150);
        gbr.setr(50);
        frame.add(gbr);
    }

}
