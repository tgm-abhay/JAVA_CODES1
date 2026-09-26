package Arrays1D;

import java.util.Scanner;

public class wavyarray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,9};
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]<arr[i+1]){
                int  temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
//            if(i==arr.length){
//                break;
//            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
