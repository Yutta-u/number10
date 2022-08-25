import java.util.Scanner;

public class number10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = a / 10;
        System.out.println(b % 10);
    }
}
