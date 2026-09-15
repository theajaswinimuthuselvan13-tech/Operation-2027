import java.util.*;
public class Multiplication {
     public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
         int num = sc.nextInt();
         int i = sc.nextInt();
         for(int a=1;a<=i;a++){
             System.out.println(num+"*"+a+"="+num*a);
         }

    }
}
