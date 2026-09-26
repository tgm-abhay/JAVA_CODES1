package Arrays1D;

import java.util.Scanner;

public class Reversing  {
    public static void input ( int[] arr, int n, Scanner sc){
        for (int i = 0; i < n; i++) {

            System.out.print("Enter " + (i + 1) + " number : ");
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, n, sc);
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = arr[n-1-i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+" ");
        }

}
}
