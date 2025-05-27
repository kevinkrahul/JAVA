import java.util.Scanner;
class Solmat{
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int rn=sc.nextInt();
        int cn=sc.nextInt();
        int arr[][]=new int[rn][cn];
        for(int i=0;i<rn;i++){
            for(int j=0;j<cn;j++){
                arr[i][j]=sc.nextInt();
            }

        }

    
        int row=0,col=0;
        while(row<rn && col<cn){
            col++; // 1
            for(int i=0;i<=col;i++){
                System.out.println(arr[row-i][i]+" ");
            row++; //2
            }
            col--; //0
            for(int i=row-1;i<=row;i++){
                System.out.println(arr[i][0]+" ");
            col++; //2
            }
            if(rn==cn){
                System.out.println(arr[row-1][col-1]+" ");
            row--; //1
            }
            else{col--;}//1}

            // row--; //1
            for(int i=row-1;i<=row;i++){
                System.out.println(arr[i][col]+" ");
            // col 2 // row 1
            }
            row++; //2        
            for(int i=col-1;i<=col;i++){
                System.out.println(arr[row][i]+" ");
            }
            col++;row++;


    

        }
    }
}