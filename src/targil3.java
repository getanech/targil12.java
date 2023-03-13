import java.util.Arrays;

public class targil3 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Array(num,9));

        System.out.println(func("HAIM"));
        System.out.println(n1("haimGETANECH"));

        int[] arr = num(7);
        System.out.println(Arrays.toString(arr));

        int[] myArray = number(5,42);
        System.out.println(Arrays.toString(myArray));

    }
    public static boolean Array(int[] numbers, int goal){//לוקחת שתי מספרים ומחברת ביניהם
                                                         // ובודקת אם המספר ששמנו בgoal שווה לתוצאה
         for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==goal&&i!=j){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean func(String number){//מחזירה תשובה בוליאנית אם הפונציה מורכבת מאותיות גדולות
       if(number==number.toUpperCase()){
           return true;
       }return false;
    }
    public static int n1(String Q){//מחזירה מספר כמה אותיות קטנות יש בפונקציה
        int count = 0;
        for (int i = 0; i < Q.length(); i++) {
            if(Q.charAt(i)>='a'&& Q.charAt(i)<='z'){
                count++;
            }
        }return count;
    }
    public static int[] num(int size){// פונקציה המקבלת מספר שלם size ומחזירה מערך של מספרים שלמים בגודל size
       int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
           arr[i] = i;
        }return arr;
    }
    public static int[] number(int size,int value){//כתבו פונקציה המקבלת מספר שלם size ומספר שלם value ומחזירה מערך של מספרים שלמים בגודל size
                                                   //שכל אחד מהתאים שלו מכיל את הערך value.
       int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=value;
        }return arr;
    }
}
