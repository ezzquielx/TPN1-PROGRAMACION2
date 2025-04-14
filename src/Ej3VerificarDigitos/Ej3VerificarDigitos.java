import java.util.Scanner;

public class Ej3VerificarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Ingrese un numero positivo desde 1 a 99");
        System.out.println("---------------------------------------");

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Error, El numero debe estar entre 1 y 99");
        } else {
            if (numero <= 9) {
                System.out.println("El número " + numero + " tiene un digito");
            } else {
                System.out.println("El número " + numero + " tiene dos digitos");
            }
        }
    }
}