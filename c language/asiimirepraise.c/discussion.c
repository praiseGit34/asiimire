#include <stdio.h>
#include <math.h>
int enter(){
    double a, b, c;
    printf("Enter sides of the triangle\n");
    printf("Enter side a: ");
    scanf("%lf", &a);
    printf("Enter side b: ");
    scanf("%lf", &b);
    printf("Enter side c: ");
    scanf("%lf", &c);
    return 0;
}
int area(){
    double a, b, c;
    double s = (a + b + c) / (float)2;
    double area1 = sqrt(s * (s - a) * (s - b) * (s - c));
    printf("The area of the triangle is %lf", area1);
    return 0;
}
int main(){
    enter();
    area();
    return 1;
}