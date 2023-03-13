import java.util.Arrays;

public class targil7 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2={7,8,9,10,11,12};
        System.out.println(arrays(arr1,arr2));

        int[] array={20,21,22,23};
        System.out.println(findHighest(array));

        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(sumArray(myArray));

        int[] arr={70,80,90,100};
        System.out.println(average(arr));

        int[] arr7 = {1, 2, 3, 4, 5};
        average2(arr1);
    }

    public static int arrays(int[] arr1, int[] arr2) {//כתבו פונקציה המקבלת מערך של מספרים שלמים ומחזירה את סכום המערך הכי גדול
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        if (sum > sum2) {
            return 1;
        } else return 2;
    }

    public static int findHighest(int[] max) {//מחזיר את המספר הכי גבוה במערך
        int highest = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > highest) {
                highest = max[i];
            }
        }
        return highest;
    }

    public static int sumArray(int[] arr) {//כתבו פונקציה המקבלת מערך של מספרים שלמים ומחזירה את סכום הערכים במערך
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {//מחזירה את הממוצע של המערך
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void average2(int[] arr1) {
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        double average3 = (double) sum1 / arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > average3) {
                System.out.println(arr1[i]);

            }
        }
    }
}

