import java.io.*;
import java.lang.*;
import java.util.*;
public class guvi7
{ 
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n,c=0;
        if(twopower(n)==0)
        System.out.println(0);
        else
        {
            while(twopower(x)==1)
            {
            x--;
            c++;
            }
        System.out.println(c);
        }
    }
    static int twopower(int tempNum)
    {
        int flag=0;
            while(tempNum!=1)
    {
        if(tempNum%2!=0){
            flag=1;
            break;
        }
        tempNum=tempNum/2;
    }
  
    if(flag==0)
        return 0;
    else
        return 1;

    }
} 






