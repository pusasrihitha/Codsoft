import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> rates = new HashMap<>();

        // Exchange rates relative to USD
        rates.put("USD", 1.0);
        rates.put("INR", 83.20);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.78);
        rates.put("JPY", 157.40);

        System.out.println("===== Currency Converter =====");

        System.out.print("Enter Base Currency (USD, INR, EUR, GBP, JPY): ");
        String fromCurrency = sc.next().toUpperCase();

        System.out.print("Enter Target Currency (USD, INR, EUR, GBP, JPY): ");
        String toCurrency = sc.next().toUpperCase();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            System.out.println("Invalid Currency Code!");
            return;
        }

        double usdAmount = amount / rates.get(fromCurrency);
        double convertedAmount = usdAmount * rates.get(toCurrency);

        System.out.println("\n===== Conversion Result =====");
        System.out.printf("%.2f %s = %.2f %s%n",
                amount, fromCurrency,
                convertedAmount, toCurrency);

        sc.close();
    }
}
