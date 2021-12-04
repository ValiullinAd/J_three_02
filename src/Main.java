public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 99;
        double height = 199;
        double bMI = service.calculate(weight,height);
        if (bMI < 16.5)
            System.out.println("Выраженный дефицит массы " + bMI);
        if (bMI >= 16.5 & bMI <= 18.49)
            System.out.println("Недостаточная (дефицит) масса тела  " + bMI);
        if (bMI > 18.49 & bMI <= 24.99)
            System.out.println("Норма " + bMI);
        if (bMI > 24.99 & bMI <= 29.99)
            System.out.println("Избыточная масса тела " + bMI);
        if (bMI > 29.99 & bMI <= 34.99)
            System.out.println("Ожирение 1 степени " + bMI);
        if (bMI > 34.99 & bMI <= 39.99)
            System.out.println("Ожирение 2 степени " + bMI);
        if (bMI > 39.99)
            System.out.println("Ожирение 3 степени " + bMI);

    }
}
