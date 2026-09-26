package Arrays1D;

import java.util.Scanner;

public class Basicquest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter"+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]);
            }
        }
    }
}
