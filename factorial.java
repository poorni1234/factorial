import java.io.*;
import java.util.*;
class Factorial
{
	public static void main(String[] args) 
  {
   int a=1,i,c;
   Scanner sd=new Scanner(System.in);
   System.out.println("Enter number");
   c=sd.nextInt();
   for(i=1;i<=c;i++)
{
  a=a*i;
 System.out.println(a);
}
 }
  }
