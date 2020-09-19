package com.company;

import javax.swing.JLabel;

public class ResultLabel extends JLabel {

    private int first;
    private int second;
    private WinLabel winner;
    public ResultLabel (String text, WinLabel winner, int x, int y) {
        super(text);
        setLocation(x, y);
        setSize(400, 50);
        this.winner = winner;
        this.first = 0;
        this.second = 0;
    }

    public void setFirst (int first) {
        this.first = first;
    }

    public void setSecond (int second) {
        this.second = second;
    }

    public void showResult () {
        setText("Result: " + first + "X" + second);
        winner.update(first, second);
    }

}
