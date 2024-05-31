// Camaño, Edward 8-1010-515
// Hou, Edwin 8-1021-1916
// Arosemena, Miguel 8-1016-2330
import java.io.*;

public class InventarioActual {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max_items = 4; // Número máximo de elementos en el inventario
        // Array de nombres de los artículos disponibles
        String[] ITEMS = {"1. Zapatos", "2. Carteras", "3. Vestidos", "4. Sombreros"};
        // Array de precios de los artículos disponibles
        double[] PRECIOS = {25.00, 15.50, 150.75, 5.00};
        // Array de cantidades disponibles de cada artículo
        int[] CANTIDADES = {150, 100, 2, 10};
    
        // Permite que el programa continúe ejecutándose hasta que el usuario decida salir.
        while (true) {
            // Se muestra el inventario actual
            System.out.println("Inventario actual: \n");
            System.out.println("====================================================");
            System.out.println("|     Item      |      Precio     |    Cantidad    |");
            System.out.println("====================================================");
            // Iterar sobre cada artículo en el inventario
            for (int i = 0; i < max_items; i++) {
                System.out.println("|" + ITEMS[i] + " \t" + "|" + "\t" + PRECIOS[i] + "\t  " + "|" + "\t" + CANTIDADES[i] + "\t" + "   |");
                System.out.println("====================================================");
            }
            // Imprime un salto de línea para separar de la tabla de inventario actual
            System.out.println();
            // Imprime un mensaje para que el usuario elija qué hacer
            System.out.println("Seleccione un item para comprar (1-" + max_items + ") o 0 para salir: ");

            try {
                int opcion = Integer.parseInt(reader.readLine());
                // Si la opción es 0, salir del bucle
                if (opcion == 0) {
                    break;
                }
                // Si la opción no es válida se solicita intentar de nuevo al usuario 
                if (opcion < 1 || opcion > max_items) {
                    System.out.println("Opción inválida. Intente de nuevo.");
                    continue;
                }
                // Se solicita la cantidad de artículos a comprar al usuario
                System.out.println("Ingrese la cantidad de " + ITEMS[opcion - 1] + " que desea comprar: ");
                String linea = reader.readLine();
                int cantidCompra = Integer.parseInt(linea);
                // Si no hay suficiente stock se informa al usuario
                if (cantidCompra > CANTIDADES[opcion - 1]) {
                    System.out.println("No hay suficiente stock. Ingrese una cantidad menor o igual que las disponibles.");
                    continue;
                }

                double costoTotal = PRECIOS[opcion - 1] * cantidCompra; // Calcular el costo total de la compra

                System.out.println("Costo total: $" + costoTotal); // Mostrar el costo total de la compra

                CANTIDADES[opcion - 1] -= cantidCompra; // Actualizar la cantidad de artículos en el inventario
            } catch (IOException e) {
                System.out.println("Error de entrada/salida. Intente de nuevo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
            }
        }

        try {
            reader.close(); // Cerrar el lector de entrada al finalizar
        } catch (IOException e) {
            System.out.println("Error al cerrar el lector de entrada.");
        }

    }
}