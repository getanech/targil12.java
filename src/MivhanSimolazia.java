import java.util.Scanner;

public class MivhanSimolazia {
    public static void main(String[] args) {
        //targil1();
        //targil2();
        //targil3(4444);
        //System.out.println(targil3(4444));
        //targil6(2);
        //System.out.println(targil4("Hello world",'l','o'));
        //isbeautifulnumbers();
        int[] arr2 = {-1, 3, -4, 6 - 8};
        System.out.println(positivNumber(arr2));

    }

    public static void targil1() {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        if (sum > 1000) {
            System.out.println((sum * 0.1) - sum);
        } else {
            System.out.println(sum);
        }
    }

    public static void targil2() {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = num / 100;
        int digit2 = (num % 100) / 10;
        int digit3 = num % 10;
        if (num > 100 && num <= 999) {
            System.out.println(num);
        }
    }

    public static int targil3(int number) {//כתבו פונקציה המבקשת מהמשתמש להכניס מספר שלם כלשהו, ומחזירה את כמות הספרות שיש במספר.
        // למשל// אם הקלט שהתקבל מהמשתמש הוא 439853 התכנית תחזיר את המספר 6
        //מכיוון שהמספר מכיל 6 ספרות בתוכו

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void targil6(int number) {// תכנית המקבל מספר כפרמטר . התכנית תדפיס את כל החזקות של אותו מספר שקטנות ממיליארד. (1,000,000,000).
        //לדוגמא אם מהספר שהתקבל הוא 2 . התכנית תדפיס
        //536870912...................2,4,8,16,32
        int count = 1000000;
        int count1 = 2;
        while (number <= count) {
            count--;
            //count1++;
            System.out.println(number *= count1);
        }
    }

    public static int targil4(String str, char c1, char c2) {//כתבו תכנית המקבלת כפרמטר מחרוזת ו2 תווים
        //התכנית תחזיר את מספר הפעמים שהתווים הנ"ל מופיעים במחרוזת. כלומר אם המחרוזת שהתקבלה היא " "Hello World. והתווים שהועברו הם  o , l
        //המחרוזת תחזיר את המספר 5. ( 3 פעמים האות l, ועוד פעמיים האות o במחרוזת)
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            //char c = str.charAt(i);
            if (str.charAt(i)==c1 || str.charAt(i) == c2) {
                count++;
            }
        }
        return count;
    }

    public static void isbeautifulnumbers() {
        for (int i = 0; i <= 20000; i++) {
            String s = String.valueOf(i);
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.println(i);
            }
        }
    }

    public static int positivNumber(int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[0]>arr1[i]&&arr1[i]<arr1[0]) {
                count++;
            }
        }return count;
    }
}


