#include <stdio.h>

int main()
{
   int n=1121,sum=0;
   while (n>0){
   	sum=sum+n%10; // 0+1+1
   	n=n/10;
   }
printf("%d",sum);
    return 0;
}

