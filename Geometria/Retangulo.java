package Geometria;
public class Retangulo extends ObjetoGeometrico {
    private double comprimento;
    private double altura;
    
    Retangulo(double c, double a) {
    comprimento = c;
    altura = a;
    
    }

    Retangulo(double c, double a, String C) {
    comprimento = c;
    altura = a;
    cor = C;

    }

    public double getArea ( ) {
    area = comprimento * altura;
    return area;
    }
    public double getPerimetro () {
        perimetro = (2 * comprimento) + ( 2 * altura);
        return perimetro;
    }
   }
   