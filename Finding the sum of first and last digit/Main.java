#include <stdio.h>
int main() {
    int x,i,num, last ;
     scanf("%d", &num);
     last = num%10;
  i=last;
     while(num>=10)
    {
        num = num/10;
    }

 x=i+num;
    printf("%d",x);

	return 0;
}