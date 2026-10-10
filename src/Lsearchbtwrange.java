import java.util.*;
public class Lsearchbtwrange {
   public  static void main(String[] args) {
       int []arr={11 ,23 ,45,67,89};
       int target = 89;
       System.out.print(lsearch(arr,target,0,2));

    }
    static boolean lsearch(int[]a,int t,int start,int end){
       if(a.length==0){
           return false;
       }
       for(int i=start;i<=end;i++){
           int s=t;
           if(a[i]==t){
               return true;
           }
       }return false;
    }
}
