import java.util.*;
class Array1{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        // array is list of same type
        // it's placed in contagious meomary

        // create---datatype arrname[]=new dataType[size];

        // int marks[]=new int[50];
        
        // int n[]={1,2,3};

        // String fruit[]={"apple","mango"};


        // // input output in arrays 
    

        // Scanner sc=new Scanner(System.in);
        // System.out.println("marks phy chem maths");
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("phy:"+marks[0]);
        // System.out.println("chem:"+marks[1]);
        // System.out.println("maths:"+marks[2]);


        // // update array values 
        // marks[2]=marks[2]+1;
        // System.out.println(marks[2]);

        // int avg=marks[0]+marks[1]+marks[3]/3;
        // System.out.println("avg"+avg);

        // // length method
        // System.out.println("length of array:"+marks.length);

        // // pass array as argument
        int score[]={34,35,36};
        update(score);
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]+"");


        }




    }
}