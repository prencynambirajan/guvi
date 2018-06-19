import java.io.*;
import java.lang.*;
import java.util.*;
class prefix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x1=sc.nextLine();
        String x2=sc.nextLine();
        int l1=x1.length();
        int l2=x2.length();
        int n;
        if(l1>l2)
        n=l1;
        else
        n=l2;
        char a1[];
        a1=x1.toCharArray(); 
        char a2[];
        a2=x2.toCharArray();
        for(int i=0; i<n;i++)
        {
            if(a1[i]==a2[i])
            System.out.print(a1[i]);
            else
            break;
        }
    }
}

