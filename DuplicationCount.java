package dupilcate;
import java.util.Scanner;
import java.util.Arrays;
class DuplicateCount
{
    public static void main(String[] args)
    {
    int n,g1=0,g2=0,r=0;
System.out.println("enter array len:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int A[]=new int[n];
System.out.println("enter an array elements:");
for(int i=0;i<A.length;i++) {
A[i]=s.nextInt();
}
for(int i=0;i<A.length;i++) {
if(g1<A[i]){
g1=A[i];
}

}
for(int i=0;i<A.length;i++) {
if(g1==A[i]){
  r++;
}
}
System.out.println("first greatest:"+ " "+g1);
System.out.println("no of times the biggest no repeated:"+" "+r);
    }
}
