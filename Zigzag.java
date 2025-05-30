import java.util.Scanner;
class Zigzag{
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int rn=sc.nextInt();
        int cn=sc.nextInt();
        int arr[][]=new int[rn][cn];
        for(int i=0;i<rn;i++){
            for(int j=0;j<cn;j++){
                arr[i][j]=sc.nextInt();
            }}

        
        int arr1[]=new int[cn*rn];
        int row=0,col=0,i=0;
        boolean up=true;
        while(row<rn && col<cn){

            if(up){
                while(row>0 && col<cn-1){
                    arr1[i++]=arr[row][col];
                    row--;
                    col++;

                }
                arr1[i++]=arr[row][col];
                if(col==cn-1){row++;
                }
                else{col++;}
            }
            else{
                while(col>0 && row<rn-1){
                    arr1[i++]=arr[row][col];
                    row++;
                    col--;

                }
                arr1[i++]=arr[row][col];
                if(row==rn-1){col++;
                }
                else{row++;}
                }

                up=!up;

        
        }
        for(int j=0;j<cn*rn;j++){
            System.out.print(arr1[j]+" ");
        }

    }
}