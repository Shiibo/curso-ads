package Ex01;


public class Chefe extends Empregado {



    private int semanasT;


    public Chefe(String primeiroNome, String ultimoNome, int semanasT, double salario) {
        this.salario = salario;
        this.semanasT = semanasT;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }


    @Override
    public void calcularGanho() {
        salTot = semanasT * salario;

        System.out.print("\n" + primeiroNome + " " + ultimoNome);
        System.out.println("\nSalario Total: R$" + salTot);

    }

}
