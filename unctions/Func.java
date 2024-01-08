package unctions;
import java.util.*;
public class Func {

    public static void printHelloWorld(){
        System.out.println("hello world");
    }
    public static void add(int a,int b){
       //added params in functions  

int sum=a+b;
System.out.println(sum);
    }
    public static void main(String[] args) {
        printHelloWorld();
    //    params
    /* return type name(type param1,param2){
        //body
        return statement
    } */
    Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
add(a, b);
/*
 * function utilizes meomary in stack meomary ie(call stack)
 * main stack frame is created then when other funtion is created or called tjhen the other call stack is referred 
 */


    }
    
}
