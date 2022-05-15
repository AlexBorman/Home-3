import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        int b = scanner.nextInt();

        Methods calc = new Methods(a, b);
        System.out.println(calc.dodatu());
        System.out.println(calc.mnojtu());
        System.out.println(calc.vidnatu());
        System.out.println(calc.dilutu());
    }
}