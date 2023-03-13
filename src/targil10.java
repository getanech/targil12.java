import java.util.Arrays;
import java.util.Scanner;

public class targil10 {
    public static void main(String[] args) {
        System.out.println(n1("haimGETANECH"));

        String[] arr3 = {"h","a","i","i","i","i","i","i","m"};
        System.out.println(arr(arr3, "i"));

    }

    public static int n1(String Q) {
        int count = 0;
        for (int i = 0; i < Q.length(); i++) {
            if (Q.charAt(i) >= 'A' && Q.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static int arr(String[] name, String tofind) {
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i]==tofind){
                count++;
            }
        }
        return count;
    }

}
