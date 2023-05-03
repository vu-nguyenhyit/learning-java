package Quanlydiem;

public class MonVan extends Nam2023{
    public MonVan(String ten, String cccd) {
        super(ten, cccd);
    }

    // overriding

    @Override
    public void tinhDTB() {
        System.out.println("Day la cach tinh cua Mon Van");
    }
}
