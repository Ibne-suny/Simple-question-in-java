import java.util.Scanner;

public class Take_2_numbers_as_input_and_print_the_largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int first= sc.nextInt();

        System.out.println("Enter 2nd number:");
        int second= sc.nextInt();

        if(first>second){
               
            System.out.println(first+ " is greater then " + second);

        }
        else
        System.out.println(second + " is greater then " + first);
    }
}
