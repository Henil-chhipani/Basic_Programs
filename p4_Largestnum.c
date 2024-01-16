#include <stdio.h>

int main()
{
    int n1,n2,n3;
    printf("enter three num:");

    scanf("%d %d %d",&n1,&n2,&n3);

    if(n1>n2){
        if(n1>n3){
            printf("n1: %d is largest num",n1);
        }else{
            printf("n3: %d is largest num",n3);
        }
    }
    else{
        if(n2>n3){
            printf("n2: %d is largest num",n2);
        }else{
            printf("n3: %d is largest num",n3);
        }
    }

    return 0;
}