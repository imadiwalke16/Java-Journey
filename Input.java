import java.util.*;
/*
 * package that is imported ie util 
 */
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(input);

        String Name=sc.nextLine();
        System.out.println(Name);

        int a=sc.nextInt();
        float b=sc.nextFloat();
        System.out.println(a);
        System.out.println(b);



        /*
         * make object of scanner class
         * next take input till space is not given 
         * to solve this use nextLine multiword sentance
         * 
         * nextInt to store int
         * nextFloat to store float
         * 
         * 
         */
    }
}
