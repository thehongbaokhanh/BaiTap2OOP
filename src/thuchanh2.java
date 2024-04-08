import java.util.Scanner;
public class thuchanh2 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
            System.out.println("Hãy nhập số tiền bạn muốn gửi vào ngân hàng: ");
            Double money = infor.nextDouble();
            System.out.println("Hãy nhập lãi suất ngân hàng mà bạn gửi vào (% / 1 năm): ");
            Double interestMoney = infor.nextDouble();
            System.out.println("Hãy nhập thời gian bạn muốn tính (tháng): ");
            int month = infor.nextInt();
            Double result = money * (interestMoney /100) / 12 * month;
            for (int x = 0; x < month; x++){
                result += 1;
            }
            System.out.println("Số tiền sau khi bạn rút là: " + result + " đồng.");
    }
}
