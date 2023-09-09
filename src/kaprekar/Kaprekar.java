/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kaprekar;
import java.util.Scanner;
/**
 *
 * @author Jordy
 */
public class Kaprekar {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa encuentra la constante de Kaprekar (6174).");
        System.out.println("Ingrese un número entre 0 y 9999: ");
        String input = scan.nextLine();
        
        try {
            int numero = Integer.parseInt(input);

            // Verifica si el número está en el rango válido
            if (numero >= 0 && numero <= 9999) {
                System.out.println("Número válido ingresado: " + numero);
            } else {
                System.out.println("Número fuera de rango. Debe estar entre 0 y 9999.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Debe ser un número entero.");
        }

        
        scan.close();
    }
    
}
