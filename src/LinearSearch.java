import java.util.*;
public class LinearSearch {
     public static void main(String[] args) {
         int [] nums = {1,14,19,-3,24,43};
         int target=114;
         int ans=linearSearch(nums,target);
         System.out.println(ans);
    }
    static int linearSearch(int[]arr,int target){
         if(arr.length==0){
             return -1;
         }
         for(int i =0;i<arr.length;i++){
             if(arr[i]==target){
                 return i;
             }
         }
         return -1;
    }

}
