import java.io.*;
import java.lang.*;
import java.util.*;
public class guvi1  
{ 
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
System.out.println("\nenter num");
        int n=sc.nextInt();
         String str[]=new String[n];
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<String> al1=new ArrayList<String>();
int c=0,x=0;
System.out.println("\nenter value");
for(int i=0;i<n;i++)
{
        str[i]=sc.next();
}
for(int i=0,j=1;i<n && j<n;i++,j++)
{
String s1=str[i];
String s2=str[j];
al1.add(s1);
al1.add(s2);
int a=s1.length();
int b=s2.length();
if(a>b)
 x=b;
else if(b>a)
 x=a;
else
 x=a;
for(int p=0;p<x;p++)
{
if(s1.charAt(p)==s2.charAt(p))
{
c++;
}
else
{
break;
}
}
a=0;
b=0;
x=0;

al.add(c);
c=0;
}
	   Collections.sort(al);
	   Collections.sort(al1);

int temp=al.get(0);
String strtemp=al1.get(al1.size()-1);
System.out.println(strtemp.substring(0,temp));
    } 
} 




