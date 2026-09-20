
import java.util.*;
public class Shadowing {
    static int x=10;
    public static void main(String[]args){
        System.out.println(x);
        int x=90;
        System.out.println(x);
        func();
    }
    static void func(){
        System.out.println(x);
    }
}
