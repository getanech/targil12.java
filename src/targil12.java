import java.util.Arrays;

public class targil12 {
    public static void main(String[] args) {
//        int[] arr1 = {10, 20, 30, 40, 50};
//        System.out.println(arr(arr1, 80));

        int[] arr1 = {1, 3, 5};
        System.out.println(Arrays.toString(array(arr1, 3)));

    }

    public static boolean arr(int[] array1, int n) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] + array1[j] == n) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] array(int[] arr, int k) {
        int[] newArr = new int[arr.length * k];
        int index = 0;
        int count = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[index];
            count++;
            if (count == k) {
                count = 0;
                index++;
            }
        }
        return newArr;
    }

}
