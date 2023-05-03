public class sinhVien {
    private String name;
    private int age;
    private String address;

    public sinhVien() {
        name="Nguyen Van Vu";
        age=25;
        address="Ha Noi";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //    Constructor co doi so

//Giong ham __init__ trong python

    public sinhVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

//    Phuong thuc ko co kieu tra ve
    public void showInfo() {
        System.out.println("Ho ten:  " + name + " " + age + " " + address);
    }

//    Phuong thuc co kieu tra ve
    public double diemTB(double diemToan, double diemVan) {
        return (diemToan + diemVan)/2;
        }

    @Override
    public String toString() {
        return "sinhVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
