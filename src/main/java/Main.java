import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int payer;
        while (true) {
            System.out.println("На сколько человек делить счет?");
            if (scanner.hasNextInt()) {
                payer = scanner.nextInt();
                if (payer <= 1) {
                    System.out.println("Некорректное значение, введите количество человек больше одного!");
                     scanner.nextLine();
                } else {
                    break;
                }
            } else {
                System.out.println("Некорректрное значение введите целое число");
                scanner.nextLine();
            }
        }
        Calculator calculator=new Calculator();
        calculator.calc(payer);
        Formatter formatter=new Formatter();
        formatter.format(calculator.contribution);
        System.out.println(String.format("%s\nВсе гости должны заплатить по %.2f %s.", calculator.list, calculator.contribution, formatter.endWord));
    }

}
