import java.util.Scanner;

public class Targil11 {
    public static void main(String[] args) {
        char[] arr3 = {'h','a','i','m'};
        System.out.println(wordNUmbers(arr3,'m'));

    }
    public static int wordNUmbers(char[]Str ,char ch){
        int count=0;
        for (int i = 0; i < Str.length; i++) {
            if(Str[i]==ch){
                count++;
            }
        }return count;
        }
    }














