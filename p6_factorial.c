#include <stdio.h>

int factorial(int a){
	if(a==0) return 1;

	return a*factorial(a-1);

}

int main()
{
	int a;
	printf("enter num :");
	scanf("%d",&a);
	
	int fact = factorial(a);    
	printf("%d",fact);
}