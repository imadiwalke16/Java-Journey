package unctions;

public class Factorial {
    public static int Fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;


        }
        return f;
    }
    public static void main(String args[]){
        // n!=1*2*3*n -----factorial method
        int r=Fact(4);
        System.out.println(r);
   // Systems.out.println(r);
    //System.out.println(r);
    }
    
}
