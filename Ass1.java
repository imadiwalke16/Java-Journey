/*Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N) */
import java.util.*;
class Ass1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        
        System.out.println("Enter value of B");
        int b=sc.nextInt();
         System.out.println("Enter value of C");
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println("Average of your 3 no are"+avg);


       /*
        * Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side)
        */
        System.out.println("Enter value of side");
        int side=sc.nextInt();

        int area=side*side;
        System.out.println("Area of Sq"+area);

        /*
         * Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        
         */

        System.out.println("Enter pencil cost");

        float pencil=sc.nextFloat();
        System.out.println("Enter pen cost");
        float pen=sc.nextFloat();
                System.out.println("Enter eraser cost");

        float eraser=sc.nextFloat();

        float Total=pencil+pen+eraser;
        System.out.println("Total cost excluding GST:"+Total);

        //float Gst=18.0f;
        //float GST_BILL=Gst*Total*0.01f;
        float GST_BILL=Total+(0.18f*Total);
        
        System.out.println("Bill Including GST will Be:"+GST_BILL);


        /*\
        (Advanced)Will the following statementgive any error in Java?
        int $=24
         * No, the statement will not give any error.NamesofvariablesarecalledidentifiersinJava.Identifierrulesays,identifierscanstartwithany alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.
         */

         /*
          * Question 4:What will be the type of result in thefollowing Java code?(Hint : Look at the largest data type among these)
          */




        }
}