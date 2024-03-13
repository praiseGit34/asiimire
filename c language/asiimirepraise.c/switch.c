#include<stdio.h>
int main(){
    int number;
    printf("enter the number from 1 to 7");
    scanf("%d ",&number);
    switch (number){
        case 1;
        printf("sunday");
        break;
         case 2;
        printf("monday");
        break;
         case 3;
        printf("tuesday");
        break;
         case 4;
        printf("thursday");
        break;
         case 5;
        printf("friday");
        break;
        
         case 6;
        printf("saturday");
        break;
        default
        printf("default");
    }
    return 0;
}