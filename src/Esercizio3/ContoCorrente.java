package Esercizio3;

public class ContoCorrente {
    private String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException{
        nMovimenti++;
        if (nMovimenti < maxMovimenti) {
            saldo -= 0.50;
        }
        saldo-=x;
        if (saldo<0){
            throw new BancaException("il conto è in rosso");
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }
}
