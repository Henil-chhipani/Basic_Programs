// fibonaci 
#include <stdio.h>

void main(){
    int n=7,i,a1=0,a2=1,a3; // size of serise 
    for(i=0;i<n;i++){
    	a3=a2+a1;
    	printf("%d",a3);
    	a1=a2;
    	a2=a3;	 
    }
}