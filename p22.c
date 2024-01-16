#include <stdio.h>
#include <math.h>

int main()
{

int a;
scanf("%d",&a);

int i,sum=0;
for(i=1;i<a;i++){
	if(a%i==0){
		sum  = sum +i;
	}
}	
if(sum == a){
	printf("num is perfect num");
}
else {
	printf("num is not perfect num");
}
  return 0;
}