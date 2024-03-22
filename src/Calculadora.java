import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){

        Scanner dato = new Scanner(System.in);
        boolean continuar = true;
        int num1, num2;
        do {
            System.out.println("Menu\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Salir");
            int opcion = dato.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primero numero");
                    num1 = dato.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = dato.nextInt();
                    System.out.println("El resultado de " + num1 + " + " + num2 + " es " + Calculadora.suma(num1, num2));

                    break;
                case 2:
                    System.out.println("Ingrese el primero numero");
                    num1 = dato.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = dato.nextInt();
                    System.out.println("El resultado de " + num1 + " - " + num2 + " es " + Calculadora.resta(num1, num2));

                    break;
                case 3:
                    System.out.println("Ingrese el primero numero");
                    num1 = dato.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = dato.nextInt();
                    System.out.println("El resultado de " + num1 + " * " + num2 + " es " + Calculadora.multiplicacion(num1, num2));

                    break;
                case 4:
                    System.out.println("Ingrese el primero numero");
                    num1 = dato.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    num2 = dato.nextInt();
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es " + Calculadora.division(num1, num2));

                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    break;

            }

        }while(continuar);
    }
    public static int suma(int num1, int num2){
        return num1 + num2;
    }

    public static int resta(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }

}
