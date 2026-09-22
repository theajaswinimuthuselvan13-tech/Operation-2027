import java.util.*;
public class Armstrongnumber {
  public   static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n =sc.nextInt();
      System.out.println("3-digit armstrong number "+armstrong(n));

    }
    static boolean armstrong(int num){
      int sum=0;
      int original=num;
      while(num>0){
          int rem = num%10;
          int cube= rem*rem*rem;
          sum+=cube;
          num/=10;
      } return original==sum;
    }
}
