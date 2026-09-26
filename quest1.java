package Arrays1D;
import java.util.Scanner;
public class quest1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
//        int[] brr= new int[sc.nextInt()];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(j%2==0){
                arr[j]=arr[j]+10;
            }
            else{
                arr[j]=arr[j]*2;
            }
        }
        System.out.println("The array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
