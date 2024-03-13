#include <stdio.h>
void swap(int a, int b){
    int c;
    c = a;
    a = b;
    b = c;
}
int main(){
    int d, e;
    printf("Enter the value of d and e\na: ");
    scanf("%d", &d);
    printf("e: ");
    scanf("%d", &e);
    swap(d,e);
    printf("The new values\nd = %d\ne = %d",d, e);
    return 0;
}