import java.util.Scanner;

public class find_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of principal:");
        double principal= sc.nextDouble();
        
        System.out.println("Enter the value of time(in year):");
        double time=sc.nextDouble();

        System.out.println("Enter the value of rate(in %): ");
        double rate= sc.nextDouble();

        double interest= (principal*time*rate)/100;

        System.out.println("The interest is :"+ interest);
       
    }
}
