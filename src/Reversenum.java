import java.util.Scanner;
public class Reversenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to reverse");
        int num =sc.nextInt();
        int rev=0;

        while(num>0){
            int rem= num%10;
            rev= rev*10+rem;
             num/=10;

        }
        System.out.println(rev);
    }
}
