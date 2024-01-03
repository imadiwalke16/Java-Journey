package Operators.conditional.Loops;
import java.util.*;
public class Ass3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
                sum=sum+n;

            }
            if(i%2!=0){
                System.out.println(i);
                sum=sum+n;
            }


        }
    }
    
}
