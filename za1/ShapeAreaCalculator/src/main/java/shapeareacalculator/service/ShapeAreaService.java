package service;

import figure.Figure;

public class ShapeAreaService {

    public double countArea(Figure figure) {
        return figure.countArea();
    }

    public String formatArea(double area){
        if (area == (int) area) {
            return String.valueOf((int) area).replace(',', '.').strip();
        }

        return String.valueOf(area).replace(',', '.').strip();
    }
}