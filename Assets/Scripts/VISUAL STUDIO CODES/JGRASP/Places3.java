import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Places3 extends JFrame implements ItemListener, ActionListener {
    // frame
    static JFrame f;
    // labels
    static JLabel label1, label2;
    // combobox
    static JComboBox<String> cb1;
    // textfield to add and delete items
    static JTextField tf;

    // main class
    public static void main(String[] args) {
        // create a new frame
        f = new JFrame("frame");
        // create an object
        Places3 s = new Places3();
        // set layout of frame
        f.setLayout(new FlowLayout());

        // array of string containing cities
        String s1[] = { "Caloocan", "Makati", "Taguig", "Bulacan", "Cavite" };

        // create combobox
        cb1 = new JComboBox<>(s1);

        // create textfield
        tf = new JTextField(16);

        // create add and remove buttons
        JButton b1 = new JButton("ADD");
        JButton b2 = new JButton("REMOVE");

        // add action listeners
        b1.addActionListener(s);
        b2.addActionListener(s);

        // add item listener
        cb1.addItemListener(s);

        // create labels
        label1 = new JLabel("Select your city ");
        label2 = new JLabel("Caloocan is selected");

        // set color of text
        label1.setForeground(Color.red);
        label2.setForeground(Color.blue);

        // create a new panel
        JPanel p = new JPanel();
        p.add(label1);
        // add combobox to panel
        p.add(cb1);
        p.add(label2);
        p.add(tf);
        p.add(b1);
        p.add(b2);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(700, 200);
        f.setVisible(true);
    }

    // if button is pressed
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("ADD")) {
            cb1.addItem(tf.getText());
        } else if (s.equals("REMOVE")) {
            cb1.removeItem(tf.getText());
        }
    }

    public void itemStateChanged(ItemEvent e) {
        // if the state of combobox is changed
        if (e.getSource() == cb1 && e.getStateChange() == ItemEvent.SELECTED) {
            label2.setText(cb1.getSelectedItem() + " is selected");
        }
    }
}