package com.company;

import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Table");
        frame.setLayout(null);
        frame.setPreferredSize(new Dimension(400,300));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        WinLabel winner = new WinLabel("WINER: DRAW", 20, 100);
        frame.getContentPane().add(winner);
        ResultLabel label = new ResultLabel("Result: 0X0", winner,20, 50);
        frame.getContentPane().add(label);

        CommandButton command1 = new CommandButton(
                "AC Milan",
                label,
                0,
                0,
                1
        );
        CommandButton command2 = new CommandButton(
                "Real Madrid",
                label,
                200,
                0,
                2
        );

        frame.getContentPane().add(command1);
        frame.getContentPane().add(command2);

        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.addWindowListener(new WindowListener() {

            public void windowActivated(WindowEvent event) {
            }

            public void windowClosed(WindowEvent event) {
            }


            public void windowDeactivated(WindowEvent event) {
            }

            public void windowDeiconified(WindowEvent event) {
            }

            public void windowIconified(WindowEvent event) {
            }

            public void windowOpened(WindowEvent event) {
            }

            public void windowClosing(WindowEvent event) {
                Object[] options = {"Да", "Нет!"};
                int rc = JOptionPane.showOptionDialog(
                        event.getWindow(), "Закрыть окно?",
                        "Подтверждение", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (rc == 0) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }
        });

    }
}