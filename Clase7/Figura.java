public abstract class Figura implements Desplazable {

    protected Coordenada centro;
    protected Coordenada[] vertices;

    public Figura(Coordenada centro, Coordenada[] vertices) {
        this.centro = centro;
        this.vertices = vertices;
    }

    public abstract double area();

    @Override
    public void desplazar(double dx, double dy) {

        centro = new Coordenada(centro.abcisa() + dx,centro.ordenada() + dy);

        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = new Coordenada(vertices[i].abcisa() + dx,vertices[i].ordenada() + dy );
        }
    }

    @Override
    public String toString() {
        String resultado = "Centro: " + centro + "\n";
        for (int i = 0; i < vertices.length; i++) {
            resultado += "Vértice " + i + ": " + vertices[i] + "\n";
        }
        return resultado;
    }
}
