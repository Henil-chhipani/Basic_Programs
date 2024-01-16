#include <stdio.h>
#include <math.h>

int main()
{
	int a1,a2,i=1,j=0,gcd=0;
	int arr1[100],arr2[100];
	scanf("%d %d",&a1,&a2);
	
	for(i=1;i<=a1 && i<= a2;i++){
		if(a1%i == 0 && a2%i==0){
			gcd = i;
	}
	}
	printf("gcd : %d",gcd);
	
	
	
  return 0;
}