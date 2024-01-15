import java.util.*;

public class Largest {
    public static int getMax(int arr[]){
        int largest=Integer.MIN_VALUE; //-infinity
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];

            }
        }
        return largest;
        }
    public static void main(String[] args) {
        //find largest no.in given array
         /*-infinity==int.MIN_VALUE 
          * +infinity=int.Max_VALUE
          present in util package 
         */

         int arr[]={1,2,6,3,5};
         System.out.println("largest value"+getMax(arr));
    }
    
}
