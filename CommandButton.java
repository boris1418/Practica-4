package com.company;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CommandButton extends JButton {

    private int rate;
    private int number;
    ResultLabel resLabel;
    public CommandButton (String commandName, ResultLabel label, int x, int y, int number) {
        super(commandName);
        setSize(200,50);
        setLocation(x, y);
        this.rate = 0;
        this.resLabel = label;
        this.number = number;
        addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent a) {

            }

            public void mouseClicked(MouseEvent a) {
                rate++;
                if (number == 1) {
                    label.setFirst(rate);
                } else {
                    label.setSecond(rate);
                }
                label.showResult();
            }

            public void mouseEntered(MouseEvent a) {}

            public void mouseReleased(MouseEvent a) {}

            public void mousePressed(MouseEvent a) {}

        });
    }

    public int getRate () {
        return this.rate;
    }

    public void incRate() {
        this.rate++;
    }

}
