import javax.swing.*;
import java.awt.event.*;

public class TextAreaExample implements ActionListener {
    JLabel labelWords, labelChars;
    JTextArea area;
    JButton button;

    TextAreaExample() {
        JFrame f = new JFrame();

        labelWords = new JLabel();
        labelWords.setBounds(50, 25, 100, 30);

        labelChars = new JLabel();
        labelChars.setBounds(160, 25, 100, 30);

        area = new JTextArea();
        area.setBounds(20, 75, 250, 200);

        button = new JButton("Count Words");
        button.setBounds(100, 300, 120, 30);
        button.addActionListener(this);

        f.add(labelWords);
        f.add(labelChars);
        f.add(area);
        f.add(button);

        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s+"); // Split by one or more whitespace characters
        labelWords.setText("Words: " + words.length);
        labelChars.setText("Characters: " + text.length());
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}