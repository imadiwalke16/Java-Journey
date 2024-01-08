package unctions;

public class BinomialCoeff {
    public static int Fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;


        }
        return f;
    }

       public static int Bino(int n,int r){
            int fact_n=Fact(n);
            int fact_r=Fact(r);
            int fact_nmr=Fact(n-r);

            int BinoCoeff=fact_n/(fact_r*fact_nmr);
            return BinoCoeff;


        }
    
    public static void main(String args[]){
        // int x=Fact(4);
        // System.out.println(x);
System.out.println(Bino(5,2));
    }
}
