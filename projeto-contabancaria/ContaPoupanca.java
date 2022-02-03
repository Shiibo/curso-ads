public class ContaPoupanca extends Conta {

    public ContaPoupanca(int saldoIni, double tax) {
        super(saldoIni, tax);

    }

    public void Saca(double valor) {
        super.taxa = taxa * 3;
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            this.saldo -= (valor * taxa);
            System.out.println("Valor da taxa de saque: " + (valor * taxa));
        } else
            System.out.println("Impossível sacar, saldo insuficiente !");
    }

}
