import java.util.Scanner;

public class bai9_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Xin moi nhap vao diem cua ban");

        double mark = sc.nextDouble();

        if (mark>=3.6) {
            System.out.println("Chuc mung ban da tot nghiep lai xuat sac");
            System.out.println("Xin chuc mung ban");
        } else if (mark>=3.2) {
            System.out.println("Chuc mung ban tot nghiep loai gioi");
        } else if (mark>=2.8) {
            System.out.println("Chuc mung ban tot nghiep loai kha");
        }
        else {
            System.out.println("Ban hoc dot vl");
        }
    }
}
