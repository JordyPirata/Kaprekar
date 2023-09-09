/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kaprekar;
import java.util.Arrays;
/**
 *
 * @author Jordy
 */
public class KaprekarOp{
    
    public static void KaprekarOP(int num){
        if (num == 6174) {
            return;
        }
        // Agregar ceros a la izquierda para asegurar 4 dígitos
        String numeroStr = String.format("%04d", num);

        // Ordenar los dígitos de mayor a menor y de menor a mayor
        char[] ascendente = numeroStr.toCharArray();
        Arrays.sort(ascendente);
        String strAscendente = new String(ascendente);

        char[] descendente = new char[4];
        for (int i = 0; i < 4; i++) {
            descendente[i] = strAscendente.charAt(3 - i);
        }
        String strDescendente = new String(descendente);

        // Calcular la diferencia y encontrar el próximo número
        int mayor = Integer.parseInt(strDescendente);
        int menor = Integer.parseInt(strAscendente);
        int siguienteNumero = mayor - menor;
        System.out.printf("%s - %s = %04d%n", strDescendente, strAscendente, siguienteNumero);

        // Llamada recursiva con el siguiente número
        KaprekarOP(siguienteNumero);
    }
}
