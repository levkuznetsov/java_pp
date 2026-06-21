package figure;

public abstract class Figure {
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double countArea();
}