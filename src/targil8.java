import java.util.Arrays;

public class targil8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(numbers(arr));

        int[] arr2={12,13,14,15};
        System.out.println(checkArray(arr2));

        int[] arr3={35,36,37,38};
        System.out.println(followers(arr3));

        int[] arr1={10,20,30,40};
        int[] arr4={50,60,70,80};
        System.out.println(theSame(arr1,arr2));

        int[] num1={50,60,70,80};
        int[] num2={80,70,60,50};
        System.out.println(theSame2(num1,num2));
    }

    public static int numbers(int[] secondmax) {//מחזיר את המספר השני בגודלו
        int arr = 0;
        for (int i = 0; i < secondmax.length - 1; i++) {
            if (secondmax[i] > arr) {
                arr = secondmax[i];
            }
        }
        return arr;
    }
    public static int checkArray(int[] arr) {
        int len = arr.length;
        if (len == 0) {
            return 4;
        } else if (arr[0] > arr[len - 1]) {
            return 1;
        } else if (arr[len - 1] > arr[0]) {
            return 2;
        } else {
             return 3;
        }
    }
    public static boolean followers(int[] num){//מחזיר מספרים עוקבים
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
           if (num[i]<min){
               min=num[i];
           }
           if (num[i] > max){
               max=num[i];
           }
        }return (max-min==num.length-1);
    }
    public static boolean theSame(int[] arr1,int[] arr2){//כתבו פונקציה המקבלת שני מערכים באורכים זהים. אם כל איבר במערך הראשון גדול מהאיבר המקביל
                                                         // במערך השני, התוכנית תחזיר true ,אחרת תחזיר false
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i-i]<arr2[i-i]){
                return true;
            }
        }return false;
    }
    public static boolean theSame2(int[] arr1,int[]arr2){//כתבו פונקציה המקבלת שני מערכים של מספרים שלמים. הפונקציה תחזיר תשובה האם במערך הראשון ישנם
                                                          //את אותם האיברים של המערך השני בסדר הפוך.
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==arr2[i-i]){
                    return true;
            }
        }return false;
    }
}


