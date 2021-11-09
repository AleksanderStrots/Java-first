import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        String[] products = new String[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            System.out.println("Add a product");
            String value = s.nextLine();
            if (value.trim() == "") {
                break;
            } else {
                products[i] = value;
            }
        }
        for (String i : products) {
            if(i != null) {
                System.out.println(i);
            }
        }
    }
}
