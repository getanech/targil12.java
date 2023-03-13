import java.util.Scanner;

public class targil1 {
    public static void main(String[] args) {
        String Mail="haimgetanech@gmail.com";
        System.out.println(ChackMail(Mail));


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter user name");
        String user = scanner.nextLine();
        System.out.println("hello " + user);

        String y = "haim";
        System.out.println(y.toUpperCase());
        System.out.println(y.toLowerCase());
        // System.out.println(y.substring(0,2).toUpperCase()+y.substring(2,4).toLowerCase());
        System.out.println(y.substring(0, y.length() / 2).toUpperCase() + y.substring(y.length() / 2).toLowerCase());
    }
    public static boolean ChackMail(String Email) {
        if(Email.indexOf('@')<1)
            return false;
        if(Email.indexOf(',')<=Email.indexOf('@')+1)
            return false;
        return false;
    }


    
}