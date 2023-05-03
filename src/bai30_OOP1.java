public class bai30_OOP1 {
    public static void main(String[] args) {

        sinhVien sv1 = new sinhVien();
        sv1.showInfo();
        sinhVien sv3 = new sinhVien("Nguyen Van Vu", 25, "Hung Yen");
        sv3.showInfo();
        System.out.println(sv3.getAddress());
        sv3.setAge(30);
        sv3.showInfo();
        double diemSV3 = sv3.diemTB(10, 8.5);
        System.out.println(diemSV3);

        // Test ToString
        System.out.println(sv3);

    }
}
