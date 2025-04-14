import javax.swing.*;
public class Frame1{
   public static void main(String[]args){
      JFrame frame=new JFrame();
      frame.setBounds(100,100,450,300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      
     JButton btnNewButton=new JButton("New Button");
     btnNewButton.setBounds(58,73,117,29);
     frame.getContentPane().add(btnNewButton);

     
     JLabel sample=new JLabel("annyeong oncue!");
     sample.setBounds(158,17,200,50);
     frame.getContentPane().add(sample);
     
     frame.setSize(400,500);
     frame.setVisible(true);
     frame.getContentPane().setBackground(Color.YELLOW);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }}
