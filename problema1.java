//Letra y numero: Debe desarrollar una aplicación donde se solicita al usuario ingresar un carácter de 1 letra de largo. Se debe validar que el contenido de lo que ingreso sea una de las siguientes opciones:

//a. Un numero de 0 a 9: SALIDA “USTED HA INGRESADO UN NUMERO”

//b. Una letra minúscula: SALIDA “USTED HA INGRESADO UNA LETRA MINUSCULA”

//c. Una letra mayúscula: SALIDA “USTED HA INGRESADO UNA LETRA MAYUSCULA”

//d. Cualquier otra entrada envía el mensaje: VALOR NO RECONOCIDO

// Camaño, Edward 8-1010-515
// Hou, Edwin 8-1021-1916
// Arosemena, Miguel 8-1016-2330

import javax.swing.JOptionPane;

public class problema1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Ingrese un carácter de una letra de largo, ya sea un número o letra:");

        // Verificar que el input tenga exactamente un char
        if (input.length() != 1) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar exactamente un carácter.", "Error", 0);
            return;
        }

        char intro = input.charAt(0);

        // Verificar si el char es un número del 0 al 9
        if (intro >= '0' && intro <= '9') {
            JOptionPane.showMessageDialog(null, "USTED HA INGRESADO UN NÚMERO", "Resultado", 1);
        } 
        //IsLowerCase es un método que determina si un caracter es mayúscula. Retorna un valor booleano.
      else if  (Character.isLowerCase(intro)) {
       
         JOptionPane.showMessageDialog(null, "USTED HA INGRESADO UNA LETRA MINISCULA", "Resultado", 1);
      } 

  //IsUpperCase es un método que determina si un caracter es mayúscula. Retorna un valor booleano.
 
      else if  (Character.isUpperCase(intro)) {
        JOptionPane.showMessageDialog(null, "USTED HA INGRESADO UN LETRA MAYUSCULA", "Resultado", 1);

     } 

 else {
    JOptionPane.showMessageDialog(null, "VALOR NO RECONOCIDO", "Resultado", 0);
} 
    }
}