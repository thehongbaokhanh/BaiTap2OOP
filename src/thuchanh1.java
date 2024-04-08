import java.util.Scanner;
public class thuchanh1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy nhập một số bất kì mà bạn muốn kiểm tra:");
        int number = infor.nextInt();
        if (number < 0){
            System.out.println("ứng dụng chỉ kiểm tra số nguyên dương.");
        }else {
            if (number <= 2){
                System.out.println("Số trên ko phải là số nguyên tố.");
            }else {
                for (int x = 2; x < number; x++){
                    if (number % x == 0){
                        count = count + 1;
                    }else {
                        count = count + 0;
                    }
                }if (count > 0){
                    System.out.println("Số trên không phải là số nguyên tố.");
                }else {
                    System.out.println("Số trên là một số nguyên tố");
                }
            }
        }
    }
}
