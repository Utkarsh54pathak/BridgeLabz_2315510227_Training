import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.println(Math.PI*r*r*h);
    }
}
