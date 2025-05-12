package Esercizio3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        super.preleva(x);

    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare());
        System.out.println("Saldo: " + restituisciSaldo());
        System.out.println("Numero movimenti: " + getnMovimenti());
        System.out.println("Massimo prelievo consentito: " + maxPrelievo);
    }
}
