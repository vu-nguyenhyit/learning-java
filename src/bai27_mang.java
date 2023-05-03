public class bai27_mang {
    public static void main(String[] args) {
//        Khai bao mang
        String[] mangStr;
        Float[] mangFloat;
        Double[] mangDouble;
//        Khai bao kich thuoc mang

        String[] mangStr2 = new String[20];
        Float[] mangFloat2 = new Float[10];

//        Khai bao mang kem gia tri
        String[] mangStr3 = new String[]{"A1", "A2", "A3"};
        Integer[] mangInt3 = new Integer[]{1,2,3,4,5};

        System.out.println(mangInt3[3]);

        System.out.println(mangStr2[0]);

        System.out.println(mangInt3.length);

        for (int i=0; i<mangStr3.length; i++) {
            System.out.println(mangStr3[i]);
        }

        for (String str : mangStr3) {
            System.out.println(str);
        }
    }
}
