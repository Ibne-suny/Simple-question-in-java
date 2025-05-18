import java.util.Scanner;

public class Take_in_two_numbers_and_an_operator_and_calculate_the_value {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of 1st input :");
        int first = sc.nextInt();

        System.out.println("Enter the value of 2nd input:");
        int secone = sc.nextInt();

         float addition=(int) (first +secone);
         float subtraction= (int)first-secone;
         float multiplaction = (int)(first*secone);
         float divition = (int)(first/secone);
         
         
         System.out.println(first+"+"+secone +"=" + addition);
         System.out.println(first+"-"+secone +"=" + subtraction);
         System.out.println(first+"*"+secone +"=" + multiplaction);
         System.out.println(first+"/"+secone +"=" + divition);
         
         
    }
}
