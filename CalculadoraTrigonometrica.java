import java.util.Scanner; //Para hacer inputs

public class CalculadoraTrigonometrica {

    public static void main(String[] args) { //Se busca para comenzar el programa
        Scanner teclado = new Scanner(System.in);

        //Se definen las variables
        int opcion;
        double angulo;
        double radianes;
        double resultado = 0;
        String funcion = "";

        System.out.println("CALCULADORA TRIGONOMETRICA");
        System.out.println("1. sen(x)");
        System.out.println("2. cos(x)");
        System.out.println("3. tan(x)");
        System.out.println("4. arcsen(x)");
        System.out.println("5. arccos(x)");
        System.out.println("6. arctan(x)");
        System.out.println("7. sinh(x)");
        System.out.println("8. cosh(x)");
        System.out.println("9. tanh(x)");

        System.out.print("\nSeleccione una opcion: ");
        opcion = teclado.nextInt(); //Siguiente entero

        System.out.print("Ingrese el valor del angulo en grados: ");
        angulo = teclado.nextDouble(); //Siguiente double
        radianes = Math.toRadians(angulo); //Convierte el ángulo a radianes
        double anguloCorregido = angulo % 360;

        switch(opcion) {
                case 1: //Seno
                    resultado = Math.sin(radianes);
                    funcion = "seno";
                    break;
                case 2: //Coseno
                    resultado = Math.cos(radianes);
                    funcion = "coseno";
                    break;
                case 3: //Tangente
                    if (anguloCorregido == 90 || anguloCorregido == 270) {
                        System.out.println("Error: tangente indefinida para " + angulo + "°");
                        break;
                    }
                    resultado = Math.tan(radianes);
                    funcion = "tangente";
                    break;
                case 4: //arcsen
                    if (radianes < -1 || radianes > 1) {
                        System.out.println("Error: el angulo en radianes " + String.format("%.4f", radianes) + " debe estar entre -1 y 1");
                        break;
                    }
                    resultado = Math.asin(radianes);
                    funcion = "arco seno";
                    break;
                case 5: //arccos
                    if (radianes < -1 || radianes > 1) {
                        System.out.println("Error: el angulo en radianes " + String.format("%.4f", radianes) + " debe estar entre -1 y 1");
                        break;
                    }
                    resultado = Math.acos(radianes);
                    funcion = "arco coseno";
                    break;
                case 6: //arctan
                    resultado = Math.atan(radianes);
                    funcion = "arco tangente";
                    break;
                case 7:
                    resultado = Math.sinh(radianes);
                    funcion = "seno hiperbolico";
                    break;
                case 8:
                    resultado = Math.cosh(radianes);
                    funcion = "coseno hiperbolico";
                    break;
                case 9:
                    resultado = Math.tanh(radianes);
                    funcion = "tangente hiperbolica";
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    teclado.close();
                    return;
            }
        System.out.println("Operacion: " + funcion + "(" + angulo + ")");
        System.out.println("Resultado: " + resultado);
        teclado.close();
    }
}
