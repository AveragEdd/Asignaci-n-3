// Camaño, Edward 8-1010-515
// Hou, Edwin 8-1021-1916
// Arosemena, Miguel 8-1016-2330

/*3-Fibonacci: El usuario ingresa 1 valor numérico. El programa debe entonces imprimir una cadena de Fibonacci hasta la cantidad de dígitos presentada por la entrada de usuario.  */
import java.io.*;

public class Fibonacci {
    public static void main(String[] args) throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int num, valor1=0, valor2=1, temporal; //Inicializamos las variables

        /*Hacemos un ciclo while para que cuando suceda algun error permita al usuario volver a ingresar un valor correcto*/
        while (true){
            try{
            System.out.print("Ingrese un valor numerico: ");
            num = Integer.parseInt(leer.readLine());
            
            //Evaluamos si el valor ingresado es mayor a 0
            if(num > 0){
                System.out.println("La serie de Fibonacci para el valor "+ num + " es: ");
                //Inicializamos un ciclo for, aqui se imprimira y haran las sumas para la serie
                for( int i=0; i<num; i++){
                System.out.print(" "+ valor1 + " "); //Imprime en cada ciclo nuevo un valor de la variable valor1
                temporal = valor1 + valor2; //la variable temporal alamacena la suma de las variables valor1 y valor2
                valor1= valor2; //el valor de la variable valor2 pasa a ser de valor1                 
                valor2 = temporal; //el valor de suma alamacenada en temporal pasa a ser de valor2
                } //Fin for
                break; //Aqui finaliza el ciclo while, cuando se realiza correctamente la serie sin ningun error
            
            //Si n es menor o igual a 0, entonces imprime un mensaje al usuario para que ingrese un valor diferente de 0
            } else{
            System.out.println("Ingrese un valor mayor a 0. \n");
            } //Fin else

            } catch (NumberFormatException e) {
            System.out.println("ERROR!. El valor ingresado no es valido. \n");
            } //Fin catch
        } //Fin while
    }
}