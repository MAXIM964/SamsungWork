import java.util.Locale;
import java.util.Scanner;

public class Urok_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double age = in.nextDouble();

        System.out.println(age);
    }
}