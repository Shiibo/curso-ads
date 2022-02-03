package Ex01;


public class TrabalhadorHora extends Empregado {

    private int horas;

    public TrabalhadorHora(String primeiroNome, String ultimoNome, int horas, double salario) {
        this.salario = salario;
        this.horas = horas;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    @Override
    public void calcularGanho() {
        salTot = salario * horas;

        System.out.print("\n" + primeiroNome + " " + ultimoNome);
        System.out.println("\nSalario Total: R$" + salTot);



    }

}
