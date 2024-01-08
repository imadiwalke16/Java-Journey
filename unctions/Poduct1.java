package unctions;

public class Poduct1 {
    public static int mul(int a,int b){
        //we are passing params(formal params)
        int c=a*b;
        return c;

    }
public static void main(String args[]){
int c=mul(3, 4);//calling statements are are arguments(actual parameters)
System.out.println(c);
}    
}
