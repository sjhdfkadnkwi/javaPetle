import java.util.Objects;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        boolean A = false;
        do {
            String name = get.next();
            if (Objects.equals(name, "tak") || Objects.equals(name, "nie")){
                System.out.println("ok?");
                A = true;
            }else {
                System.out.println("nie ok?");
                name = get.next();
            }
        }while (!A);
    }
}
