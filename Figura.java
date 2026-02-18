public abstract class Figura implements Desplazable {
    
    protected Coordenada centro; 
    protected Coordenada[] vertices;

    public abstract double area();

    public Figura(Coordenada centro, Coordenada[] vertices) {
        this.centro = centro;
        this.vertices = vertices;
    }

    @Override
    public void desplazar(double dx, double dy) {
        
        centro = new Coordenada(
                centro.abcisa() + dx,
                centro.ordenada() + dy
        );

        
        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = new Coordenada(vertices[i].abcisa() + dx, vertices[i].ordenada() + dy);
        }
        
    }
    
}
