// Yan Carvalho Fontes - CG3018211

import java.util.Scanner;

public class AA02conta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta c = new Conta(1000, 0.05);
        Conta cc = new ContaCorrente(1000, 0.05);
        Conta cp = new ContaPoupanca(1000, 0.05);


        c.Deposita(10);
        cc.Deposita(10);
        cp.Deposita(10);

        c.Saca(100);
        cc.Saca(100);
        cp.Saca(100);
        // c2.sacar(20);

        // c1.sacar(20);

        System.out.println("\nConta: " + c.getSaldo());
        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());
    }
}
