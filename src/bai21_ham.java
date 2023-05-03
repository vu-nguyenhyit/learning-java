public class bai21_ham {
    public static void main(String[] args) {
        int Tong = tong(4, 5);
        System.out.println("Tong: " + Tong);
        Hello("male");
    }


    public static int tong(int a, int b) {
        return a+b;
    }
    public  static  void Hello(String gtinh) {
        if (gtinh.equals("male")) {
            System.out.println("Day la nhan vien nam");
        }
        else {
                System.out.println("Day la nhan vien nu");
            }
        }

    }