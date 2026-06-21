package service;

import figure.Figure;

public class ShapeAreaService {

    public double countArea(Figure figure) {
        return figure.countArea();
    }

    public String formatArea(double area) {
        String value;
        if (area == (int) area) {
            value = Integer.toString((int) area);
        }
        else {
            value = Double.toString(area);
        }

        return value.replace(',', '.').strip();
    }

    public Double formatArea(String area) {
        return Double.parseDouble(area.replace(',', '.').strip());
    }
}