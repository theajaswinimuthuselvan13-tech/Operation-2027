import java.util.*;
public class lsearchin2D {
   public static void main(String[] args) {
       int [][] arr={
               {11,23,45,67,8},
               {1,2,3,4,5,6},
               {13,4,58}
       };
       int target = 5;
       System.out.println(Arrays.toString(lsearch(arr,target)));}
    static int[]lsearch(int[][]a,int t){
       if(a.length==0){
           return new int[]{-1,-1};
       }
       for(int row=0;row<a.length;row++){
           for(int col=0;col<a[row].length;col++){
               if(a[row][col]==t){
                   return new int[]{row,col};
               }
           }
       }
       return new int []{-1,-1};
    }



    }

