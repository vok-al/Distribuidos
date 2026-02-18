public class TrianguloEq extends Figura {
    
    public TrianguloEq(Coordenada centro, Coordenada[] vertices) {
        super(centro, vertices);
    }

    @Override
    public double area() {
        double base = vertices[0].distancia(vertices[1]);
        double altura = (Math.sqrt(3) / 2) * base;
        return (base * altura) / 2;
    }
    
}
