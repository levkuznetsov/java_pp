package figure.impl;

import figure.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    public static Circle of(double radius){
        return new Circle(radius);
    }
}
