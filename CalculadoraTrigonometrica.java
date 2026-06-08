import java.util.Scanner; //Para hacer inputs

public class CalculadoraTrigonometrica {

    public static void main(String[] args) { //Se busca para comenzar el programa
        Scanner teclado = new Scanner(System.in);

        int opcion;
        double angulo;
        double resultado = 0;

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

        switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    teclado.close();
                    return;
            }

        System.out.println("Resultado = " + resultado);
        teclado.close();
    }
}
