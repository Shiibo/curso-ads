package Ex02;


public class Utils {

    public double toCelsius(double F) throws FahrenheitException {
        if (F < -459.67) {
            throw new FahrenheitException();
        }


        double c = (F - 32) * 5 / 9;
        return c;
    }


}
