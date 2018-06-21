#include <stdio.h>
int main()
{
int n, rev = 0, or;
scanf("%d", &n);
or = n;
while( n!=0 )
    {        
        rev = rev*10 + rem = n%10;;
        n /= 10;
    }
    if (or == rev)
        printf("yes");
    else
        printf("no"); 
    return 0;
}
