import java.util.Scanner;

public class bai8_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao mat khau");

        String mk1 = sc.nextLine();
        System.out.println("Mat khau cap 1 la " + mk1);

        System.out.println("Moi nhap vao mat khau cap 2 la so nguyen");
        int mk2 = sc.nextInt();
        System.out.println("Mat khau cap 2 la : " + mk2);
    }
}
