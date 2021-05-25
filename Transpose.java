import java.util.Scanner;
class Transpose
{
 
   public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        if(r>3 && r<10)
        {
           if(c>3 && c<10)
           {
           int[][] arr = new int[r][c];
           System.out.println();
            for(int i = 0; i<r; i++)
            {
              for(int j = 0; j<c; j++)
                 {
                arr[i][j] = s.nextInt();
                 }
            }
          System.out.println();

    
           for(int i = 0; i<r; i++)
            {
             for(int j = 0; j<c; j++)
              {
                System.out.print(arr[i][j]+" ");
              }
            System.out.println();
            }
             System.out.println();
       
            for(int j = 0; j<c; j++)
              {
                 for(int i = 0; i<r; i++)
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
