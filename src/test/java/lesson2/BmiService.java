package lesson2;

public class BmiService {
    public double calculate(double height, double weight){
    double doubleHeight =  height * height;
    double index = weight / doubleHeight;
        return index;
    }
}
