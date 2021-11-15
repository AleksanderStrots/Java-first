import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        System.out.println("1 - Добавить товар\n2 - Показать содержимое\n3 - Выйти");
        String[] products = new String[1000];
        int index = 0;
        Scanner s = new Scanner(System.in);

        while (true) {
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Add a product: ");
                Scanner v = new Scanner(System.in);
                String value = v.nextLine();
                if(!value.trim().equals("")) {
                    products[index] = value;
                    index++;
                } else {
                    System.out.println("Поле не может быть пустым!!!");
                }
                System.out.println("1 - Добавить товар\n2 - Показать содержимое\n3 - Выйти");
            } else if (choice == 2) {
                int number = 1;
                for (String j : products) {
                    if (j != null) {
                        System.out.println(number + ") " + j);
                        number++;
                    }
                }
                System.out.println("1 - Добавить товар\n2 - Показать содержимое\n3 - Выйти");
            } else if(choice == 3) {
                break;
            }
        }
    }
}

