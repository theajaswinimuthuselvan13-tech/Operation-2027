import java.sql.SQLOutput;
import java.util.Scanner;
public class Countocc {
  public  static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to find the number of occurences");
      int n = sc.nextInt();
      System.out.println("Enter the number");
      int num = sc.nextInt();
      int c=0;
      while(num>0){
          int rem=num%10;
          if(rem==n){
              c++;
          }
          num/=10;
      }
      System.out.println(c);

    }
}
