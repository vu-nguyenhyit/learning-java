package congTy;

public class test {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("Nguyen Van Vu", "Hung Yen", 123456);
//        double wage = nv1.tinhLuong();
//        System.out.println(wage);
//
        NhanVienHanhChinh nvhc = new NhanVienHanhChinh("Hoang Phuong Anh", "Hung Yen", 123);
        double hcwage = nvhc.tinhLuong();
        System.out.println(hcwage);

        NhanVienDiCa nvdc = new NhanVienDiCa("Nguyen Van Vu", "Hung Yen", 12345);
        double dcwage = nvdc.tinhLuong();
        System.out.println(dcwage);

        NhanVienDiCa nvdc2 = new NhanVienDiCa("Nguyen Van Vu", "Hung Yen", 12345, 1);
        System.out.println(nvdc2.ca);


    }
}
