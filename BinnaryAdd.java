
import java.util.Scanner;


class BinnaryAdd{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();        
    String b=sc.nextLine();
    StringBuilder result=new StringBuilder();

    int l1=a.length()-1;
    int l2=b.length()-1;
    int carry=0;
    while(l1>=0 || l2>=0 || carry!=0){
        int sum=carry;
        if (l1>=0) {
            sum+=a.charAt(l1)-'0';
            l1--;
        }
        if (l2>=0) {
            sum+=b.charAt(l2)-'0';
            l2--;
        }
        result.append(sum%2);
        carry=sum/2;
    }
    /* // Just addition without operations
    int x=sc.nextInt();
    int y=sc.nextInt();
    while(y!=0){
        int car =x&y;
        x=x^y;
        y=car<<1;
    }
    System.out.println(x);
    */
    System.out.println(result.reverse().toString());
    }
}