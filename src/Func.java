import java.util.*;
public class Func {
   public  static void main(String[] args) {
       multiple(10,20,"hi","GM");

    }
    static void multiple(int a,int b,String...c){
        System.out.println(a+" "+b+" "+Arrays.toString(c));

    }
}
