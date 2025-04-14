import javax.swing.*;

public class ButtonExample2{
ButtonExample2(){
JFrame f=new JFrame("Button Example");
f.getContentPane().setLayout(null);
JButton b=new JButton(new ImageIcon("C:/Users/ceder/Downloads/download.jpg"));
b.setBounds(200,170,400,400);
f.getContentPane().add(b);
f.setSize(1000,1500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[]args){
   new ButtonExample2();
  }}