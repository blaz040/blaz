/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reminder;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

 
 
       
public class Reminder extends JFrame {

   JButton  startButton;
   JButton  exitButton;
   JButton  funcButton;  
   JButton  timeButton;
   JButton  random;
   JButton  ok; 
   JTextField t;
   JTextField t1;
   JFrame f;
   
   public static void main(String[] args) {
       
       new Reminder();
    
   }

   

     private Reminder() {
        ImageIcon icon=new ImageIcon("src/bell.png");
        JFrame mainFrame=new JFrame();
        mainFrame.getContentPane().setLayout(null);
        mainFrame.getContentPane();
        mainFrame.setTitle("Reminder");
        mainFrame.setSize(400, 300);
        mainFrame.setLocation(803, 427);
        mainFrame.setLayout(new BorderLayout(10,10));
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setIconImage(icon.getImage());
        
        JPanel mainPanel =new JPanel();
        mainPanel.setPreferredSize(new Dimension(100,100));
        
        JLabel label=new JLabel();
        label.setText("Here you can start the reminder and end it");
        label.setFont(new Font("Ariel",Font.PLAIN,20));
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel secondPanel=new JPanel();
        secondPanel.setPreferredSize(new Dimension(100,100));
        
        startButton=new JButton("start");
        startButton.addActionListener(new Action());
                
        exitButton =new JButton("EXIT!");
        exitButton.addActionListener(new Action());
        
        funcButton=new JButton("alarm spawner");
        funcButton.addActionListener(new Action());
        
        timeButton=new JButton("set custom time to remind");
        timeButton.addActionListener(new Action());
        
        random=new JButton("random number");
        random.addActionListener(new Action());
        
        mainPanel.add(label);
        secondPanel.add(startButton);
        secondPanel.add(exitButton);
        secondPanel.add(funcButton);
        secondPanel.add(timeButton);
        secondPanel.add(random);
        mainFrame.add(secondPanel,BorderLayout.SOUTH);
        mainFrame.add(mainPanel,BorderLayout.NORTH);
        
    }


    

    

        public class Action implements ActionListener{
           @Override
            public void actionPerformed(ActionEvent e){
             
                if(e.getSource()== startButton){
                    Start start = new Start();
                    start.s();
                }
                if(e.getSource()== exitButton){
                    System.exit(1);
                }
                if(e.getSource()== funcButton){
                     new AlarmSpawner();
                }
                if(e.getSource()== timeButton){
                    
                    Start start =new Start();
                    start.custom();
                }
                if(e.getSource() == random){
                    random();
                }
                if(e.getSource()==ok){
                        fNumber(number());
                }
                
            }
       }
        
        public void random(){
              f =new JFrame();
             JLabel l= new JLabel("Vpiši zgornjo in spodnjo mejo za generacijo naključnega števila");
             JPanel p=new JPanel();
             JPanel p1=new JPanel();
             
             t =new JTextField();
             t1= new JTextField();
             ok=new JButton("ok");
             
             t.setPreferredSize(new Dimension(50,20));
             t1.setPreferredSize(new Dimension(50,20));
             
             ok.addActionListener(new Action());
             p1.add(l);
                     
             p.add(t);
             p.add(t1);
             p.add(ok);
             
             f.setLayout(new BorderLayout(10,10));
             f.add(p,BorderLayout.SOUTH);
             f.add(p1,BorderLayout.NORTH);
             f.setLocation(803, 427);
             f.pack();
             f.setVisible(true);
            
        }
        
        public int number(){
               int z =Integer.parseInt(t.getText());
               int s=Integer.parseInt(t1.getText());
               
               if (z<s){
                   int a=s;
                   s=z;
                   z=a;
               }
               
            return (int)(Math.random()*z+s);
        }
        public void fNumber(Integer number){
            int z =Integer.parseInt(t.getText());
            int s=Integer.parseInt(t1.getText());
             JOptionPane.showMessageDialog(f,"Random Number between: "+z+" and "+s+" : \n                                 "+number);
            /*String a= ""+number;
            JFrame f=new JFrame();
            JLabel l=new JLabel();
            JPanel p= new JPanel();
            
            l.setText(a);
            l.setFont(new Font("Ariel",Font.PLAIN,70));
            
            p.add(l);
            
            f.add(p);
            f.setLocation(803, 427);
            f.pack();
            f.setVisible(true);
           */        
        }
}




/*class Test extends TimerTask {
      public void Frame(){
           JPanel panel=new JPanel();
           JFrame frame=new JFrame("drink");
           JButton button=new JButton("cancel");
           ImageIcon image=new ImageIcon("src/fbi KEKW.png");
           JLabel label=new JLabel(image);
           JLabel label1=new JLabel("drink water Madge");
            panel.add(label);
           panel.add(label1);
           panel.add(button);
           frame.add(panel);
           frame.setLocation(-1250,350);
           frame.setSize(image.getIconWidth()+10,image.getIconHeight()+100);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           frame.setVisible(true);
           button.addActionListener(new Action());
           
       }
      public class Action implements ActionListener{
           
         public void actionPerformed(ActionEvent e){

         }
       }
  
      @Override
      public void run() {
          
          Frame();
          cancel();
      }
      
   
}
class MyTimerTask extends TimerTask  {
    JButton button;
    JButton no;
    JButton yes;
    JButton ok;
    JFrame frame1;
    JFrame frame;
      public  void frame(){
          
           JPanel panel=new JPanel();
           frame=new JFrame();
           button=new JButton("Click me to stop the program");
           ok=new JButton("ok");
           ImageIcon image=new ImageIcon("a victory.png");
           JLabel label=new JLabel();
           
           label.setText("Drink water");
           label.setIcon(image);
           label.setVerticalTextPosition(JLabel.BOTTOM);
           label.setHorizontalTextPosition(JLabel.CENTER);
           
           ok.addActionListener(new Action());
           ok.setVerticalAlignment(JButton.CENTER);
           
           panel.add(button);
           panel.add(label);
           frame.add(panel);
           frame.setLocation(-1250,350);
           frame.setSize(image.getIconWidth()+20,image.getIconHeight()+100);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           frame.setVisible(true);
           button.addActionListener(new Action());
           
       }
       
      public void newWindow(){
          frame1 =new JFrame();
          no= new JButton();
          yes=new JButton();
          JPanel panel=new JPanel();
          JLabel label=new JLabel();
          
          
          label.setText("Are you sure");
          label.setFont(new Font("MW Boli",Font.PLAIN,20));
          label.setLocation(JLabel.CENTER, 1);
          
          yes.setText("yes");
          no.setText("no");
          yes.setBounds(100,400,100,50);
          no.setBounds(200,400, 50, 50);
          yes.addActionListener(new Action());
          no.addActionListener(new Action());
                 
          panel.add(yes);
          panel.add(no);
          panel.add(label);
          frame1.add(panel);
          frame1.setSize(200, 100);
          frame1.setVisible(true);
          frame1.setLocation(-1250, 350);
          
                 
      }

      public class Action implements ActionListener{
        
         @Override
         public void actionPerformed(ActionEvent e){
             
        
         
             if(e.getSource() == button){
                    newWindow();
             }
                 
             if(e.getSource()== yes){
                    System.exit(2);
             }
             
             if(e.getSource()== no){
                 frame1.setVisible(false);
             }
             if(e.getSource()== ok){
                 
             }
                
             
         }
      }
  
      @Override
      public void run() {
          
          frame();
          
      }

}
*/ 

