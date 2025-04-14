import javax.swing.*;
import java.awt.*;
public class MainFrame{
	public static void main(String[]args){

	JFrame frame=new JFrame("Test Frame");
   JLabel sample=new JLabel("This is sample label");
	frame.setSize(400,300);
   frame.getContentPane().add(sample);
   frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}

