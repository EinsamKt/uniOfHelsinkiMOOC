
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
5 000 — 25 000	100	8
25 000 — 55 000	1 700	10
55 000 — 200 000	4 700	12
200 000 — 1 000 000	22 100	15
1 000 000 —	142 100	17 */
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        if (gift < 5000 && gift >= 0) {
            System.out.println("No tax!");
        } else if (gift < 25000) {
            System.out.println("Tax:" + (100 + (gift-5000) * 0.08));
        } else if (gift < 55000) {
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.10));
        } else if (gift < 200000) {
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if (gift < 1000000) {
            System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
        } else if (gift >= 1000000) {
            System.out.println("Tax: " + (142100 + (gift - 1000000) * 0.17));
        }

    }
}
