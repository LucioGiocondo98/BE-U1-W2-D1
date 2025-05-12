package Esercizio3;

import java.util.Scanner;

public class ProvaConto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto = new ContoCorrente("Lucio", 170);
        ContoOnline contoOnline = new ContoOnline("Moira", 200, 50);

        while (true) {
            try {
                System.out.print("ContoCorrente: Inserisci importo da prelevare: ");
                double importo = scanner.nextDouble();
                conto.preleva(importo);
                System.out.println("Prelievo effettuato. Saldo attuale: " + conto.restituisciSaldo());
            } catch (BancaException e) {
                System.out.println("Errore ContoCorrente: " + e.getMessage());
                break;
            }

            try {
                System.out.print("ContoOnline: Inserisci importo da prelevare: ");
                double importoOnline = scanner.nextDouble();
                contoOnline.preleva(importoOnline);
                contoOnline.stampaSaldo();
            } catch (BancaException e) {
                System.out.println("Errore ContoOnline: " + e.getMessage());
                break;
            }
        }
    }
}
