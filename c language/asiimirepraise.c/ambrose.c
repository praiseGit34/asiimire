#include<stdio.h>
int multiply(int a, int b){
    return a * b;
}
int main(){
    int product;
    int d, f;
    printf("enter d and f");
    scanf("%d %d",&d, &f);
    product = multiply(d,f);
    printf("%d", product);
    return 0;
}