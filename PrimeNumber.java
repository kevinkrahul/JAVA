import java.util.*;
class Prime{
public int pri(int n,boolean isPrime){
    if(n<0 || n%2==0){
        return 0;
    }
    for(int i=3;i<n/2;i+=2){
        if(n%i==0){
            isPrime=false;
        }
    }
    if(isPrime){
        System.out.println(n);
    }
    return 0;
}
}


class PrimeNumber{

    public static void main(String []args){
    Prime p=new Prime();
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    for(int j=1;j<=n;j++){
    boolean isPrime=true;
    p.pri(j,isPrime);
    }
    }
}