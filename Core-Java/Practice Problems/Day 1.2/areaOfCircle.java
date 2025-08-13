import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double Area = Math.PI * (rad * rad);
        System.out.println("Area of Circle : " + Area);
    }
    
}
