package TestInteface;

public class KethuaInteface implements ExamInterface{
    @Override
    public void Info(String ten, int cccd, String NamSing) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay*soNgayCong;
    }
}
