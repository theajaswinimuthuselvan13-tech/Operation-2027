import java.util.*;

public class Greeting {
public static void main (String[]args){
    String a= myGreet("Theaja");
    System.out.print(a);
}
static String myGreet( String name){
    String msg= "Hiiiiiiii "+name;
    return msg;
}
}
