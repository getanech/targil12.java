import java.util.Arrays;

public class targil6 {
    public static void main(String[] args) {
        int[] arr = { 1,2, 4, 5, 6, 7, 8, 9, 10,16};
        System.out.println(num(arr, 6));

        int[] arr2 = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(array(arr2, 8));

        int[] arr3 = {1,2,3,3,3,3,4,5,6};
        System.out.println(array2(arr3,3));

    }

    public static int num(int[] arr4, int number2) {//מחזיר מה מתחלק בnumber2
        int count = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % number2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean array(int[] arr1, int sum) {//בודקת האם המספר נמצא במערך
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==sum){
                return true;
            }
        }return false;
    }
    public static int array2(int[]number,int number2){//מחזירה כמה פעמים הספרה נמצאת במערך
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]==number2){
                count++;
            }
        }return count;
    }
}
