package lesson8.calc;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Win {

    public static void main(String[] args) {
        JFrame window = new JFrame("Title");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        JButton b1 = new JButton("+");
        b1.setSize(200, 200);
        panel.add(b1, BorderLayout.EAST);
        panel.add(new JButton(), BorderLayout.WEST);
        panel.add(new JButton(), BorderLayout.SOUTH);
        panel.add(new JButton(), BorderLayout.NORTH);
        panel.add(new JButton(), BorderLayout.CENTER);
        window.add(panel);
        window.setSize(500, 500);
        //window.setResizable(false);
        window.setVisible(true);
    }
}
