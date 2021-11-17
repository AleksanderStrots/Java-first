import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = s.nextLine();
        String val;

        do {
            System.out.println("Enter password: ");
            val = s.nextLine();
        } while (!val.equals(password));

    }
}
