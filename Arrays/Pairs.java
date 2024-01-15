public class Pairs {
    public static void Pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int Tp=0;
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                Tp++;
                //total pairs formula if asked---n(n-1)/2


            }
            System.out.println("Total pairs"+Tp);
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        //2,4---2,6---2,8----2,10----4,6---4,8----4,10----so on

        int arr[]={2,4,6,8,10};
        Pair(arr);
       //tc----n^2

       }
    
}
