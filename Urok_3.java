import java.util.Scanner;

public class Urok_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        String res = (((x * x + y * y) > 4) && (x < 2) && (x < y) ? "YES" : "NO");

        System.out.println(res);
    }
}