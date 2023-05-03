public class bai26_chuoi {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Xin chao tat ca moi nguoi \n");
        str.append("Minh la Nguyen Van Vu! ");
        str.insert(3, "ahihi");
        str.delete(7, str.length());
        System.out.println(str + " " + str.length());
    }
}
