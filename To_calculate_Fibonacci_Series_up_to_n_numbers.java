import java.util.Scanner;

public class To_calculate_Fibonacci_Series_up_to_n_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the value of n:");
         int n= sc.nextInt();

         int firstNum=0;
         int secondNum=1;
          int nextNum;

          System.out.print("The Fibonacci series is:");


         for(int i=1;i<=n;i++){
            System.out.print(firstNum + ",");
            nextNum = firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;


         }
    }
}
