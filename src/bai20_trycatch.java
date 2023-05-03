public class bai20_trycatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            double c = a/b;
        }
        catch (Exception ex) {
            System.out.println("Khong the chia cho 0");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Khoi lenh van chay duoc du bat cu ly do gi ");
        }
    }
}
