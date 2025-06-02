
import java.util.Scanner;

class Recursion{

//fibonacci also TREE recursion
/*
    static int fibonacci(int a){
        if(a<=1){
            return 1;
        }

        return fibonacci(a-1)+fibonacci(a-2) ;
    
    }
    */


   //Tail recursion  also reverse numbers
   /*
   static void tailRec(int a){
    if(a==0){
        return;
    }
    System.out.println(a);
    tailRec(a-1);
   } 
   */


   //Head recursion
   /*

   static void headRec(int a){
    if(a==0){
        return;
    }
    headRec(a-1);
    System.out.println(a);
    
   } 
   */
  static void tree(int a){

    if(a<0){
        return;
    }
    tree(a-1);
    tree(a-1);
    System.out.println(a);
  }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        
        //fibonacci also TREE recursion
        /*
        for(int i=0;i<a;i++){
            if(i==0){
                System.out.println(i);
            }
            System.out.println(fibonacci(i));
        }
        */

    //    tailRec(a);
    //    headRec(a);
    tree(a);



        

    }
}