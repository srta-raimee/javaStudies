package modulo8.entities;

public class Triangle {
    public double a, b, c, p, area;

    public double calcularArea(){
        p = (a + b + c) / 2.0;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
