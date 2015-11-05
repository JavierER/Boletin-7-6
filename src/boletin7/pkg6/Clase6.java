
package boletin7.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Clase6 {
   static public int pedirNumero(){
   int numero;
   String res = JOptionPane.showInputDialog("Teclea el Numero de Articulos vendidos :");
   numero=Integer.parseInt(res);
   return numero;
}
   static public void numeroventas (int num1){
           if (num1<= 100)
           System.out.println("Consumo Baixo");
           else if (num1<= 500)
           System.out.println("Consumo Medio");
           else if (num1<= 1000)
           System.out.println("Consumo Alto");
           else if (num1> 1000 )
           System.out.println("Primeira Necesidade");
}
}
