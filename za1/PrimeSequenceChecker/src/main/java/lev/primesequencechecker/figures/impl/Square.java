package figures.impl;

import figures.Figure;

public class Square extends Figure {
    private double length;

    public Square(double length) {
        super("Квадрат");
        this.length = length;
    }

    @Override
    protected double countArea() {
        return length * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}