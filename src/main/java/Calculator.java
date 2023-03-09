import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
    String list = "Ваш список продуктов:\n";
    double sum;
    String product;
    double price;
    double contribution;

    void calc(int guest) {
        while (true) {
            System.out.println("Введите название товара:");
            product = scanner.nextLine();
            System.out.println("Введите цену товара:");
            while ((!scanner.hasNextDouble() )||(price=scanner.nextDouble())<=0) {
                System.out.println("Некорректное значение. Введите число ,больше 0");
                scanner.nextLine();
            }
            Check check = new Check(product, price);
            sum += check.price;
            list = list + check.product + "\n";
            System.out.println(check.product + " успешно добавлен\nЕсли хотите добавить ещё товар - нажмите любую кнопку\nДля завершение введите команду - Завершить");
            scanner.nextLine();
            String command = scanner.nextLine();
                    if (command.equalsIgnoreCase("завершить")) {
                        break;
                    }
            }
        contribution = sum / guest;
        }
    }

