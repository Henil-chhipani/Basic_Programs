#include <stdio.h>

int main()
{
    
	int n = 2221,rev=0;
	int temp=n;
	while(n>=1){
		rev = rev*10+n%10; // 1  
		n=n/10 ;
	}
	if(rev == temp){
		printf("this is plidrom num");
	}else{
		printf("this is not");
	}

	
    return 0;
}