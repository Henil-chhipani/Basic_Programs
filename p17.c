#include <stdio.h>
#include <math.h>
int main()
{
 
 float t1,t2,t3,s=0,a=0; 
 scanf("%f %f %f",&t1,&t2,&t3);
 s=(t1+t2+t3)/2;
 float area = s*(s-t1)*(s-t2)*(s-t3);
 a= sqrt(area);
 printf("area = %f",a);
    return 0;
}