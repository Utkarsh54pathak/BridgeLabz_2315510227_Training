import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in centimeters: ");
        double baseCm = sc.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The area of the triangle is " + areaCm2 + " cm² and " + areaInches2 + " in²");
    }
}
