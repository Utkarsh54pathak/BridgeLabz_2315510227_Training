
import java.util.Scanner;

public class C_to_F {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        System.out.println("Temperature in F : "+ ((temp * 9/5) + 32));
    }
}
