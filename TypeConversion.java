public class TypeConversion {
    public static void main(String[] args) {
        /*
         * type compatible
         * dest type>source type
         * byte>short>int>float>long>double
         */

         int a=26;
         long b=a;
         System.out.println(b);

         /*
          * long to int conversion is not allowed so thrown error 
          so type compatible and dest type size is greater than source size
          to do this we have to use lossy conversion
          so implicit is type conversion 
          it is widening
    
          */

          /*
           * typecasting is explicit that is reverse the sequence of TypeConversion
           *          * byte<short<int<float<long<double
           * narrowing conversion
           * 

           * 
           */


           float x=25.12f;
           int z=(int)x;
           System.out.println("typecast value "+z);

           char r='a';
           int o= r;
           System.out.println(o);
           //this is possible it provides ascii


         
    }
    
}
