import java.util.Scanner;

public class RemoveOccurance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter Element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Element to be removed");
        int ele = sc.nextInt();
        int count=0;
        for(int i = 0;i<n;i++){
            if(arr[i]!=ele);
            count++;
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=ele){
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j=i;
            }
        }
    for(int c : arr){
            System.out.print(c + " ");;

    }
    }
}
