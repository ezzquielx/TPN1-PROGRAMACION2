import java.util.Scanner;

public class Ej2EvaluacionPromocion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Ingrese las notas de la materia a evaluar");
        System.out.println("-----------------------------------------");

        System.out.printf("Ingrese la nota del 1er Parcial: ");
        double parcial1 = scanner.nextDouble();

        System.out.printf("Ingrese la nota del 2do Parcial: ");
        double parcial2 = scanner.nextDouble();

        System.out.printf("Ingrese la nota del 3er Parcial: ");
        double parcial3 = scanner.nextDouble();

        double promedio = (parcial1 + parcial2 + parcial3) / 3;

        System.out.printf("El promedio es: %.2f\n", promedio);

        if (promedio >= 8) {
            System.out.println("--------------------------------");
            System.out.println("El alumno Promociono la Materia.");
            System.out.println("--------------------------------");

        } else {
            System.out.println("-----------------------------------");
            System.out.println("El alumno no Promociono la Materia.");
            System.out.println("-----------------------------------");

        }
    }
}