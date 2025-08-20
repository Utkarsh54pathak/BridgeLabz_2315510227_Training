import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 && i % 5 !=0) {
                arr[i] = "Fizz";
            } else if (i % 5 == 0 && i%3!=0) {
                arr[i] = "Buzz";
            } else if (i % 15 == 0) {
                arr[i] = "FizzBuzz";
            } else {
                arr[i] = "" + i;
            }
        }
        for(String str : arr){
            System.out.print(str+" ");
        }
        }
    }

