
package examenfinal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rodny
 */
public class Ejercicio3 {

 FileReader fr;
    
    void leer(colaEjercicio3 Colaejercicio3) throws IOException
    {
        fr=new FileReader("Clientes.txt");
        BufferedReader br=new BufferedReader(fr);
        String linea;
        while ((linea=br.readLine())!=null)
        {
            String[] datos = linea.split(" ");
            String nombre = datos[0];
            int cedula = Integer.parseInt(datos[1]);
            int pasaporte = Integer.parseInt(datos[2]);
            int documentos = Integer.parseInt(datos[3]);
            Colaejercicio3.encolar(nombre, cedula, pasaporte, documentos);
        }
    }
    
}
