#include <stdio.h>
#include <math.h>

int main()
{
	int a;
	scanf("%d",&a);
	int temp = a,f=0;
	
	while(temp>0){
		temp=temp/10; // 153 10 1
		f++;
	}
	printf("f=%d \n",f);
	// f =3 f is power 
	
	// 153 
	int num,t2=a,total=0;
	while(t2>0){
		num  =  t2%10;
		t2=t2/10;
		total = total + pow(num,f);
	}
	printf("\n total : %d",total);
	if(a==total){
		printf("\n number is armstrong num");
	}else{
		printf("\n number is not armstrong num");
	}
	
	
  return 0;
}