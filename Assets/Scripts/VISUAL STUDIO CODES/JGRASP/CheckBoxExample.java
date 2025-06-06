import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample extends JFrame implements ActionListener {
    JLabel label;
    JCheckBox cb1, cb2, cb3;
    JButton b;

    CheckBoxExample() {
        label = new JLabel("McdoLibee Ordering System");
        label.setBounds(50, 50, 300, 20);

        cb1 = new JCheckBox("Burger - 200");
        cb1.setBounds(100, 100, 150, 20);

        cb2 = new JCheckBox("Fries - 100");
        cb2.setBounds(100, 150, 150, 20);

        cb3 = new JCheckBox("Coke Float - 80");
        cb3.setBounds(100, 200, 150, 20);

        b = new JButton("Order");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);

        add(label);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";

        if (cb1.isSelected()) {
            amount += 200;
            msg += "Burger - 200\n";
        }
        if (cb2.isSelected()) {
            amount += 100;
            msg += "Fries - 100\n";
        }
        if (cb3.isSelected()) {
            amount += 80;
            msg += "Coke Float - 80\n";
        }

        msg += "-----------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
