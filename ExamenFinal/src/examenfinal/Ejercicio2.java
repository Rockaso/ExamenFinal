
package examenfinal;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    class nodo {
        String seccion;
        nodo sig;

        public nodo(String seccion) {
            this.seccion = seccion;
        }

    }
    nodo L;

    boolean vacio() {
        return L == null;
    }
    void mirar(String seccion)  {
        if (vacio()) {
            L = new nodo(seccion);
        } else {
            nodo aux = L;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = new nodo(seccion);
        }

    }
    void leer() {
        String parrafo = "Muchas personas creen que los osos polares están en peligro de extinción, pero la denominación correcta sobre la situación de esta especie es que están en situación de conservación vulnerable. De todas formas, es necesario que se actúe rápidamente para evitar que esta especie desaparezca.";
            String[] parte = parrafo.split(" ");
            for (int i = 0; i < parte.length; i++) {
                String nombre = parte[i];
                mirar(nombre);
        }
    }
}