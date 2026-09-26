package Arrays1D;

import java.util.Scanner;

public class seregating01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,0,0,1,1,1,0,1,0,1,1,0};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            } else if (arr[i]==0) {
                i++;

            }
            else if (arr[j]==1){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
