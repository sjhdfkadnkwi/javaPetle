import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Wpisz liczbę od 10 do 24");
        int liczba = get.nextInt();
        while(!(liczba >= 10 && liczba < 24)){
            System.out.println("Wartość niepoprawna, podaj ponownie");
            liczba = get.nextInt();
        }
        System.out.println("Wartość poprawna.");
    }
}
