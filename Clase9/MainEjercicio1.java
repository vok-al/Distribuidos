import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1 { 
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Uso: java MainEjercicio1 <n> <H/M>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        char sexoEliminar = args[1].toUpperCase().charAt(0);

        ArrayList<String> lista = new ArrayList<>();

        // Generar CURPs
        for (int i = 0; i < n; i++) {
            String curp = CURPGenerator.getCURP();
            lista.add(curp);
        }

        System.out.println("CURPs generadas:");
        for (String c : lista) {
            System.out.println(c);
        }

        // Filtrar usando Iterator
        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            String curp = it.next();
            if (curp.charAt(10) == sexoEliminar) {
                it.remove();  
            }
        }

        System.out.println("\nArrayList filtrado:");
        System.out.println(lista);
    }
}

