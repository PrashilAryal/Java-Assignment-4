import java.util.Scanner;
public class Ques2 {
    public void currencyConverter() {


        Scanner input = new Scanner(System.in);
        System.out.println("CURRENCY CONVERTER");
        System.out.println("NRP to USD");

        System.out.print("Enter Nepalese currency: ");
        Double currency = input.nextDouble();

        Double result = currency * 135.03;
        System.out.println("Rs." + currency + " equals $" + result);

    }
}