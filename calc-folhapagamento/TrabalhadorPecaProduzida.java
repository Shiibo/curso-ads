package Ex01;


public class TrabalhadorPecaProduzida extends Empregado {

    private int quantidade;

    public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome, int quantidade,
            double salario) {
        this.salario = salario;
        this.quantidade = quantidade;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    @Override
    public void calcularGanho() {
        salTot = salario * quantidade;

        System.out.print("\n" + primeiroNome + " " + ultimoNome);
        System.out.println("\nSalario Total: R$" + salTot);


    }

}
