package Quanlydiem;

public class MonToan extends Nam2023{

    public MonToan(String ten, String cccd) {
        super(ten, cccd);
    }

    // overwite

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc class Mon Toan");
    }
}
