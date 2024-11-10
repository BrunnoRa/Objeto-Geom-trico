package Geometria;
AreaObjetos mostraAreaObjetos ( ) {
    System.out.println("Quadrado. Área: " + quadrado.getArea());
    System.out.println("Retângulo. Área: " + retangulo.getArea());
    System.out.println("Triângulo. Área: " + (triangulo.base * triangulo.altura)/2);
    System.out.println("Circunferência. Área: " + circunferencia.getArea());
    }
    
    public void mostraPerimetroObjetos ( ) {
    
    }
    
    public void mostraCorObjetos ( ) {
    
    }
    
    public static void main ( String args[]) {
    QuadroNegro quadroNegro = new QuadroNegro();
    quadroNegro.criaQuadrado(10.6);
    quadroNegro.criaRetangulo(50.5,20.4);
    quadroNegro.criaTriangulo(6.7,5.5);
    quadroNegro.criaCircunferencia(10);
    quadroNegro.mostraAreaObjetos();
    
    }
   