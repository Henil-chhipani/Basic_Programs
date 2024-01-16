#include <stdio.h>

int main()
{
     	float num1,num2,ans=0;
     	printf("enter nums :");
     	scanf("%f %f",&num1,&num2);
		char c;
		printf("enter oprands +-/* etc...: ");
		scanf("%s",&c); 
		switch(c)
		{
			case'+':
			 ans= num1+num2;
			 printf("%f",ans);
			break;
			case'-':
			 ans=num1-num2;
			 printf("%f",ans);
			break;
			case'*':
			 ans=num1*num2;
			 printf("%f",ans);
			break;
			case'/':
			ans=num1/num2;
			printf("%f",ans);
			break;
			defult:
			printf("oprand is not valid");
			break;
		}
		
		
     	
	
	
    return 0;
}