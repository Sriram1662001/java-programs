import java.util.Scanner;
class Transpose
{
 
   public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        if(row>3 && row<10)
        {
           if(col>3 && col<10)
           {
           int[][] arr = new int[row][col];
           System.out.println();
            for(int i = 0; i<row; i++)
            {
              for(int j = 0; j<col; j++)
                 {
                arr[i][j] = sc.nextInt();
                 }
            }
          System.out.println();

    
           for(int i = 0; i<row; i++)
            {
             for(int j = 0; j<col; j++)
              {
                System.out.print(arr[i][j]+" ");
              }
            System.out.println();
            }
             System.out.println();
       
            for(int j = 0; j<col; j++)
              {
                 for(int i = 0; i<row; i++)
                  {
                   System.out.print(arr[i][j]+" ");
                  }
                System.out.println();
               }
           }
         else
           {
            System.out.println("invalid value");
           }
         }
         else{
            System.out.println("invalid value");
         }
      
   } 
}