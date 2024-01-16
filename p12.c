#include <stdio.h>

int main()
{
    int n=5,b=0;
	int num=1;
    // 4 = 2^2  0100
  	while(n>num){
  		
	 	num=num*2;  
	  }
	
	  num=num/2;
	  int t=n;
	  
	  while(num>0){
	  	if(num<=t){
	  		printf("1");
	  		t=t-num;
		  }else{
		  	printf("0");
		  }
		  num=num/2;
		  }
	 
	
    return 0;
}