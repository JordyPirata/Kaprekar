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
        String input;
        
        System.out.println("Este programa encuentra la constante de Kaprekar (6174).");
        System.out.println("Ingrese un número entre 0 y 9999: ");
        input = scan.nextLine();
        int num;
        
        try{
            if(KaprekarOp.KaprekarValitation(input)){
                num = Integer.parseInt(input);
                KaprekarOp.KaprekarOP(num);
            }else{
                throw new NumberFormatException("Entrada no válida");
            }
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());        
        }
        scan.close();
    }
}
