    import java.util.Scanner;
     
    class Factorial
    {
       public static void main(String args[])
       {
          int n, c, fact = 1;
       
          Scanner in = new Scanner(System.in);
         
          n = in.nextInt();
         
          if (n < 0)
             System.out.println("negative number");
          else
          {
             for (c = 1; c <= n; c++)
                fact = fact*c;
         
             System.out.println(fact);
          }
       }
    }
