package congTy;

public class NhanVienDiCa extends NhanVien{

    protected int ca;

    public NhanVienDiCa(String name, String add, int idCard, int ca) {
        super(name, add, idCard);
        this.ca = ca;
    }

    public NhanVienDiCa(String name, String add, int idCard) {
        super(name, add, idCard);
    }

    @Override
    public double tinhLuong() {
        return basicWage*1.1;
    }
}
