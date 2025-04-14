import java.awt.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoFrame extends JFrame {

    JComboBox<String> combo; // Added generic type to JComboBox
    JTextField txt;
    JLabel lbl; // Changed variable name from "Ibl" to "lbl"
    Container con = getContentPane();

    public DemoFrame () {
        super("Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] subject = { "Math", "Science", "English", "Filipino" }; // Corrected closing bracket

        lbl = new JLabel("Choose a subject:"); // Changed variable name from "Ibl" to "lbl"
        combo = new JComboBox<>(subject); // Added generic type to JComboBox
        txt = new JTextField(10);

        combo.setBackground(Color.BLUE);
        combo.setForeground(Color.YELLOW);

        con.setLayout(new FlowLayout());
        con.add(lbl);
        con.add(combo);

        combo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String str = (String) combo.getSelectedItem();
                txt.setText(str); // Moved the setText call inside the itemStateChanged method
            }
        });

        pack(); // Corrected the method name from "RWB" to "pack"
        con.add(txt); // Moved the addition of txt JTextField after the pack() method call
    }

    public static void main(String[] args) {
        DemoFrame frame = new DemoFrame();
        frame.setSize(350, 150);
        frame.setVisible(true);
    }
}
