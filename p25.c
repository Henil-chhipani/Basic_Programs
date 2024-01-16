#include <stdio.h>
#include <math.h>

int main()
{
	int a1,a2,max;
	scanf("%d %d",&a1,&a2);
	
	max = (a1>a2) ? a1:a2;
		while(1){
			if(max%a1==0 && max%a2==0){
				printf("lcm %d",max);
				break;
			}
			
			++max;
		}
  return 0;
}