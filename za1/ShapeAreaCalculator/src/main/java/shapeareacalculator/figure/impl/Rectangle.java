package figure.impl;

import figure.Figure;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        super("Прямоугольник");
        this.width = width;
        this.length = length;
    }

    @Override
    public double countArea() {
        return width * length;
    }

    public static Rectangle of(double width, double length){
        return new Rectangle(width, length);
    }
}
