import java.io.*;
import java.lang.*;
import java.util.*;
public class guvi5  
{ 
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
System.out.println("\n enter input \n");
        int n=sc.nextInt();
         int a=sc.nextInt();
         int b=sc.nextInt();
         int div=n/2;
         int ans=a+b;
         int x=0;
         if(a!=b)
         {
while(x<div)
{
x=x+ans;
}
}
else if(a==b)
{
    x=a;
    while(x<a)
    {
        x=x+a;
    }
}
System.out.println("\n output \n");
if(x==div)
System.out.println("YES");
else
System.out.println("NO");

    } 
} 





