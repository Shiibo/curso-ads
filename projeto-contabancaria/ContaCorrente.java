public class ContaCorrente extends Conta {


    public ContaCorrente(int saldoIni, double tax) {
        super(saldoIni, tax);
        // TODO Auto-generated constructor stub
    }

    public void Saca(double valor) {
        super.taxa = taxa * 2;
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            this.saldo -= (valor * taxa);
            System.out.println("Valor da taxa de saque: " + (valor * taxa));
        } else
            System.out.println("Impossível sacar, saldo insuficiente !");
    }

    @Override
    public void Deposita(double dep) {
        saldo = dep + (saldo - 0.10);
    }


}
