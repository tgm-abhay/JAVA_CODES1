package Arrays1D;
import java.util.Scanner;
public class twondlargest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr ={2,6,9,8,3,9};
        int max = Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
//        for(int i=0;i<arr.length;i++){
//            if(smax!=max){
//                if(smax<arr[i]){
//                    smax=arr[i];
//                    System.out.println(smax);
//                }
//                }
//            else{
//                smax=arr[i+1];
//                System.out.println(smax);
//            }
//        }
//        System.out.println(smax);
//        System.out.println(max+" abhay");
        for (int j : arr) {
            if (j > smax && j != max)
                smax = j;
        }
        System.out.println("max value:"+max);
        System.out.print("smax value:"+smax);
    }
}
