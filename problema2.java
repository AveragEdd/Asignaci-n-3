//Mejor de lo mejor: Desarrollar un programa que solicite al usuario una cantidad N. 
//Luego se deben capturar números hasta la cantidad N solicitada por el usuario. 
//El programa debe imprimir la cantidad total de la suma de los datos capturados, 
//además se debe calcular cuál es el Mayor, cuál es el menor y cuál es el promedio.

// Camaño, Edward 8-1010-515
// Hou, Edwin 8-1021-1916
// Arosemena, Miguel8-1016-2330
import java.io.*;

public class problema2 {
    public static void main(String[] args) throws IOException { 
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int cat, num, sumtotal=0, mayor, menor;
        double promedio;
        while (true) {
        try { 
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        num = Integer.parseInt(leer.readLine());
        
        // Inicializar mayor y menor con el primer número ingresado
        System.out.print("Ingrese el número 1: ");
        mayor = menor = Integer.parseInt(leer.readLine());
        sumtotal += mayor; // Sumar al total
        //Se utiliza la funcion try para los errores.
        
        for(int i = 1; i < num; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            cat = Integer.parseInt(leer.readLine());
            sumtotal += cat; // Sumar al total

            // Actualizar mayor y menor según sea necesario
            if(cat > mayor) {
                mayor = cat;
            }

            if(cat < menor) {
                menor = cat;
            }
        }

        // Calcular el promedio y se convierte a double.
        promedio = (double) sumtotal / num;

        // Imprimir resultados
        System.out.println("La suma total de los números es: " + sumtotal);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El promedio de los números es: " + promedio);
        break;
    }           catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
    }
   
}
}
