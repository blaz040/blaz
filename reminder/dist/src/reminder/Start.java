/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reminder;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Blaz
 */
public class Start {
    int minutes;
   
   public void s(){ 
        Timer time=new Timer();
        MyTimerTask b=new MyTimerTask();
        Date c=new Date();

        int miliseconds=5*60*1000;
        
        time.schedule(b, c,miliseconds);
        
   }    
   public void custom(){
       Timer time=new Timer();
       MyTimerTask b=new MyTimerTask();
       Date c=new Date();
        
       int minutes=Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of minutes you want to be reminded"));
       int curMinutes=c.getMinutes();
       
       while(curMinutes%minutes!=0){
           curMinutes=c.getMinutes();
       }
       
       int mseconds=minutes*60*1000;
       
       time.schedule(b, c,mseconds);
       
   }
    
    class MyTimerTask extends TimerTask  {
        
      @Override
      public void run() {
        
          AlarmSpawner AlarmS = new AlarmSpawner();
          AlarmSpawner.a();
          AlarmS.dispose();
        
      }
}
}
