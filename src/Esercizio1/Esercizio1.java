package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        int [] numeri = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeri.length; i++) {
            numeri[i]= random.nextInt(10)+1;
        }
        System.out.println("Array iniziale con numeri random:");
        stampaArray(numeri);

        while (true){
            try {
                System.out.println("inserisci un valore (0 per uscire): ");
                int valore = scanner.nextInt();
                if (valore== 0){
                    System.out.println("hai inserito lo 0 decidendo di terminare il programma");
                    break;
                }
                System.out.println("inserisci l'indice in cui sostituirlo");
                int indiceArray= scanner.nextInt();
                numeri[indiceArray] = valore;

                System.out.println("nuovo array: ");
                stampaArray(numeri);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("errore: posizione non valida");
            }catch (Exception e){
                System.out.println("errore di input,inserisci solo numeri interi");
                scanner.nextLine();
            }

        }

            }
    private static void stampaArray(int[]array){
        for (int n:array){
            System.out.println(n + " ");
        }
    }
}
