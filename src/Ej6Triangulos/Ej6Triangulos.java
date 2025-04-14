import java.util.Scanner;

public class Ej6Triangulos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        System.out.println("------------------");
        System.out.println("    Triangulos    ");
        System.out.println("------------------");


        System.out.print("Ingrese el número de triángulos: ");
        int n = scanner.nextInt();

        String[] tipos = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nTriángulo " + (i+1));
            System.out.print("Lado 1: ");
            double lado1 = scanner.nextDouble();
            System.out.print("Lado 2: ");
            double lado2 = scanner.nextDouble();
            System.out.print("Lado 3: ");
            double lado3 = scanner.nextDouble();


            if (lado1 == lado2 && lado2 == lado3) {
                tipos[i] = "Equilátero";
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipos[i] = "Isósceles";
                isosceles++;
            } else {
                tipos[i] = "Escaleno";
                escalenos++;
            }

            System.out.println("Tipo: " + tipos[i]);
        }


        System.out.println("\n--- RESULTADOS ---");

        System.out.println("\na) Tipos de triángulos:");
        for (int i = 0; i < n; i++) {
            System.out.println("Triángulo " + (i+1) + ": " + tipos[i]);
        }

        System.out.println("\nb) Cantidad por tipo:");
        System.out.println("Equiláteros: " + equilateros);
        System.out.println("Isósceles: " + isosceles);
        System.out.println("Escalenos: " + escalenos);

        System.out.println("\nc) Tipo con menor cantidad:");
        if (equilateros <= isosceles && equilateros <= escalenos) {
            System.out.println("Equilátero: " + equilateros);
        } else if (isosceles <= equilateros && isosceles <= escalenos) {
            System.out.println("Isósceles: " + isosceles);
        } else {
            System.out.println("Escaleno: " + escalenos);
        }
    }
}