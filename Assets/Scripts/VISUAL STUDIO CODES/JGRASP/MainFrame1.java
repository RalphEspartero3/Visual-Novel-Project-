import javax.swing.*;
import java.awt.*;
public class MainFrame1{

   public static void main(String[]args){
     JFrame frame = new JFrame("Test Frame");
     JLabel sample=new JLabel("Kim Dahyun");
     frame.getContentPane().setLayout(null);
     frame.setSize(400,300);
     frame.getContentPane().add(sample);
     frame.getContentPane().setBackground(Color.YELLOW);
     sample.setBounds(50,100,200,20);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    }     