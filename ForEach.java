package Arrays1D;

import java.util.Scanner;

public class ForEach {
    public static void input(int[] arr,int n,Scanner sc) {
        for(int i=0;i<n;i++){

        System.out.print("Enter " +(i+1)+" number : ");
        arr[i]= sc.nextInt();
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr,n,sc);
        for(int el:arr){
            System.out.print(el+" ");
            int x=el*2;
            System.out.print(x+" ");
        }
    }
}
