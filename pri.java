import java.io.*;
import java.util.*;
class pri
{
public static void main(String[] args)
{
int n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the digit:");
n=s.nextInt();
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("prime number");
}
else
{
System.out.println("not primenumbe");
}
}
}
