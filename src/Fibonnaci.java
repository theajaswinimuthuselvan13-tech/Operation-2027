//import java.util.Scanner;
//public class Fibonnaci {
//   public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       int a=0;
//       int b=1;
//       int c=2;
//
//       System.out.println("enter the nth position of fibonacci term");
//       int n =sc.nextInt();
//       while (c<=n) {
//           int temp=b;
//           b=b+a;
//           a=temp;
//           c++;
//       }
//        System.out.println("number at "+n+"is"+b);
//    }
//}
import java.util.Scanner;
public class Fibonnaci{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("enter number of terms to display");
        int n= sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<=n;i++){
           int temp =b;
           b=a+b;
           a=temp;
            System.out.print(b+" ");
        }

    }
}
