public class TypePromotion {
    public static void main(String[] args) {
        /*
         * whatever datatype converted to int by java while evaluate expression
         * 
         * if one operand is long float double or double the whole expression is converted to dominant datatype
         * 
         * 
         */
        char a='a';
        char b='b';

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);

        byte o=5;
      //  byte r=o*2;//error ith int hoil na karan expression ala na
      //tar typecast
      byte v=(byte)(5*2);
      System.out.println(v); 
      //right way.....

    }
}
