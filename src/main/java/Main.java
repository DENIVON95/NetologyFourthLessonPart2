import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 177; // Рост в сантиметрах
        double weight = 76; // Вес в килограммах
        double bodyMassIndex = service.calculate(height, weight);
        System.out.println("Индекс массы тела равен: " + new DecimalFormat("#0.0").format(bodyMassIndex));
    }
}
