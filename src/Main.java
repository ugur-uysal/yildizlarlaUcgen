import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= (n - i)) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;
            }

            i++;
            System.out.println();
        }
    }
}