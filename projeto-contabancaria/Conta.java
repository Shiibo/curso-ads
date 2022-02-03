public class Conta {
    protected double saldo = 0;
    double taxa;

    public Conta(int saldoIni, double tax) {
        this.saldo = saldoIni;
        this.taxa = tax;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Deposita(double dep) {
        saldo = dep + saldo;
    }

    public void Saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            this.saldo -= (valor * taxa);
            System.out.println("Valor da taxa de saque: " + (valor * taxa));
        } else
            System.out.println("Impossível sacar, saldo insuficiente !");
    }

    public double Taxa(double taxa) {
        double newSaldo = saldo * taxa;
        return newSaldo;
    }
}
