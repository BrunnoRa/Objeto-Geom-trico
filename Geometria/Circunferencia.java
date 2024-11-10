package Geometria;
public class Circunferencia extends ObjetoGeometrico {
    private double area;
    private double perimetro;
    private double pi =
 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998;
    private double raio;
    Circunferencia(double r) {
        raio = r;
    }
    public double getArea() {
        area = pi * (raio * raio);
        return area;
    }
    public double getPerimetro() {
        perimetro = 2 * pi * raio;
        return perimetro;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
 }