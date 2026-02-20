public class PruebaPoligono {

    public static void main(String[] args) {

        PoligonoIrreg poligono = new PoligonoIrreg();

        System.out.println("Contenido del poligono recien creado: Vertices totales: "+ poligono.getNumeroVertices());
        // Añadir un nuevo vertice
        // Generar primer vértice
        double x1 = Math.round(((Math.random() * 200) - 100) * 1000.0) / 1000.0;
        double y1 = Math.round(((Math.random() * 200) - 100) * 1000.0) / 1000.0;
        Coordenada n1 = new Coordenada(x1, y1);

        // Generar segundo vértice
        double x2 = Math.round(((Math.random() * 200) - 100) * 1000.0) / 1000.0;
        double y2 = Math.round(((Math.random() * 200) - 100) * 1000.0) / 1000.0;
        Coordenada n2 = new Coordenada(x2, y2);

        // Generar tercer vértice
        double x3 = Math.round(((Math.random() * 200) - 100) * 1000.0) / 1000.0;
        double y3 = Math.round(((Math.random() * 200) - 100) * 1000.0) / 1000.0;
        Coordenada n3 = new Coordenada(x3, y3);
        
        poligono.anadeVertice(n1);
        System.out.println("\nSe agrego el vertice: " + n1);
        poligono.anadeVertice(n2);
        System.out.println("Se agrego el vertice: " + n2);
        poligono.anadeVertice(n3);  
        System.out.println("Se agrego el vertice: " + n3);
        
        System.out.println("\nVertices totales: "+poligono.getNumeroVertices());

    }
}
