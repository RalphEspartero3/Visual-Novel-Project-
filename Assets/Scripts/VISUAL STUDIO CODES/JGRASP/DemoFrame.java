import java.awt.*;
import javax.swing.*;
public class DemoFrame{

	public static void main(String[]args){

	JFrame frame = new JFrame("This is a Demo");
	frame.setSize(new Dimension(500,400));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setVisible(true);
	}
}