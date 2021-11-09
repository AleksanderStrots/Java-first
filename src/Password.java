import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "correctPassword";
        Scanner s = new Scanner(System.in);
        String val;
        do {
            System.out.println("Enter password: ");
            val = s.nextLine();
        } while (!val.equals(password));
        System.out.println("Great!!!");
    }
}
