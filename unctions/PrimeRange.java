package unctions;

public class PrimeRange {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if (n%i==0){
                isPrime=false;
                 
            
        }
    }return isPrime;
}

    public static void Range(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
            System.out.println(i);



        } }
    }
    public static void main(String args[]){
        Range(20);

    }
    
}
