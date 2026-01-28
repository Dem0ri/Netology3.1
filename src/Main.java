import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость билета в рублях: ");
        int price = scanner.nextInt();
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}