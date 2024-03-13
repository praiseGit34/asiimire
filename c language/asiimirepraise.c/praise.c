#include <stdio.h>
int multiply(int num1, int num2){
    return num1 * num2;
}
int adition(int a , int b);
int main(){
    int multiplier, multiplicant;
    printf("Enter the multiplier and multiplicant: ");
    scanf("%d %d", &multiplier, &multiplicant);
    int product = multiply(multiplier, multiplicant);
    printf("The product of the numbers is %d\n",product);
    int x , y;
    printf("enter the value of x and y\n");
    scanf("%d %d",&x,&y);
    int sum  =adition(x , y);
    printf("the sum of x and y is %d\n",sum);
    return 0;
}
int adition(int a , int b){
    return a + b;
}
