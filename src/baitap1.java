import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        System.out.println("Tim 2 so khi biet tong va hieu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tong cua 2 so la: ");
        double Tong = sc.nextDouble();
        System.out.println("Hieu cua 2 so la: ");
        double Hieu = sc.nextDouble();
        double a = (Tong + Hieu) / 2;
        double b = (Tong - Hieu) / 2;
        System.out.println("Hai so can tim la: " + a + " va " + b);

    }
}
