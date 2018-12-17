import java.io.*;
import java.lang.*;
import java.util.*;
public class prefix1
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        int c=0;
        if((1<=n)&&(m<=100000))
        {
        
        for(int i=0,j=0;i<m && j<m;i++)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
               c++; 
            }
            else
            {
                break;
            }
        }
        System.out.print(s1.substring(0,c+1));
        }
        else
        {
            System.out.print("give correct input");
        System.exit(0);
        }
    } 
} 




