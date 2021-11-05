/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reminder;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author Blaz
 */
public class AlarmSpawner extends JFrame {

    public AlarmSpawner() {
        ImageIcon icon=new ImageIcon("src/water drop.png");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,300);
        setLocation(-1250,300);
        getContentPane().setBackground(Color.blue);
        setIconImage(icon.getImage());
    }
    
    public static void  a() {
        AlarmSpawner AlarmS= new AlarmSpawner();
        ImageIcon icon=new ImageIcon("src/water drop.png");
        
        JOptionPane.showMessageDialog(AlarmS,"Drink water!","Drink water alarm",JOptionPane.INFORMATION_MESSAGE, icon); 
        AlarmS.dispose();
    }
}
