import java.util.Scanner;

public class targil13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        while (!(str.startsWith("A"))&&str.endsWith("A")){
            str=scanner.nextLine();
        }
    }
}
