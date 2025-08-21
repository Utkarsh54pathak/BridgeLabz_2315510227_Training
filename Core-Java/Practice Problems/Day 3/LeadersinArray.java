import java.util.*;
public class LeadersinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int[] leaders = new int[n];
        for(int i=0;i<n;i++){
            leaders[i] = sc.nextInt();
        }
        int max = leaders[leaders.length-1];
        List<Integer> li = new ArrayList<>();
        li.add(max);
        for(int j = leaders.length-2;j>=0;j--) {
            if (leaders[j] > max) {
                li.add(leaders[j]);
                max = leaders[j];
            }
        }// 16 17 4 3 5 2
    for(int c : li){
        System.out.print(c+ " ");}
    }
}
