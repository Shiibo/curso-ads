import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Data {
    public int Dia, Mes, Ano;
    Scanner sc = new Scanner(System.in);



    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void recebarData() {
        boolean validacao = validacao();
        do {
            System.out.print("Informe o dia: ");
            this.Dia = sc.nextInt();
            System.out.print("Informe o mes: ");
            this.Mes = sc.nextInt();
            System.out.print("Informe o ano: ");
            this.Ano = sc.nextInt();
            validacao = validacao();
            System.out.println("\n");
            if (validacao == false) {
                System.out.println("Data invalida\n");
            }
        } while (validacao == false);
    }

    public boolean validacao() {
        return getDia() > 0 && getDia() < 32 && getMes() > 0 && getMes() < 13 && getAno() > 0
                && ((getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7
                        || getMes() == 8 || getMes() == 10 || getMes() == 12)
                        || ((getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11)
                                && getDia() <= 30)
                        || (getMes() == 2
                                && (getDia() <= 29 && getAno() % 4 == 0
                                        && (getAno() % 100 != 0 || getAno() % 400 == 0))
                                || getDia() <= 28));
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getDia() {
        return Dia;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getMes() {
        return Mes;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getAno() {
        return Ano;
    }

    public String toString() {

        return "" + getDia() + "/" + getMes() + "/" + getAno();
    }

    void somaDia() {
        boolean validacao = false;
        setDia(getDia() + 1);
        validacao = validacao();
        if (validacao == false) {
            setDia(1);
            setMes(getMes() + 1);
            validacao = validacao();
            if (validacao == false) {
                setMes(1);
                setAno(getAno() + 1);
            }
        }
    }

    public String dataAtual() {
        SimpleDateFormat formData = new SimpleDateFormat("dd/MM/yyyy");
        return formData.format(System.currentTimeMillis());
    }

}
/*
 * public String dataAtt() { DateFormat dataAtt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); Date
 * date = new Date(); return dataAtt.format(date); }
 */


