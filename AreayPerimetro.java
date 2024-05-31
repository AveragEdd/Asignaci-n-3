// Camaño, Edward 8-1010-515
// Hou, Edwin 8-1021-1916
// Arosemena, Miguel 8-1016-2330

/*Área y Perímetro: El usuario debe escoger entre una de las siguientes opciones:
a. Rectángulo
b. Triangulo
c. Trapecio
d. Circulo
Luego el programa solicitará la información necesaria para imprimir a pantalla el área y el perímetro de cada figura que el usuario ha escogido.
Debe haber una opción que le permita al usuario escoger una nueva figura a calcular si lo desea, antes de salir del programa. */

import java.io.*;
public class AreayPerimetro {
    public static void main(String[] args) throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        char opcion, continuar = 'S';

        while (continuar == 'S' || continuar == 's'){
            try{
                System.out.println("Escoja una de las siguientes opciones de las cuales desee calcular el area y el perimetro");
                System.out.println("a. Rectangulo");
                System.out.println("b. Triangulo");
                System.out.println("c. Trapecio");
                System.out.println("d. Circulo");
                System.out.println("Ingrese su opcion: ");
                opcion = leer.readLine().charAt(0);

                    switch (opcion){
                        //Opcion del rectangulo
                        case 'a':
                        System.out.println("\nOpcion A - Area y Perimetro de un Rectangulo");
                        System.out.println("Ingrese una longitud para la base del rectangulo: ");
                        Double baseRectangulo = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese una longitud para la altura del rectangulo: ");
                        Double alturaRectangulo = Double.parseDouble(leer.readLine());
                        
                        Double areaRectangulo = baseRectangulo * alturaRectangulo;
                        Double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
                        System.out.println("El area del rectangulo es: "+ areaRectangulo);
                        System.out.println("El perimetro del rectangulo es: "+ perimetroRectangulo);
                        break;
                        
                        //Opcion del triangulo
                        case 'b':
                        System.out.println("\nOpcion B - Area y Perimetro de un Triangulo");
                        System.out.println("Ingrese la longitud del lado A del triagulo: ");
                        Double ladoA = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese la longitud del lado B del triagulo: ");
                        Double ladoB = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese la longitud del lado C del triagulo: ");
                        Double ladoC = Double.parseDouble(leer.readLine());

                        Double perimetroTriangulo = ladoA + ladoB + ladoC;
                        Double areaTriangulo = Math.sqrt((perimetroTriangulo/2)*(perimetroTriangulo/2 - ladoA)*(perimetroTriangulo/2 - ladoB)*(perimetroTriangulo/2 - ladoC));
                        System.out.println("El area del Triangulo es: "+ areaTriangulo);
                        System.out.println("El perimetro del Triangulo es: "+ perimetroTriangulo);
                        break;

                        //Opcion del Trapecio
                        case 'c':
                        System.out.println("\nOpcion C - Area y Perimetro de un Trapecio");
                        System.out.println("Ingrese una longitud para el base inferior: ");
                        double baseInferiorTrapecio = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese una longitud para el base superior: ");
                        double baseSuperiorTrapecio = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese una longitud para el lado izquierdo: ");
                        double ladoIzquierdoTrapecio = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese una longitud para el lado derecho: ");
                        double ladoDerechoTrapecio = Double.parseDouble(leer.readLine());
                        System.out.println("Ingrese la altura del trapecio: ");
                        double alturaTrapecio = Double.parseDouble(leer.readLine());

                        double perimetroTrapecio = baseInferiorTrapecio + baseSuperiorTrapecio + ladoDerechoTrapecio + ladoIzquierdoTrapecio;
                        double areaTrapecio = ((baseSuperiorTrapecio + baseInferiorTrapecio) * alturaTrapecio)/2 ;
                        System.out.println("El area del trapecio es: "+ areaTrapecio);
                        System.out.println("El perimetro del trapecio es: "+ perimetroTrapecio);
                        break;

                        //Opcion del circulo
                        case 'd':
                        System.out.println("\nOpcion D - Area y Perimetro de un Circulo");
                        System.out.println("Ingrese el radio del circulo: ");
                        Double radioCirculo = Double.parseDouble(leer.readLine());

                        Double perimetroCirculo = 2 * 3.1416 * radioCirculo ;
                        Double areaCirculo = 3.1416 * Math.pow(radioCirculo, 2);
                        System.out.println("El area del circulo es: "+ areaCirculo);
                        System.out.println("El perimetro del circulo es: "+ perimetroCirculo);
                        break;

                        default:
                        System.out.println("Opcion no valida!. Porfavor ingresar una de las opciones sugeridas.");
                        break;
                    }
                        while((continuar == 'S' || continuar == 's')||(continuar != 'S' || continuar != 's')){
                            System.out.println("\n¿Desea continuar con otra opcion? (S/N): ");
                            continuar = leer.readLine().charAt(0);
                                if(continuar == 'S' || continuar == 's'){
                                    break;
                                } else if(continuar == 'N' || continuar == 'n'){
                                    System.out.println("Cerrando programa.......");
                                    return;
                                } else{
                                    System.out.println("Ingrese una opcion entre S o N");
                                }    
                        }
                    
            } catch (NumberFormatException e) {
                System.out.println("ERROR!. El valor ingresado no es valido.");
                }
        }
    }
}
