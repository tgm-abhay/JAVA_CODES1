package Arrays1D;

import java.util.Scanner;

public class secondalrgest {
    public static void input(int[] arr,int n,Scanner sc) {
    for(int i=0;i<n;i++){

        System.out.print("Enter " +(i+1)+" number : ");
        arr[i]= sc.nextInt();
    }

    }
    public static void print(int[] arr,int n) {

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,n,sc);
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max)
                smax=arr[i];
        }
        System.out.println("max value:"+max);
        System.out.print("smax value:"+smax);

    }

}
