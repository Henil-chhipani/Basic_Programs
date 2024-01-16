#include <stdio.h>

void swap(int a,int b){
    a = a+b;// total 3
    b = a-b;// remove then b is a 3-2
    a = a-b;// remove b that is a so a becomes b 3-1
    printf("a: %d , b: %d",a,b);
   
}

int main()
{
    int a,b;
    printf("enter two num ");
    scanf("%d  %d",&a,&b);

    swap(a,b);
    

    return 0;
}