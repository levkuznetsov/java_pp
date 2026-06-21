package figure.impl;

import figure.Figure;

public class Square extends Figure {
    private final double length;

    public Square(double length) {
        super("Квадрат");
        this.length = length;
    }

    @Override
    public double countArea() {
        return length * length;
    }

    public static Square of(double length) {
        return new Square(length);
    }
}
