public class SubArrays {
    public static void Sub(int arr[]){
        int ts=0;//total sub array sum of n no.=n(n+1)/2
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
    System.out.println("total subarray="+ts);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Sub(arr);
    }
    
}
