package Arrays1D;

import java.util.Scanner;

public class basics {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,3,4,5,6,7};
        System.out.println(arr1[3]);
        arr1[5]=93;
        int[] arr2 = new int[5]; // only four elements can be entered.
        for (int i = 0; i < arr2.length; i++) {
//            int x= sc.nextInt();
            arr2[i]= sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
