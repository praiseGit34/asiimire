#include <stdio.h>
#include <stdbool.h>
int choose(){
    
}
int nums(){
    int num1, num2;
    printf("Enter the two numbers\nNum1:");
    scanf("%d", &num1);
    printf("Num2:");
    scanf("%d", &num2);
    return 0;
}
int addition(){
    int num1, num2, sum;
    nums();
    sum = num1 + num2;
    printf("The sum of the numbers is %d", sum);
    return 0;
}
int division(){
    int num1, num2, div;
    nums();
    div = num1 / num2;
    printf("The div of the numbers is %d", div);
    return 0;
}
int multiplication(){
    int num1, num2, product;
    nums();
    product = num1 * num2;
    printf("The product of the numbers is %d", product);
    return 0;
}
int subtraction(){
    int num1, num2, diff;
    nums();
    diff = num1 - num2;
    printf("The diff of the numbers is %d", diff);
    return 0;
}
int main(){
    int a;
    printf("\n\nType the number corresponding to what you want.\n");
    printf("Addition-1, Subtraction-2, Division-3, Multiplication-4\n\n");
    printf("Type number: ");
    scanf("%d", &a);

    
    //choose();
    if(a==1)
    addition();
    if(a==2)
    subtraction();
    if(a==3)
    division();
    if(a==4)
    multiplication();
    return 0;
}