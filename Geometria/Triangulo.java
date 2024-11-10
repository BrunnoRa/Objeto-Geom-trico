package Geometria;
public class Triangulo extends ObjetoGeometrico {
    private double base;
    private double altura;

    Triangulo(double b, double a) {
    base = b;
    altura = a;
    
    }

    Triangulo(double b, double a, String c) {
        base = b;
        altura = a;
        cor = c;

    }

    public double getArea ( ) {
    area = base * altura /2;
    return area;
    }
    
    public double getPerimetro() {
        perimetro = 3 * base;
        return perimetro;
    }
   }
   