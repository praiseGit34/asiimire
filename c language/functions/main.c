

#include<stdio.h>

int sum(int, int);

void main()

{

int x,y,result;

printf("\nThe calculation of the sum of two values:");

printf("\nThe entering of two values:");

scanf("%d %d",&x,&y);

result = sum(x,y);

printf("\nThe sum is : %d",result);

}

int sum(int x, int y)

{

return x+y;

}
