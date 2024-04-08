import java.util.Scanner;

public class baithuchanh4 {
    public static void main(String[] args) {
        int infor = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu:");
        System.out.println("1. Print the  rectangle");
        System.out.println("2. Print the square triangle (The corner is square at: top-left)");
        System.out.println("3. Print the square triangle (The corner is square at: bottom-left)");
        System.out.println("4. Print the square triangle (The corner is square at: top-right)");
        System.out.println("5. Print the square triangle (The corner is square at: bottom-right)");
        System.out.println("6. Print isosceles triangle ");
        System.out.println("7. exit");
        while (infor != 7){
        System.out.println("------------------------------------------------");
        System.out.println("Hãy điền số vào đây:");
        infor = scanner.nextInt();
        String draw = "";
        String space = " ";
        switch (infor) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        draw = draw + ".";
                    }
                    System.out.println(draw);
                    draw = "";
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        draw += ".";
                    }
                    System.out.println(draw);
                    draw = "";
                }
                break;
            case 3:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        draw += ".";
                    }
                    System.out.println(draw);
                    draw = "";
                }
                break;
            case 4:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        draw += ".";
                    }
                    System.out.println(space + draw);
                    draw = "";
                    space += " ";
                }
                break;
            case 5:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        draw = draw + ".";
                    }
                    for (int e = 4; e >= i; e--) {
                        space += " ";
                    }
                    System.out.println(space + draw);
                    draw = "";
                    space = " ";
                }
                break;
            case 6:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        draw += ".";
                    }
                    for (int e = 4; e >= i; e--) {
                        space += " ";
                    }
                    System.out.println(space + draw + "." + draw);
                    draw = "";
                    space = " ";
                }
            }
        }
    }
}

