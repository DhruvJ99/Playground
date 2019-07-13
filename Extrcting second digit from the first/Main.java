#include <stdio.h>
int main() {
int n,sec;
  scanf("%d",&n);
  
  if(n<100) {
    sec=n%10;
      }
  else{
   sec=(n/1000)%10;
  }
  printf("%d",sec);
  return 0;
}