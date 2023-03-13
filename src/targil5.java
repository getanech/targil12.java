import java.util.Arrays;

public class targil5 {
    public static void main(String[] args) {
       int[] arr=arrays(5,20);
        System.out.println(Arrays.toString(arr));

        int[] arr1={1,2,3,4,5};
        array(arr1);

        int[] arr2={1,2,3,4,5,6,7,8,9,10,11,12};
        zogi(arr2);
    }
    public static int[] arrays(int size,int start){//מחזירה מספרים עוקבים5 פעמים  אחת אחרי השנייה
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=start+i;
        }return arr;
    }
    public static void array(int[] funk){//מדפיסה ערכים של המספר
        for (int i = 0; i < funk.length; i++) {
            System.out.println(funk[i]);
        }
    }
    public static void zogi(int[] array){//מחזירה מספרים זוגיים בלבד
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }
}
