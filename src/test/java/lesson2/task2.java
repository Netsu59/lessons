package lesson2;

public class task2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78;
        double weight = 75;
        double index = service.calculate(height, weight);
        System.out.println(index);
    }
}
