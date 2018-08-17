import java.io.*;
import java.lang.*;
import java.util.*;
class Armstrong {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      int number=s.nextInt();

        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
