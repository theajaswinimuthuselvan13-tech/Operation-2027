import java.util.*;
public class Maxinarr {
   public  static void main(String[] args) {
       int[]arr={1,3,8,9,19};
       System.out.println(max(arr));

    }
    static int max(int[]arr){
       int MAXVAL=arr[0];
       for(int i =1;i<arr.length;i++){
           if(arr[i]>MAXVAL){
               MAXVAL=arr[i];
           }
       }
        return(MAXVAL);
    }
}
