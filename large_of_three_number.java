import java.util.Scanner;

public class large_of_three_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        /*int max =a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
            */


           int max= Math.max(c,Math.max(a, b));
        System.out.println("The largest number of three is:"+max);
    }
}
