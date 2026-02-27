import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UsingFileReader {

    public static void main(String[] args) throws Exception {

        Map<Character, Integer> m = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa el nombre del archivo (ej. El_viejo_y_el_mar.txt): ");
        
        // Reading File name
        String path = br.readLine();

        try (FileReader fr = new FileReader(path)) {
            int i;

            // Holds true till there is nothing to read
            while ((i = fr.read()) != -1) {
                char c = (char) i; 
                
                // getOrDefault busca el carácter 'c'. Si existe, trae su valor actual y le suma 1.
                
                m.put(c, m.getOrDefault(c, 0) + 1);
            }

            
           
            System.out.println("Número de caracteres distintos encontrados: " + m.size());
            System.out.println("Caracteres y sus ocurrencias:");
            
            // Imprimimos el Map completo. 
            System.out.println(m);
            System.out.println("============================================");

        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo. Asegúrate de escribir bien el nombre y la extensión.");
        }
    }
}