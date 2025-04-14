import javax.swing.*;

public class MyTabs {
    MyTabs() {
        // Create the frame
        JFrame frame = new JFrame();

        // Create a text box
        JTextField text = new JTextField(10);

        // Create panel 1
        JPanel p1 = new JPanel();
        // Add text box in panel 1
        p1.add(text);

        // Create panel 2
        JPanel p2 = new JPanel();

        // Create panel 3
        JPanel p3 = new JPanel();

        // Create the tab container
        JTabbedPane tabs = new JTabbedPane();
        // Set tab container position
        tabs.setBounds(40, 20, 300, 300);

        // Associate each panel with the corresponding tab
        tabs.add("General", p1);
        tabs.add("Display", p2);
        tabs.add("About", p3);

        // Add tabs to the frame
        frame.add(tabs);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyTabs();
    }
}


