#include<stdio.h>

void main() {
   int x, y, i;
   scanf("%d %d", &x, &y);
   x++;
   for(i=x;i<y;i++)
   {
       if((i%2)==0)
       {
               printf("%d",i);
                printf(" ");
       }
       
        }
}
