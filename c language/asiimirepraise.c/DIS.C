#include <stdio.h>
int main(){
    for(int a = 10; a >= 0; a--){
        if(a == 3)
            continue;
        printf("%4d", a);
    }
    return 0;
}
