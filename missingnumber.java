package Arrays1D;

import java.util.Scanner;

public class missingnumber {
    public static void input(int[] arr,int n,Scanner sc) {
        for(int i=0;i<n;i++){

            System.out.print("Enter " +(i+1)+" number : ");
            arr[i]= sc.nextInt();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,n,sc);
        int a=arr[0];
        int x=0;
        for(int i=0;i<n;i++){
            if(a == arr[i]){
                x++;
                a=x;
            }
        }
        System.out.println("The missing number is: "+x);
    }
}
