import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "correctPassword";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter password: ");
        String val = s.nextLine();
        if(!val.equals(password)){
            do {
                System.out.println("Enter new password");
                val = s.nextLine();
            } while (!val.equals(password));
        }
    }
}
