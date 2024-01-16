#include <stdio.h>
#include <math.h>

int main()
{
	char str1[]="henil",str2[]="chhipani";

	int i,k=0,length=0,j=0;	
	
	while (str1[length] != '\0') {
    ++length;
  		}
  		
  	 for (j = 0; str2[j] != '\0'; ++j, ++length) {
    str1[length] = str2[j];
  }
   str1[length] = '\0';
   
   printf("After concatenation: ");
  puts(str1);


	
  return 0;
}