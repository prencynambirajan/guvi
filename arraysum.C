#include<stdio.h>
void main()
{
int n,j,i,k,s=0;
scanf("%d %d",&n,&k);
int a[n];
for(i=0;i<n;i++)
scanf("%d",&a[i]);
for(j=0;j<k;j++)
s=s+a[i];
printf("%d",s);
}
