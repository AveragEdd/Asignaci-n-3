import java.io.*;

public class problema6 {
    public static void main(String[] args) throws IOException { 
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        try {
            //  coordenadas del primer punto (x1, y1)
            System.out.print("Ingrese la coordenada x1: ");
            double x1 = Double.parseDouble(leer.readLine());

            System.out.print("Ingrese la coordenada y1: ");
            double y1 = Double.parseDouble(leer.readLine());

            //  las coordenadas del segundo punto (x2, y2)
            System.out.print("Ingrese la coordenada x2: ");
            double x2 = Double.parseDouble(leer.readLine());

            System.out.print("Ingrese la coordenada y2: ");
            double y2 = Double.parseDouble(leer.readLine());

            // calcula pendiente de recta 
            double pendiente = (y2 - y1) / (x2 - x1);

            // Determinar si la recta se mueve hacia arriba o hacia abajo
            String direccion;
            if (pendiente > 0) {
                direccion = "arriba";
            } else if (pendiente < 0) {
                direccion = "abajo";
            } else {
                direccion = "horizontal"; // Pendiente cero indica una recta horizontal
            }

            // Calcular la intersección con el eje y (b) 
            double b = y1 - pendiente * x1;

            // Imprimir resultados 
            System.out.println("Para los puntos (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") la pendiente de la recta es: " + pendiente);
            System.out.println("La recta se mueve hacia: " + direccion);
            System.out.println("La fórmula de punto pendiente de la recta es y = " + pendiente + "x + " + b);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
    }
}
