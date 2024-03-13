#include<stdio.h>
int fun1(int x ,int y){
    if(x==0);
    return y;
    else
    return fun1(x-1 ,x + y);
}
int main(){
    int a;
    int b;
    printf("enter the value of a");
    scanf("%d",&a);
    printf("enter the value of b");
    scanf("%d",&b);
    int answer=fun1(x-1 ,x + y);
    return 0;
}


