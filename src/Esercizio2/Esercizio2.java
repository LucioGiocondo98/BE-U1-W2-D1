package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("inserisci i km percorsi: ");
            int km= scanner.nextInt();
            System.out.println("inserisci i litri consumati: ");
            int litri = scanner.nextInt();
            int kmPerLitro= km/litri;
            System.out.println("hai percorso: " +kmPerLitro + "km/litro");
        }catch (ArithmeticException e){
            System.out.println("errore: divisione per zero non contemplata");
        }
        scanner.nextLine();
        try {
            System.out.println("inserisci i kilometri percorsi (double): ");
            double kmDouble = scanner.nextDouble();
            System.out.println("inserisci i litri consumati (double): ");
            double litriDouble = scanner.nextDouble();
            if (litriDouble== 0.0){
                throw new ArithmeticException("divisione per 0");
            }
            double kmPerLitriDouble = kmDouble/litriDouble;
            System.out.println("hai percorso: " + kmPerLitriDouble + "km/litro");

        }catch (ArithmeticException e){
            System.out.println("errore: divisione per zero ");
        }
    }
}
