
import java.util.Scanner;

public class FinancialForecasting {

    public static double predictReturns(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return predictReturns(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = scanner.nextDouble();

        System.out.print("Enter expected annual return rate (e.g., 0.08 for 8%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter investment duration in years: ");
        int years = scanner.nextInt();

        double finalAmount = predictReturns(investment, rate, years);

        System.out.printf("Estimated value after %d years: ₹%.2f\n", years, finalAmount);

        scanner.close();
    }
}
