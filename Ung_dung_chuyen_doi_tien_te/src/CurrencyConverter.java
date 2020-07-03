import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tien USD :");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("gia tri VND: " + quydoi);

    }
}
