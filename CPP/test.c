#include <stdio.h>
#include <stdlib.h>


void increment(int *num){

	*num = *num + 1;
	
}

int main(){

	int num = 10;
	increment(&num);

	printf("%d\n",num);
	return 0;
}


