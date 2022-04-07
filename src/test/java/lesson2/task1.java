package lesson2;

public class task1 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }

}
