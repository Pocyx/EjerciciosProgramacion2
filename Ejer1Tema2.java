/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
*Escribe un programa en el que se de clarenlasvariablesenterasxey.
Asignales los valores 144 y 999 respectivamente.
A continuación, muestra por pantalla elvalordecadavariable,lasuma,
laresta,ladivisiónylamultiplicación.
*/
package EjerciciosProgramacion2;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer1Tema2 {
    
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        
       int suma = x + y;
       int resta = x - y;
       int multiplicacion = x * y;
       double division = (double)x / y;
       double modulo = (double)x + y;
    
        System.out.println(x+" y "+y);
        System.out.println("La suma de "+x+" + "+y+" es "+suma);
        System.out.println("La resta de "+x+" - "+y+" es "+resta);
        System.out.println("La multiplicacion de "+x+" * "+y+" es "+multiplicacion);
        System.out.println("La division de "+x+" / "+y+" es "+division);
        System.out.println("El modulo de "+x+" % "+y+" es "+modulo);
    }
    
    
    
}
