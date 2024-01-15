public class Linear {
    public static int Lin_Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String args[]){
        /*Linear search ---find index element with help of key  */

         int arr[]={2,4,6,8,10,12,14,16};
         int key=10;

         

         int index=Lin_Search(arr, key);
         if(index==-1){
            System.out.println("not found");
         }else{
            System.out.println("Found"+index);
         }

        //  time complexity less good program 
        /*worst case-o(n)
         * average case-
         * best case-
         */


         


        
    }
}
