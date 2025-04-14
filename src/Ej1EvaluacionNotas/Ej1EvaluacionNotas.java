import java.util.Scanner;

public class Ej1EvaluacionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Ingrese la Nota a Evaluar");
        System.out.println("-------------------------");

        System.out.print("Ingrese la nota de la materia: ");
        double nota = scanner.nextDouble();

        if (nota < 4) {
            System.out.println("-------------------------------");
            System.out.println("El alumno desaprobó la materia.");
            System.out.println("-------------------------------");

        } else if (nota == 10) {
            System.out.println("---------------------------");
            System.out.println("El alumno es sobresaliente.");
            System.out.println("---------------------------");

        } else {
            System.out.println("----------------------------");
            System.out.println("El alumno aprobó la materia.");
            System.out.println("----------------------------");

        }
    }
}