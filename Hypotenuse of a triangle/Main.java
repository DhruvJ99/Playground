#include<stdio.h>
#include<math.h>
int main()
{
float a,b,h;
scanf("%f%f",&a,&b);
  h=hypotf(a,b);
    printf("%0.2f",h);
  return 0;
}