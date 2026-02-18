public class TrianguloEq extends Figura {

    private double lado;

    public TrianguloEq(Coordenada centro, double lado) {

        super(centro, new Coordenada[3]);

        this.lado = lado;

        double h = (Math.sqrt(3) / 2) * lado;

        
        vertices[0] = new Coordenada( centro.abcisa() - lado / 2, centro.ordenada() - h / 3);

        vertices[1] = new Coordenada(centro.abcisa() + lado / 2, centro.ordenada() - h / 3);

        vertices[2] = new Coordenada( centro.abcisa(), centro.ordenada() + 2 * h / 3);
    }
 /*  public TrianguloEq(Coordenada centro, double lado) {

    super(centro, new Coordenada[3]);

    this.lado = lado;

    double x = 0.5 * Math.sqrt(5.0 / 3.0) * lado;

    vertices[0] = new Coordenada(centro.abcisa() - x / 2,centro.ordenada() + x);

    vertices[1] = new Coordenada(centro.abcisa() - x / 2,centro.ordenada() - x);

    vertices[2] = new Coordenada(centro.abcisa() + (Math.sqrt(5) * lado) / 4,centro.ordenada());
}*/


    @Override
    public double area() {
        return (lado * lado * Math.sqrt(3)) / 4;
    }
}


