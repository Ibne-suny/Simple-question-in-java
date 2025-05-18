import java.util.Scanner;

public class Input_currency_in_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in any currency:");
        double amount = sc.nextDouble();

        System.out.println("Enter the current USD exchange rate:");
        double exchangeRate= sc.nextDouble();
        double usd = amount / exchangeRate;

        if(amount>0){
            System.out.println("The amount in USD is: " + usd +" $");
        }
        else{
            System.out.println("please entter a valid amount");
        }

    }
}
