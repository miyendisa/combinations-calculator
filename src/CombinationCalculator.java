import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        int n, r, i, combination;
        int rProduct = 1, nProduct = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n number: ");
        n = scanner.nextInt();

        System.out.print("Enter the r number: ");
        r = scanner.nextInt();

        for (i = 1; i <= r; i++) {
            rProduct *= i;
            nProduct *= n;
            n--;
        }
        combination = nProduct / rProduct;
        System.out.print("Answer :" + combination);
    }
}