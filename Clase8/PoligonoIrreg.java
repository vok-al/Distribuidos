import java.util.ArrayList;

public class PoligonoIrreg {

    private ArrayList<Coordenada> vertices;
    
    //private Coordenada[]vertices; 

    public PoligonoIrreg(){  
        vertices = new ArrayList<Coordenada>();
    }

    public void anadeVertice(Coordenada c) {
        vertices.add(c);
    }

    //Metodo para modificar un vertice
    public void modificaVertice(int indice, Coordenada nuevaCoordenada){
        if (indice >= 0 && indice < vertices.size()) {
            vertices.set(indice, nuevaCoordenada);
        } else {
            System.out.println("Índice fuera de rango. No se modificó ningún vértice.");
        }
    }

    public int getNumeroVertices() {
        return vertices.size();
    }

    //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( ) 
    @Override
    public String toString() {
        String s = "Vértices del polígono irregular:\n";
        int i = 0;
        for (Coordenada c : vertices) {   
            s += "Vértice " + i + ": " + c + "\n";
            i++;
        }
        return s;
    }
}
