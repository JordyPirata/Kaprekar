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
        String input= "";
        do{
            System.out.println("Este programa encuentra la constante de Kaprekar (6174).");
            System.out.println("Ingrese un número entre 0 y 9999 o EXIT para salir: ");
            input = scan.nextLine();
            if("EXIT".equals(input)){
                System.exit(0);
            }
            
            try {
                int numero = Integer.parseInt(input);

                if ((numero >= 1 && numero <= 9998) &&
                   (!tieneDosDigitosDiferentes(numero))){
                    scan.close();
                    KaprekarOp.KaprekarOP(numero);
                } else {
                    throw new InvalidNumberException();
                }
            }catch (InvalidNumberException e){
                System.out.println("Entrada no válida");
            }catch(NumberFormatException e) {
                System.out.println("Entrada no válida. Debe ser un número entero.");
            }
        }while("EXIT".equals(input));
        
    }
    
    
    private static boolean tieneDosDigitosDiferentes(int numero) {
        int[] digitos = new int[10];
        while (numero > 0) {
            int digito = numero % 10;
            digitos[digito]++;
            if (digitos[digito] > 1) {
                return true;
            }
            numero /= 10;
        }
        return false;
    }
    
    public static class InvalidNumberException extends Exception {

        public InvalidNumberException() {
            super("Invalid Format");
        }
    }
    
}
