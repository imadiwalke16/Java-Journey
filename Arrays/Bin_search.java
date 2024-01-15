public class Bin_search {
    public static int Binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        /*prerequisite array should be sorted ascending or descending order
         * start index 0 end 7
         * start from middle (mid)
         * compare mid with key 
         * if mid>key then search in first half
         * or else in next half
         * so same assing mid to half array and reuse the algo from step 2
         * array(sorted)find start and end and assing a mid(conditions for mid must be mid should be greater lesser or equal to key )
         * if key==mid return ;))
         * if mid<key find in second half
         * if mid>key find in first half
         * now array will be divided into start to mid-1 and apply same algo for first half
         * IN SECOND HALF MID+1
         * 
         * 
         * if element not present return -1;
         * 
         * PSEUDO CODE;
         * 
         * 
         * START=0
         * END=N-1
         * WHILE(START<=END)
         * FIND MID
         * COMPARE MID AND KEY
         * MID==KEY-----------------FOUND
         * MID>KEY------------------LEFT
         * MID<KEY------------------RIGHT
        */


        int arr[]={2,4,6,8,10,12,14};
        int key=10;

        System.out.println("index for key element is:"+Binary(arr, key));

        // time complexity dependent on iterations -----------n/2^k=1-----------tc (proportional to) logbase2n ------o(log n)



    }
    
}
