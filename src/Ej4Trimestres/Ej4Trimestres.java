import java.util.Scanner;

public class Ej4Trimestres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("Aplicación para determinar el trimestre del año");
        System.out.println("-----------------------------------------------");

        System.out.print("Ingrese el dia: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        System.out.println("Fecha ingresada: día:" + dia + " mes:" + mes + " año:" + año);

        if (mes < 1 || mes > 12) {
            System.out.println("Error, el mes ingresado deberia estar entre 1 y 12");
        } else {
            if (mes >= 1 && mes <= 3) {
                System.out.println("La fecha Seleccionada corresponde al 1er trimestre del Año");
            } else if (mes >= 4 && mes <= 6) {
                System.out.println("La fecha Seleccionada corresponde al 2do trimestre del Año");
            } else if (mes >= 7 && mes <= 9) {
                System.out.println("La fecha Seleccionada corresponde al 3er trimestre del Año");
            } else {
                System.out.println("La fecha Seleccionada corresponde al 4to trimestre del Año");
            }
        }
    }
}