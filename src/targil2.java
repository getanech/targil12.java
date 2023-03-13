public class targil2 {
    public static void main(String[] args){
        System.out.println(number(5, 3));

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(arrays(arr, 5));

        String[] arr1={"ab","abc","abcd"};
        System.out.println(G(arr1));

        System.out.println(S(12));

        int[] arr2 = {8,4,4,8};
        System.out.println(number2(arr));
    }
    public static int number(int num1, int num2) {//מכפילה את שתי החזקות ומחברת ביניהם

        return num1 * num1 + num2 * num2;
    }

    public static boolean arrays(int[] arr1, int x) {//בודקת אם הספרה נמצאת במערך
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == x) {
                return true;
            }
        }
        return false;
    }
    public static int G(String[] arr) {//הפונקציה מחשבת מה האורך של האיבר הכי גדול במערך, והיא מחזירה את האורך
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > k) {
                k = arr[i].length();
            }
        }return k;
    }
    public static boolean S(int n){//מחזיר מספר שמתחלק ב-3
        int x =3;
        while (n > 2){
            n=n-x;
            if(n==x||n==0){
                return true;
            }
        }return false;
    }
    public static boolean number2(int[] arr){ // {בודקת עם המערך הוא סמיטרי כמו {8,4,4,8
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                return true;
            }
        }return false;
    }
}


