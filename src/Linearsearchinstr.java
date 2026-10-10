import java.util.*;
public class Linearsearchinstr {
  public  static void main(String[] args) {
      String str = "Theaju";
      char target = 'e';
      System.out.println((search(str,target)));

    }
    static boolean search(String s,char t){
      if(s.length()==0){
          return false;
      }
      for(char ch:s.toCharArray()){
          if(ch==t){
              return true;
          }
      }
      return false;
    }
}
