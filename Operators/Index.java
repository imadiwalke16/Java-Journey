package Operators;
import java.util.*;
public class Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=5;
        System.out.println("add="+(a+b));
        System.out.println("mul="+(a*b));
        System.out.println("mod="+(a%b));
        System.out.println("sub="+(a-b));
        System.out.println("div="+(a/b));

        /*
         * binary operator 2 operand with one operation (+-/*%)%modulo
         * unary single operator (++/--) a=a+1 or a++;a--
         * increment operator (++):
         * pre:value change then use
         * post:use>then change
         */
        int c=10;
        int d=++c;

        int f=10;
        int x=f++;

        int $=11;
        int a_b=--$;

        int y=3;
        int z=y++;

        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(x);
        System.out.println($);
        System.out.println(a_b);
        System.out.println(y);
        System.out.println(z);
        
        /*TYPES OF OPERATORS(RELATIONAL):
         * ==/!=/>/</>=/<=
         */
        System.out.println(a==b);
                System.out.println(a!=b);
                        System.out.println(a>b);
                                System.out.println(a<b);
                                        System.out.println(a<=b);
                                                System.out.println(a>=b);




/*Logical operator - ||(OR) &&(AND) !(NOT) {NOT KAY KARTA TRUE CHA FALSE VICE VERSA}*/
System.out.println((3>2)&&(5>4));
System.out.println((1>2)||(5>4));
System.out.println(!(3>2));

/*ASSIGMENT OPERATORS 
 * =
 * +=/-=/*= //=
 */
a=+10;
System.out.println(a);
b=-5;
System.out.println(b);
a*=4;
System.out.println(a);
b/=2;
System.out.println(b);





    }
    
}
