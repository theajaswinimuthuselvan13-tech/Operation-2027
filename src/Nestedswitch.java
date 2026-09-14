import java.util.*;
public class Nestedswitch {
    public static void main (String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER DEPT");
        int dept = sc.nextInt();
        System.out.println("ENTER YEAR");
        int year=sc.nextInt();
       switch(dept){
           case 1 -> {
               System.out.println("CSE");
               switch(year){
                   case 1 -> System.out.println("1ST YEAR");
                   case 2 -> System.out.println("2ST YEAR");
                   case 3 -> System.out.println("3ST YEAR");
                   case 4 -> System.out.println("4ST YEAR");
                   default -> System.out.println(" Invalid input ");
               }
           }

           case 2 -> {
               System.out.println("ECE");
               switch(year){
                   case 1 -> System.out.println("1ST YEAR");
                   case 2 -> System.out.println("2ST YEAR");
                   case 3 -> System.out.println("3ST YEAR");
                   case 4 -> System.out.println("4ST YEAR");
                   default -> System.out.println(" Invalid input ");
               }
           }

           case 3 ->{
               System.out.println("EEE");
               switch(year){
                   case 1 -> System.out.println("1ST YEAR");
                   case 2 -> System.out.println("2ST YEAR");
                   case 3 -> System.out.println("3ST YEAR");
                   case 4 -> System.out.println("4ST YEAR");
                   default -> System.out.println(" Invalid input ");
               }
           }
           default -> System.out.println("invalid input ");
           }
       }

    }

