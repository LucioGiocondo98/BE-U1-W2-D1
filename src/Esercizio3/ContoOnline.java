package Esercizio3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    @Override
    public void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        } else {
            System.out.println("Errore: il prelievo supera il limite massimo consentito di " + maxPrelievo);
        }
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare());
        System.out.println("Saldo: " + restituisciSaldo());
        System.out.println("Numero movimenti: " + getnMovimenti());
        System.out.println("Massimo prelievo consentito: " + maxPrelievo);
    }
}
