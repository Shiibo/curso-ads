package Ex02;


import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) throws FahrenheitException {

        Utils cels = new Utils();
        double x = Integer
                .parseInt(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: "));
        try {
            double c = cels.toCelsius(x);
            System.out.println("\nTemperatura em graus celsius: " + c);
        } catch (FahrenheitException e) {
            System.out.println(e);
            // C: Os dois Catchs não funcionam juntos, pois o primeiro abrange o segundo.
        }
    }
}



/*
 * a) Crie duas exceções, TemperatureException que herda de Exception e FahrenheitException que
 * herda de TemperatureException. b) Crie uma classe (Utils) com um método para converter
 * temperaturas em graus Fahrenheit para graus Celsius (toCelsius()), ambas representadas em
 * ponto-flutuante (double). Porém, caso o valor a ser convertido seja menor que zero absoluto
 * (-459,67°F) deve-se lançar a exceção FahrenheitException.
 * 
 * c) Considere o trecho de código a seguir. Caso o código não possua problema, mostre o resultado
 * de sua execução, caso contrário, mostre o porquê do problema.
 */
