
import java.util.Scanner;
@FunctionalInterface
interface A{
    void show();
}

class ExceptionHan{


    static void m1(int a) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if(a<18){
            throw new ArithmeticException("Age is less than 18");
        }
        else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        A obj=()->{
            System.out.println("Hello all");

        };
        obj.show();
        int a=s.nextInt();
        int b=s.nextInt(); 
        int c=0;
        int arr[]=new int[5];
        
        try {
            c=a/b;
            m1(a);
            // if(a%b==0){
                // throw new ArithmeticException("The ans is zero");
            // }
            arr[5]=10;
        } catch (ArithmeticException e){
            System.err.println(e.getMessage());
        // System.out.println("The value of b Should not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of bound please enter correct index");
        }
        finally{
            System.out.println("Finally block executed");
            System.out.println(c);

        }
    
    }
}