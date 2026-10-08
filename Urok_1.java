import java.util.Scanner;

public class Urok_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secIn, hours, minutes, seconds;

        secIn = in.nextInt();

        hours = secIn/3600;
        minutes = (secIn-(3600*hours)) / 60;
        seconds = (9);
        System.out.print(hours + ":" + minutes + ":" + seconds);
    }
}
