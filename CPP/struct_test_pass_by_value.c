#include <stdio.h>
#include <stdlib.h>

struct TV {
  int vol;
};
 
void duplicate(struct TV remote2) {
    remote2.vol = 20;
    printf("In Duplicate: %d\n", remote2.vol);
}
 
int main()
{
    struct TV remote1;
    remote1.vol = 10;  
    printf("Initial test: %d\n", remote1.vol);
    duplicate(remote1);
    printf("After Duplicate: %d\n", remote1.vol);
}