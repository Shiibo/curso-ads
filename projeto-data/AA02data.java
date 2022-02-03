// Yan Carvalho Fontes - CG3018211


public class AA02data {
    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data();

        d2.dataAtual();
        d1.recebarData();
        System.out.println("Data: " + d1);
        d1.somaDia();
        System.out.println("Dia seguinte: " + d1);
        System.out.println("Data Sistema: " + d2.dataAtual());
    }
}
