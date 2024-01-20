package application;

import service.BrazilInterestService;
import service.InterestService;
import service.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();
        System.out.println();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Usa Service");
        System.out.println("Payment after "+ months + " months:");
        System.out.println(String.format("%.2f", payment));

        System.out.println();

        InterestService si = new BrazilInterestService(2.0);
        System.out.println("Brazil Service");
        System.out.println("Payment after "+ months + " months:");
        System.out.println(String.format("%.2f", si.payment(amount, months)));

        System.out.println("Teste");

    }
}
