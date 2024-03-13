#include<stdio.h>
int factorial(int a);
int main (){
    int FactorialNew;
        printf("%d",factorialNew[5]);
}

/*int factorial(int a){
    int answer=1;
    int k;
    for(k=a;k>1;k--){
        answer*k;
    }
    printf("%d",answer);*/
int factorialNew(int a){
    int answer;

    if(a==0){
        answer=1;
       
    }else{
       answer=a*factorialNew(a-1); 
    }
     return answer;
       
}
