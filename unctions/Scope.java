package unctions;

/**
 * block and method
 * Scope
 */
public class Scope {
    //i cant declare s var here cant read by compiler 

public static void main(String args[]){

    /*
     * scope means where we can use that variable 
     * if we define a var in a function after that line we can use that var
     * fun(inta,intb){
     * int s=a+b;
     * }
     */
    int s=45;
    System.out.println(s);
    /*block scope a var between two curly brase its scope is limited to t  */
    {
        int d=90;
    }
    //System.out.println(d);--------------this line will throw error uz var is contained in a code block


    // class scope to define this we use acess modifier like public private protected 

}
    
}