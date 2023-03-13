import java.util.Scanner;

public class targil4 {
    public static void main(String[] args) {
        g(5);

    }
    public static void number(int n) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("enter a number");
            num = scanner.nextInt();
        }
        while (num != n);
    }

    public static void g(int value){//זימנתי את הפונקציה למעלה עשיתי לולאה שרצה 3 פעמים ושמתי מספר מספר לדוגמא 5 רץ 3 פעמים
        for (int i = 0; i < 3; i++) {
           number(value);
        }
    }
}


