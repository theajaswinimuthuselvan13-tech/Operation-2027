import java.util.Scanner;
public class Tempconverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Celius  to convert to faherniet ");
        int c=sc.nextInt();
        int f= (c*9/5)+32;
        System.out.print("-->"+f);


    }
}
