import java.util.List;

public class Calculatrice {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double avg(List<Double> tab) {
        if (tab == null || tab.size() == 0) {
            return 0;
        }
        return tab.stream().reduce(0.0, Double::sum) / tab.size();
    }
}
