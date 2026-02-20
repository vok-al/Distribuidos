public class PruebaPoligono {

    public static void main(String[] args) {

        PoligonoIrreg poligono = new PoligonoIrreg();

        System.out.println("Contenido del poligono recien creado: Vertices totales: "+ poligono.getNumeroVertices());
        // Añadir un nuevo vertice

        for(int n=0; n<3; n++){
            //double random = Math.random() * 1000.0; // Genera un número aleatorio entre 0 y 1000
            //System.out.println("Valor aleatorio generado: " + random);
            //double h= Math.round(Math.random() * 1000.0) / 1000.0;
            //System.out.println("Valor aleatorio generado con 3 decimales: " + h);
            double x = Math.random() * 200 - 100; // Genera un número aleatorio entre  -100 y 100 con 3 decimales
            double y = Math.random() * 200 - 100;
            Coordenada nuevaCoordenada = new Coordenada(x, y);
            poligono.anadeVertice(nuevaCoordenada);
            System.out.println("\nSe agrego el vertice: " + nuevaCoordenada);

        }
        
        System.out.println("\nVertices totales: "+poligono.getNumeroVertices());

    }
}
