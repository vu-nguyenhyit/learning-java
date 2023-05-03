package congTy;

public abstract class NhanVien {
    protected String name;
    protected String add;
    protected int idCard;

    protected double basicWage=1000;
    public NhanVien(String name, String add, int idCard) {
        this.name = name;
        this.add = add;
        this.idCard = idCard;
    }

    public abstract double tinhLuong();
}
