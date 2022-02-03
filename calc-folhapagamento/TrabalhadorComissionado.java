package Ex01;


public class TrabalhadorComissionado extends Empregado {

    private int quantidade;
    private double comissao;

    public TrabalhadorComissionado(String primeiroNome, String ultimoNome, int quantidade,
            double comissao, double salario) {
        this.salario = salario;
        this.quantidade = quantidade;
        this.comissao = comissao;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    @Override
    public void calcularGanho() {
        salTot = salario + (comissao * quantidade);

        System.out.print("\n" + primeiroNome + " " + ultimoNome);
        System.out.println("\nSalario Total: R$" + salTot);

    }

}
