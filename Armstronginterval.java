import java.io.*;

import java.lang.*;

import java.util.*;

class Armstronginterval
 {

    
public static void main(String[] args) 
{
     
   Scanner s=new Scanner(System.in);
    
  int low=s.nextInt();
 
        int high=s.nextInt(); 

     
   for(int number = low + 1; number < high; ++number)
 {
           
 int digits = 0;
   
         int result = 0;
 
           int originalNumber = number;
   
         while (originalNumber != 0)
 {
                
originalNumber /= 10;
   
             ++digits;
      
      }

           
 originalNumber = number;
   
         while (originalNumber != 0)
 {
            
    int remainder = originalNumber % 10;
           
     result += Math.pow(remainder, digits);
      
          originalNumber /= 10;
         
   }

        
    if (result == number)
   
             System.out.print(number + " ");

    
       }

}

}
