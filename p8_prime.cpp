#include <stdio.h>

int i=2;

boolean isPrime(int n){
	if(n==0 || n==1){
		return false;
	}
	if(n==i){
		return true;
	}
	if(n%i==0){
		return false;
	}
	i++;
	return isPrime(n);
}

int main()
{
 	int n;
	scanf("%d",&n);
bool a =	isPrime(n); 
if(a==true){
	printf("it is prime ");
}
else{
	printf("it's not'");
}

    return 0;
}