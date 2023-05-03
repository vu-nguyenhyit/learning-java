import java.util.Random;

public class bai24_random {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(1000);
        System.out.println(n);
    }
}
