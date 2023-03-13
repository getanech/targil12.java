import java.util.Arrays;
import java.util.Scanner;

public class targil12 {
    public static void main(String[] args) {
//        int[] arr1 = {10, 20, 30, 40, 50};
//        System.out.println(arr(arr1, 80));

        int[] arr1={1,3,5};
        System.out.println(array(arr1,3));

        }

    public static boolean arr(int[] array1, int n) {
       int sum=0;
       int sum2 =0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array1[i]+array1[j]==n){
                    return true;
            }
        }
    }return false;
}
   public static int[] array (int[] arr,int k){
        int[] newarr = new int[arr.length*k];
       int index = 0;
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < k; j++) {
               newarr[index]=arr[i];
               index++;
           }
       }return newarr;
   }

}
