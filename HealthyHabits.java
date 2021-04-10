import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;

public class HealthyHabits extends JPanel

{
   private JLabel label;
   private JTextField box;
   private JButton button;
   private JButton button2;
   private int num=0;
   public HealthyHabits()
   {
      setLayout(new FlowLayout());
      
      label = new JLabel("Fruit per day?");
      label.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
      //label.setForeground(Color.blue);
      add(label);
      button = new JButton("2 cups");
      button.addActionListener(new Listener());
      add(button);
      button2 = new JButton("0.5 cups");
      button2.addActionListener(new Listener2());
      add(button2);
      
       
      
     
   
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(num==0){
            label.setText("CORRECT!");
            num++;
            label.setText("Vegetables?");
            button.setText("2 1/2 cups");
            button2.setText("1 1/2 cups");
         }
         else if(num==1){
            label.setText("CORRECT!");
            num++;
            label.setText("Grains?");
            button.setText("4 ounces");
            button2.setText("6 ounces");
         }
         else if(num==2){
            label.setText("WRONG :(");
         }
         else if(num==3){
            label.setText("WRONG :(");
         }
         else if(num==4){
            label.setText("REMINDERS");
            button.setText("About COVID");
            button2.setText("About Hydration");
            num++;
         }
         else if(num==5){
         //covid
            int ran = (int)(Math.random()*6)+ 1;
            if(ran==1){
               label.setText("Remember to wear a mask! Masks block roughly 50% of the particles that leave your mouth, which helps protect others.!");
            }
            else if(ran==2){
               label.setText("Remember to socially distance! Socially distancing helps prevent the virus from spreading between people through both contact and airborne particles.");
            }
            else if(ran==3){
               label.setText("Remember to avoid touching your face! This can transmit virus particles from your hands to your face where there are places for them to enter your body.");
            }
            else if(ran==4){
               label.setText("Avoid places with poor ventilation! Poor ventilation allows virus particles to remain in an area longer, giving them more chances to find hosts and multiply.");
            }
            else if(ran==5){
               label.setText("Remember to disinfect hard surfaces! The virus can live alone on them for two to three days after making contact.");
            } 
            else if(ran==6){
               label.setText("Remember to wash your hands after being exposed to public places, before eating, and after touching anything that has a high risk of having germs");
            }
         
           
         
         }
         
         
         
         
      }
   
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(num==0){
            label.setText("WRONG :(");
         }
         else if(num==1){
            label.setText("WRONG :(");
         }
         else if(num==2){
            
            //label.setText("CORRECT!");
            num++;
            label.setText("Protein?");
            button.setText("5 1/2 ounces");
            button2.setText("8 1/2 ounces");
         }
         else if(num==3){
            //label.setText("CORRECT!");
            num++;
            label.setText("Dairy?");
            button.setText("5 cups");
            button2.setText("3 cups");
         }
         else if(num==4){
            label.setText("WRONG :(");
         
         }
         else if(num==5){
         //hydration 
            int ran = (int)(Math.random()*6)+ 1;
            if(ran==1){
               label.setText("The average man needs to drink about 3.7 liters of water a day, while the average woman needs about 2.7 liters.");
            
            }
            else if(ran==2){
               label.setText("Drinking water before a meal helps prevent overeating.");
            }
            else if(ran==3){
               label.setText("Drinking water helps keep energy levels up during the day as well as helping cognitive function.");
            }
            else if(ran==4){
               label.setText("Drinking water throughout the day helps prevent headaches.");
            }
            else if(ran==5){
               label.setText("Drinking water helps your skin stay hydrated and healthy.");
            } 
            else if(ran==6){
               label.setText("Drinking a lot of water while exercising, especially in warmer temperatures, helps your body maintain a healthy temperature and avoid heat illness.");
            }
           
         }
      
      
      
          
         
        
         
         
         
      }
   
   }

}

class Driver01
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("PuzzleRem");
      frame.setSize(1400,200);
      frame.setLocation(0,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new HealthyHabits());
      frame.setVisible(true);
   }
}