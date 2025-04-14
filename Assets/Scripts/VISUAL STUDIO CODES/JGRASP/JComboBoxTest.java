import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JComboBoxTest {
    public static void main(String[] a) {
        JFrame f = new JFrame("My Combo Box");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel color = new JLabel("Colors:");
        f.getContentPane().add(color, BorderLayout.NORTH);

        String[] options = {"Red", "Green", "Blue"};
        MyComboBox list = new MyComboBox(options);
        list.setSelectedIndex(-1); // to deselect all items initially

        f.getContentPane().add(list, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    private static class MyComboBox extends JComboBox<String> implements ActionListener, ItemListener {
        static int count = 0;

        public MyComboBox(String[] options) {
            super(options); // to invoke the parent class constructor
            addActionListener(this);
            addItemListener(this);
            this.setSelectedIndex(-1);
        }

        public void actionPerformed(ActionEvent e) {
            count++;
            System.out.println(count + ": Action performed");
        }

        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                count++;
                System.out.println(count + ": Item state changed");
            }
        }
    }
}
