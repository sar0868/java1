package lesson8.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class XO extends JFrame {

    static int counter = 0;

    public XO() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(400, 400);
        JPanel p = new JPanel(new GridLayout(3,3));
        JButton [][] btns = new JButton[3][3];
        System.out.println(Arrays.deepToString(btns));
        //NPE null pointer exception

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btns[i][j] = new JButton();
                JButton copy = btns[i][j];
                int finalI = i;
                int finalJ = j;
                copy.addActionListener(e -> {
                    counter++;
                    copy.setText("X");
                    if (counter == 9) {
                        JFrame dialog = new JFrame("Start new game");
                        dialog.setSize(300, 100);
                        dialog.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        dialog.setLocation(400, 500);
                        JButton start = new JButton("Начать новую игру");
                        start.addActionListener(action -> {
                            new XO();
                            counter = 0;
                            dispose();
                            dialog.dispose();
                        });
                        dialog.add(start);
                        dialog.setResizable(false);
                        dialog.setVisible(true);
                    }
                    moveAI(btns);
                    //if (counter == 9) {}
                    copy.setEnabled(false);
                    System.out.printf("Button[%d][%d] clicked\n", finalI, finalJ);
                });
                p.add(btns[i][j]);
            }
        }
        new Thread(()->{
            while (true) {
                if (btns[0][0] != null) {
                    btns[0][0].setText(String.valueOf(System.currentTimeMillis()));
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        add(p);
        setVisible(true);
    }

    private void moveAI(JButton[][] btns) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (btns[i][j].getText().isEmpty()) {
                    btns[i][j].setText("O");
                    btns[i][j].setEnabled(false);
                    counter++;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        new XO();
    }
}
