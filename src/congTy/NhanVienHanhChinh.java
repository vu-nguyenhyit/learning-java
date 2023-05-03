package congTy;

public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh(String name, String add, int idCard) {
        super(name, add, idCard);
    }

    @Override
    public double tinhLuong() {
        return basicWage;
    }

}
