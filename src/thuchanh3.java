import java.util.Scanner;
public class thuchanh3 {
    public static void main(String[] args) {
        int[] numbera;
        int[] numberb;
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy nhập số tự nhiên 'a' bất kì vào đây:");
        int a = infor.nextInt();
        System.out.println("Hãy nhập số tự nhiên 'b' bất kì vào đây:");
        int b = infor.nextInt();
        if(a == 0 || b == 0){
            System.out.println("Hai số 'a' và 'b' ở trên không có ước số chung lớn nhất.");
        }
    }
}
