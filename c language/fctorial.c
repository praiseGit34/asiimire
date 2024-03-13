#include<stdio.h>
int factorialNew(int a);

int main(){
    printf("%d",factorialNew(5));
}

int factorialNew(int a){
    int answer;

    if(a==0){
            answer=1;
    }else{
        answer=a*factorialNew(a-1);
    }
    return answer;
    }

