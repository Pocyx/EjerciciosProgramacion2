/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosProgramacion2;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer6Tema2 {
    public static void main(String[] args) {
        double cantidad = 5;
        double iva =0.21;
        double total;
        total = (cantidad * iva)+cantidad ;
        
        System.out.println(cantidad+" € mas el IVA es "+total+" €");
    }
}
