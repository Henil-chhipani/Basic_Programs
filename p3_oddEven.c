#include <stdio.h>

int main()
{
    int num;
    printf("enter num:");
    scanf("%d",&num);

    if(num%2==0){
        printf("num is even");
    }else{
        printf("num is odd");
    }

    return 0;
}