import java.io.*;
import java.lang.*;
import java.util.*;
class Prime {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
      int low=s.nextInt();
      int high=s.nextInt();
      low++;

        while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
}
