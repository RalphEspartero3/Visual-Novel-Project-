import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {


    BorderLayoutExample() {
        JFrame frame = new JFrame("Border Layout");

        JButton button, button1, button2, button3, button4;

        button = new JButton("left");
        button1 = new JButton("right");
        button2 = new JButton("top");
        button3 = new JButton("bottom");
        button4 = new JButton("center");

        frame.getContentPane().add(button, BorderLayout.WEST);
        frame.getContentPane().add(button1, BorderLayout.EAST);
        frame.getContentPane().add(button2, BorderLayout.NORTH);
        frame.getContentPane().add(button3, BorderLayout.SOUTH);
        frame.getContentPane().add(button4, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
