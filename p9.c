// reverse num
#include <stdio.h>

int main()
{
    int num;
    scanf("%d",&num);
    while(num>=10){
    	printf("%d",num%10);
    	num=num/10;
	}
	printf("%d",num);
    return 0;
    
}