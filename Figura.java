public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(Coordenada centro, double base, double altura) {

        super(centro, new Coordenada[4]);

        this.base = base;
        this.altura = altura;

        double mitadBase = base / 2;
        double mitadAltura = altura / 2;

        vertices[0] = new Coordenada(
                centro.abcisa() - mitadBase,
                centro.ordenada() + mitadAltura
        );

        vertices[1] = new Coordenada(
                centro.abcisa() + mitadBase,
                centro.ordenada() + mitadAltura
        );

        vertices[2] = new Coordenada(
                centro.abcisa() + mitadBase,
                centro.ordenada() - mitadAltura
        );

        vertices[3] = new Coordenada(
                centro.abcisa() - mitadBase,
                centro.ordenada() - mitadAltura
        );
    }

    @Override
    public double area() {
        return base * altura;
    }
}
