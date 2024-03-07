import java.util.Objects;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Podaj T, t, N lub n: ");

        boolean A = false;

        do {
            String znak = get.next();
            if(Objects.equals(znak, "T") || Objects.equals(znak, "t") || Objects.equals(znak, "N") || Objects.equals(znak, "n")) {
                System.out.println("Poprawne dane wejściowe. Podaj T, t, N lub n: ");
                A = true;
                break;
            }else {
                System.out.println("Błędne dane");
                znak = get.next();
            }
        }while (!A);

    }
}
