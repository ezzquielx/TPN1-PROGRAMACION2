import java.util.Scanner;

public class Ej5Coordenadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Aplicacion para determinar cuadrantes en un plano");
        System.out.println("-------------------------------------------------");

        int x, y;

        do {
            System.out.print("Ingrese el valor de X (tiene que ser distinto de cero): ");
            x = scanner.nextInt();

            if (x == 0) {
                System.out.println("Error: el valor X debe ser distinto de cero. Intente nuevamente.");
            }
        } while (x == 0);

        do {
            System.out.print("Ingrese el valor de Y (tiene que ser distinto de cero): ");
            y = scanner.nextInt();

            if (y == 0) {
                System.out.println("Error: el valor Y debe ser distinto de cero. Intente nuevamente.");
            }
        } while (y == 0);

        System.out.println("Coordenadas ingresadas: (" + x + ", " + y + ")");

        if (x > 0 && y > 0) {
            System.out.println("----------------------------------------");
            System.out.println("El punto se encuentra en el 1º Cuadrante");
            System.out.println("----------------------------------------");

        } else if (x < 0 && y > 0) {
            System.out.println("----------------------------------------");
            System.out.println("El punto se encuentra en el 2º Cuadrante");
            System.out.println("----------------------------------------");

        } else if (x < 0 && y < 0) {
            System.out.println("----------------------------------------");
            System.out.println("El punto se encuentra en el 3º Cuadrante");
            System.out.println("----------------------------------------");

        } else {
            System.out.println("----------------------------------------");
            System.out.println("El punto se encuentra en el 4º Cuadrante");
            System.out.println("----------------------------------------");

        }
    }
}