#include <stdio.h>
#include <math.h>

int main()
{
	char str[]="henil";
	int i,v=0,c=0;
	for(i=0;i<5;i++)
	{
		if(str[i]== 'a' || str[i]== 'e' || str[i]==  'i' ||str[i]==  'o' ||str[i]==  'u'){
			v++;
		}else{
			c++;
		}
	}
	printf("v: %d c: %d",v,c);
  return 0;
}