public class baitap1 {
    public static void main(String[] args) {
        int count = 0;
        boolean check = true;
        int n = 2;
        String index = "";
        System.out.println("Ứng dụng in ra 20 số nguyên tố đầu tiên là: ");
        for (int i =0; i < 20; ){
            for (int j = 2 ; j <= Math.sqrt(n) ; j++ ){
                if (n % j == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                index = index + n + ", ";
                i++;
            }
            check = true;
            n++;
        }
        System.out.println(index);
    }
}
