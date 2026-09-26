package Arrays1D;

import java.util.Scanner;

public class rotatingarray {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,7,6,2,4,8,2,2,4,8};
        int shift = sc.nextInt();
        shift = shift % arr.length;
        reverse(arr, 0, shift - 1);
        reverse(arr,shift, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
