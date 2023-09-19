package university;

import java.util.*;

public class ATM{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr=new int[num];
        for (int i=0;i<num;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int sum=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
            sum+=arr[i];
        }
        System.out.print(sum);
        scanner.close();
    }
}
