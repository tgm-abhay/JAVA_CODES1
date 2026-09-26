package Arrays1D;

import java.util.Scanner;

public class reversingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        reveresing part of an reversingarray
        int[] arr = {5,9,4,37,64,62,44,57,43};
//        int i =0;
//        int j = arr.length - 1;
        int i = 3;
        int j = 6;
        while (i < j) {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;j--;
        }
        System.out.println("Reversed array: ");
        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]+" ");
        }
    }
}
