#include<stdio.h>
void main()
{
int c=0,i,n;
scanf("%d",&n);
while(n>0)
{
n=n/10;
++c;
}
printf("%d",c);
}
