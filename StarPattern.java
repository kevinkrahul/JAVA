
import java.util.Scanner;

class StarPattern{

    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();


        // left angle triangle
        int m=3;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<4;j++){
                if(j>=m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println("");
            m--;
        }
        System.out.println("------------------------------");
        // methode 2 left tri and pramide
        for(int i=1;i<=4;i++)
        {
            for(int j=i;j<4;j++){
                System.out.print(" ");
            }
            for(int n=4;n>4-i;n--){
                System.out.print("*"+" "); // without +" " this is left triangle 
            }
            System.out.println("");
        }
        System.out.println("------------------------------");
        //Square outline

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5 || i==j || j==5-i+1){
                System.out.print("*"+" ");
                }
                else{
                System.out.print("  ");

                }
            }
            System.out.println("");
            m--;
        }
        System.out.println("------------------------------");
        // M pattern

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=7;j++){
                if(j==1){
                System.out.print("*"+" ");
                }
            }
            for(int j=1;j<=4;j++){
                if(j==i){
                System.out.print("*"+" ");
                }
                else{
                System.out.print("  ");

                }
            }
            for(int j=1;j<=4;j++){
                if(j==4-i+1){
                System.out.print("*"+" ");
                }
                else{
                System.out.print("  ");

                }
            }
            for(int j=1;j<=7;j++){
                if(j==7){
                System.out.print("*"+" ");
                }
            }

            System.out.println("");
        }
        System.out.println("------------------------------");
        // alphabetic reverse and forward pramide
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<=7-i-1;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--){
                System.out.print((char)(65+k));
            }
            for(int n=1;n<=i;n++){
                System.out.print((char)(65+n));
            }
            System.out.println("");
        } 
        System.out.println("------------------------------");

        //hour glass
        for(int i=7;i>0;i--)
        {
            for(int j=0;j<7-i;j++){
                System.out.print(" ");
            }
            for(int n=0;n<i;n++){
                System.out.print("* "); 
            }
            System.out.println("");
            
        }
        for(int i=2;i<=7;i++)
        {
            for(int j=0;j<7-i;j++){
                System.out.print(" ");
            }
            for(int n=0;n<i;n++){
                System.out.print("* "); 
            }
            System.out.println("");   
        }

        System.out.println("------------------------------");


        //Diamond pattern

        for(int i=1;i<=7;i++)
        {
            for(int j=0;j<7-i;j++){
                System.out.print(" ");
            }
            for(int n=0;n<i;n++){
                System.out.print("* "); 
            }
            System.out.println("");   
        }
        for(int i=7-1;i>0;i--)
        {
            for(int j=0;j<7-i;j++){
                System.out.print(" ");
            }
            for(int n=0;n<i;n++){
                System.out.print("* "); 
            }
            System.out.println("");
            
        }

        System.out.println("------------------------------");

        // 01 invert right triangle
        for(int i=1;i<=5;i++){
            int printed=(i%2==0)?0:1;
            for(int j=1;j<=i;j++){
                System.out.print(printed);
                printed=(printed==0)?1:0;

            }
            System.out.println("");
        }

        System.out.println("------------------------------");
        // inverted right triangle
        for(int i=1;i<=5;i++){
            for(int j=0;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("------------------------------");
        //side pramid (2n-1)
        for(int i=1;i<=(2*a)-1;i++){
            int row=i>a?2*a-i:i;
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("------------------------------");
        //pramid odd
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int n=1;n<=(2*i)-1;n++){
                System.out.print("*"); 
            }
            System.out.println("");
        }

        System.out.println("------------------------------");
        //pramid odd inverted
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int n=1;n<=(2*(a-i)+1);n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    
        System.out.println("------------------------------");
        //pramid odd inverted hallogram
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int n=1;n<=(2*(a-i)+1);n++){
                if(n==1 || n==2*(a-i)+1 || i==a ||i==1){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println("");
        }



        System.out.println("------------------------------");
        //diamond outside
        for(int i=1;i<=2*a;i++){
            int row=(i>a)?i-a:(a-i)+1;
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            int col=(i>a)?2*(a-row)+2:i*2;
            for(int j=2;j<col;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }    
    }

}