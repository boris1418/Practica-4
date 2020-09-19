package com.company;

import javax.swing.JLabel;

public class WinLabel extends JLabel {
    public WinLabel (String text, int x, int y) {
        super(text);
        setLocation(x, y);
        setSize(400, 50);
    }
    public void update (int first, int second) {
        if (first > second) {
            setText("WINNER: AC Milan");
        } else if (first == second) {
            setText("WINNER: DRAW");
        } else {
            setText("WINNER: Real Madrid");
        }
    }
}
