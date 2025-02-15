package core.basesyntax;

import java.awt.*;

public class Ball {
private Color color;
private int number;
public Ball(Color color, int number) {
    this.color = color;
    this.number = number;
}
    public Color getColor() {
        return color;
    }
    public int getNumber() {
        return number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Ball{"
                + "color ='" + color + '\''
                + ", number=" + number;
    }
}
