import java.io.*;
import java.lang.*;
import java.util.*;
public class guvi6
{ 
    public static void main(String args[])  
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
         int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=j;k<n;k++)
                {
                    if((a[i]<a[j])&&(a[j]<a[k]))
                    {
                     c++;
                    }
                }
            }
        }
        System.out.println(c);

    } 
} 







