import java.util.Scanner;

public class zad13if {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Podaj A, B lub C: ");
        String znak = get.next();


        switch (znak) {
            case "A" -> {
                System.out.println("Podaj liczbę minut: ");
                int minuty = get.nextInt();
                if (minuty > 450) {
                    int reszta = minuty - 450;
                    double cena = reszta * 0.45 + 39.99;
                    System.out.println(cena);
                    if (cena > 59.99){
                        if (minuty > 900) {
                            double resz = (minuty - 900) * 0.4;
                            double roz = cena + resz - 59.99;
                            if (roz > 0){
                                System.out.println("Zaoszczędziłbyś " + roz + " gdybyś wybrał pakiet B.");
                            }
                        }else {
                            double roznica = cena - 59.99;
                            System.out.println("Zaoszczędziłbyś " + roznica + " gdybyś wybrał pakiet B.");
                        }
                    }
                } else {
                    double cena = 39.99;
                    System.out.println(cena);
                }
            } case "B" -> {
                System.out.println("Podaj liczbę minut: ");
                int min = get.nextInt();
                if (min > 900) {
                    int reszta = min - 900;
                    double cena = reszta * 0.4 + 59.99;
                    System.out.println(cena);
                } else {
                    double cena = 59.99;
                    System.out.println(cena);
                }
            }
            case "C" -> {
                double cena = 69.99;
                System.out.println(cena);
            }
            default -> System.out.println("Błąd.");
        }
    }
}
