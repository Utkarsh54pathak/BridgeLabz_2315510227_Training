import java.util.ArrayList;
import java.util.*;

public class fact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> arr =  new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr.add(i);
            }
        }
    for(int i:arr){
        System.out.println(i);}
    }
}
