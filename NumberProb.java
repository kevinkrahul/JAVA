import java.util.*;

class NumberProb{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
// Armstrong Number -------------------------------------------------

    // (With method by string)
        /**
        int len=num.length();
        int sum=0;
        for(int i=0;i<len;i++)
        {
            char j=num.charAt(i);
            sum+=Math.pow(Integer.parseInt(Character.toString(j)), len);
        }
        if (sum==Integer.parseInt(num)){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("no");
        }
        **/

    // (Without methods)
        /**
        int rem=0,sum=0;
        int temp=num;
        String st=Integer.toString(temp);
        int len=st.length();
        while(num>0)
        {
            rem=num%10;
            int trem=rem;
            for(int i=1;i<len;i++){
                rem=rem*trem;
                }
            System.out.println(rem);
            sum=sum+(rem);
            num=num/10;
        }
        if(sum==temp){
                System.out.println("Amstrong");
        }
        else{
            System.out.println("no");
        }
        **/

// Palindrom --------------------------------------------------------------
    //(Integer)
        /**
        int temp=num;
        int sum=0,rem=0;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not a Palindrom");
        }
        **/

    // (String)
        /**
        String str="maadaam";
        boolean ans=true;
        int len=str.length();
        int left=0,right=len-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
            {
                ans=false;
            }
            else{
                ans=true;
            }
            left++;
            right--;
        }
        if(ans==true){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
        **/

//Amicable pair -----------------------------------------------
        /**
        int a=sc.nextInt();
        int b=sc.nextInt();
        NumberProb np=new NumberProb();
        int sum1=np.pair(a);
        int sum2=np.pair(b);
        if(sum1==sum2){
            System.out.println("Amicable pair");
        }
        else{
            System.out.println("Not Amicable pair");
        }
        **/


// factorial -------------------------------------
        /**
        long fac=1;
        int num2=sc.nextInt();
        for(int i=1;i<=num;i++){
            fac*=i;
        }
        System.out.println("fac of range : "+num+": "+fac);
        long fact2=fac;
        for(int j=num+1;j<=num2;j++)
        {
            fact2*=j;
            System.out.println("fac of range : "+j+": "+fact2);
        }
        **/
            

// Print left to right
        /**
        int div=1,temp=num;
        while(num>=10){
            num=num/10;
            div=div*10;
        }
        while(div>0){
            int dig=temp/div;
            System.out.println(dig);
            temp=temp%div;
            div/=10;
        }
        **/
    //(Method-2)

        int rem=0,sum=0,temp=num;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        System.out.println(sum);
        while(sum>0){
            rem=sum%10;
            System.out.println(rem);
            sum/=10;
        }
        


        int ab=11;
        System.out.printf("%h",ab);

    }
// Amicable pair method
        //     public int pair(int n){
        //     int sum=0;
        //     for(int i=1;i<=n;i++){
        //         if(n%i==0){
        //             sum+=i;
        //         }
        //     }
        //     return sum;

        // }
}