
package examenfinal;

/**
 *
 * @author Rodny
 */
public class colaEjercicio3 {
    NodocolaEjercicio3 primero, ultimo;
    
    boolean colaVacia(){
    return primero == null;
    }
    
    void encolar(String nombre, int cedula, int pasaporte, int documentos) {
        NodocolaEjercicio3 nuevo = new NodocolaEjercicio3(nombre, cedula, pasaporte, documentos);
        if(colaVacia()){
        primero = nuevo;
        ultimo = primero;
        } else{
        ultimo.sig = nuevo;
        ultimo = ultimo.sig;
        }
    
    }
    
    NodocolaEjercicio3 desencolar(){
        if(!colaVacia()){
        NodocolaEjercicio3 aux = new NodocolaEjercicio3(primero.nombre, primero.cedula, primero.pasaporte, primero.documentos);
        if(primero == ultimo){
            primero = null;
            ultimo = primero;
        } else{
            primero = primero.sig;
        }
         return aux;
        } else{
            System.out.println("La cola esta vacia");
            return null;
        }
        
    }
}
