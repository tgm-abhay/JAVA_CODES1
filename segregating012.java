package Arrays1D;

import java.util.Scanner;

public class segregating012 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int zeroes = 0;
        int ones = 0;
        int[] arr ={0,0,1,0,0,1,1,0,1,0,0,0,1,1,1,1,0};
        for(int el: arr){
            if(el==0){
                zeroes++;
            }
            else {
                ones++;
            }
        }
        for(int i=0;i<zeroes;i++){
            arr[i]=0;
        }
        for(int i=zeroes;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println("no.of zeroes: "+zeroes+"\nno.of ones: "+ones);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
