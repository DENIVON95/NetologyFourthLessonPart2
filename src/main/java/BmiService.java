public class BmiService {

    /**
     * @param height рост в сантиметрах
     * @param weight вес в килограммах
     * @return индекс массы тела
     */
    public double calculate(double height, double weight) {
        double convertedHeight = Math.pow(height / 100, 2);
        return weight / convertedHeight;
    }
}
