package Ex01;


public class Ex01 {

    public static void main(String[] args) {

        Chefe EmpC = new Chefe("Joao", "Pedro", 4, 750);
        TrabalhadorComissionado EmpTC =
                new TrabalhadorComissionado("Gabriella", "Lemos", 1000, 0.5, 1150);
        TrabalhadorPecaProduzida EmpTPP = new TrabalhadorPecaProduzida("Gabriel", "Gomes", 2, 500);
        TrabalhadorHora EmpTH = new TrabalhadorHora("Yan", "Carvalho", 485, 10);

        EmpC.calcularGanho();
        EmpTC.calcularGanho();
        EmpTPP.calcularGanho();
        EmpTH.calcularGanho();

    }
}
