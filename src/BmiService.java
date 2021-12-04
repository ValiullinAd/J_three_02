public class BmiService {
    public double calculate (double weight, double height) {
        height = height / 100;
        double bodymassindex = weight / (height * height);
        return bodymassindex;
    }
}
