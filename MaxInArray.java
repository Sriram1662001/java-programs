package twodimension;
import java.util.Scanner;
class MaxInArray
{
    public static void main(String[] args)
    {
    int n,g1=0,g2=0;
    System.out.println("enter array len:");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int A[]=new int[n];
    System.out.println("enter array elements:");
    for(int i=0;i<A.length;i++) {
    A[i]=s.nextInt();
    }
    for(int i=0;i<A.length;i++) {
    if(g1<A[i]){
    g1=A[i];
    }
   
    }
    for(int i=0;i<A.length;i++) {
  if(g2<A[i] && g1>A[i]){
      g2=A[i];
  }
  }
    System.out.println("first high:"+g1);
    System.out.println("second high:"+g2);
    }
}
