import java.util.Scanner;

class Arrays{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);   
    System.out.print("Enter the size of array :");     
    int n=sc.nextInt();
    // int arr[]=new int[n];
    // int rev[]=new int[n];

// Get array
    /*
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    */
//Print array
    /*
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
    */
//------------------------------------------------------------------------------------
/*
// Add adjust values of array
    int rev[]=new int[n];
    for(int j=0;j<n;j++){
        if(j<n-1){
        rev[j]=arr[j]+arr[j+1];
        }
        else if (j==n-1){
            rev[j]=arr[j]+arr[0];
        }
        System.out.print(" "+rev[j]);
    }
*/
//------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------
/*
//Sorting array each element with next all element (Ascending and descending then print half ascending and half descending)
    //Ascending
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int m=0;m<n;m++){
        rev[m]=arr[m];
        System.out.print(rev[m]+" ");
    }
    //Descending
    int des[]=new int[n];
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int m=0;m<n;m++){
        des[m]=arr[m];
        System.out.print(des[m]+" ");
    }
    System.out.println();
    // Print half ascending and half descending
    for(int i=0;i<n;i++){
        if(i<n/2){
            System.out.print(""+rev[i]);
        }
        else{
            System.out.print(""+des[i-(n/2)]);
        }
    }
*/
//---------------------------------------------------------------------------------------------------------------


// 2D array
/*
    int m=sc.nextInt();
    int arr2[][]=new int[n][m];
    int arr3[][]=new int[n][m];
    int arr4[][]=new int[n][m];
    //Matrix A
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr2[i][j]=sc.nextInt();
        }
    }
*/

//-------------------------------------------------------------------------------
/*
    //MAtix B

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr3[i][j]=sc.nextInt();
        }
    }
    //Multiply matrix
    for(int i=0;i<n;i++){  // rows A
        for(int j=0;j<m;j++){       // col B 
            for(int k=0;k<m;k++){  //col A
                arr4[i][j]+=arr2[i][k]*arr3[k][j];
        }
        }
    }
    // Matrix print
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr4[i][j]+" ");
        }
        System.out.println("");
    }
**/
//-----------------------------------------------------------------------

//-----------------------------------------------------------------------
/*
// 90 deg rotate
// 1 2 3         7 4 1
// 4 5 6   --->  8 5 2
// 7 8 9         9 6 3

   for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print(arr2[n-j-1][i]);
    }
    System.out.println("");
   }
   */
//---------------------------------------------------------------------


//-----------------------------------------------------------------------
/*
// Bracket sum

int sq=0,cu=0,pa=0;
boolean ans=true;
char arr2[]=new char[n];
   for(int i=0;i<n;i++){ 
        arr2[i]=sc.next().charAt(0);
   }
   for(int i=0;i<n;i++){
    if(arr2[i]=='{'){cu++;}
    else if(arr2[i]=='}'){cu--;}
    else if(arr2[i]=='['){sq++;}
    else if(arr2[i]==']'){sq--;}
    else if(arr2[i]=='('){pa++;}
    else if(arr2[i]==')'){pa--;}
    else if(cu<0 || sq<0 || pa<0){
        ans=false;
        break;
    }

   }
   if(!ans){
    System.out.println("Invalid ");
   }
  else if(cu==0 && sq==0 && pa==0){
    System.out.println("Valid");
   }
   else{
    System.out.println("Invalid");
   } 
   */
//------------------------------------------------------------------------

//-------------------------------------------------
/**
// MIssed Number in a array and store in a array
  //input
  for(int i=1;i<=n;i++){
    arr[i-1]=sc.nextInt();
  }
  //sorting
  for(int i=1;i<n;i++){
    for(int j=i;j<=n;j++){
        if(arr[i-1]>arr[j-1]){
            int temp=arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=temp;
        }
    }
  }
  int a=(arr[0]==0)?arr[n-1]-n+1:arr[n-1]-n;
  int arr2[]=new int[a];
    for(int i=1;i<=n;i++){
    System.out.print(arr[i-1]);
  }
System.out.println("");
int k=0;
// Missed values
  for(int i=arr[0];i<arr[n-1];i++){
    boolean ans=true;
    for(int m=0;m<n;m++){
        if(i==arr[m]){
            ans=false;
            break;
        }
    }
    if(ans){
            arr2[k]=i;
            System.out.println(i+" ");
            k++;
        }
  }

for(int i=0;i<a;i++){
    System.out.print(arr2[i]+" ");
}
**/
// -----------------------------------------------------------------------


//------------------------------------------------------------------------
/**
// Spiral matrix

int arr2[][]=new int[n][n];
// for(int i=0;i<n;i++){
    // for(int j=0;j<n;j++){
        // arr2[i][j]=sc.nextInt();
    // }
// }

int val=1;
int rowb=0,rowe=n-1,colb=0,cole=n-1;
while(rowb<=rowe && colb<=cole){

    for(int i=colb;i<=cole;i++){
        arr2[rowb][i]=val;
        System.out.print(arr2[rowb][i]+" ");
        val++;
    }
    rowb++;
    for(int j=rowb;j<=rowe;j++){
        arr2[j][cole]=val;
        System.out.print(arr2[j][cole]+" ");
        val++;
    }
    cole--;

    for(int i=cole;i>=colb;i--){
        arr2[rowe][i]=val;
        System.out.print(arr2[rowe][i]+" ");
        val++;
    }
    rowe--;

    for(int i=rowe;i>=rowb;i--){
        arr2[i][colb]=val;
        System.out.print(arr2[i][colb]+" ");
        val++;
    }
    colb++;
}

    System.out.println();
// Print 
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr2[i][j]+"  ");
        }
        System.err.println("");
    }
**/
//------------------------------------------------------------------------


System.out.println(n);

Kev ke=new Kev();
int temp=n;
int temp1=n;
int temp2=n,ncount=0,pcount=0;
for(int i=0;i<temp;i++){
    int se=ke.rev(temp1);
    int se2=ke.rev(temp2);
    if(temp1!=se){
        temp1--;
        ncount++;
    }
    else if(temp2!=se2){
        temp2++;
        pcount++;
    }
    else if(temp1==se || temp2==se2){
        if(ncount>pcount){
        System.out.println(se2);
        }
        else{System.out.println(se);
        }break;
    }

}
    }


}

class Kev{
    int rev(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
}
