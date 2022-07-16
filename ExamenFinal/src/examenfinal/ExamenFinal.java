
package examenfinal;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Rodny
 */
public class ExamenFinal {
    String datos[] = new String[5];
    int numero[] = new int[5];

    void cliente() {
        datos[0] = "Silvestre Cárdenas"; numero[0] = 8; datos[1] = "Andrés López"; numero[1] = 1;
        datos[2] = "Andreina Gonzalez"; numero[2] = 5; datos[3] = "Maria Perez"; numero[3] = 0;
        datos[4] = "Armando Paredes"; numero[4] = 10;
    }
    void satisfaccion() {      
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == 0) {

                System.out.println( ", El estado de satisfaccion de "+ datos[i] +", es de " + numero[i] + ", el cliente no atendió.");
            } else if (numero[i] >= 1 && numero[i] <= 4) {
                System.out.println( ", El estado de satisfaccion de "+ datos[i] +", es de " + numero[i] + ", no esta satisfecho.");
            } else if (numero[i] == 5) {
                System.out.println( ", El estado de satisfaccion de "+ datos[i] +", es de " + numero[i] + ", neutro.");
            } else if (numero[i] >= 6 && numero[i] <= 8) {
                System.out.println( ", El estado de satisfaccion de "+ datos[i] +", es de " + numero[i] + ", esta satisfecho.");
            } else if (numero[i] >= 9 && numero[i] <= 10) {
                System.out.println( ", El estado de satisfaccion de "+ datos[i] +", es de " + numero[i] + ", esta muy satisfecho.");
            }
        }
    }
}