# include<stdio.h>
int main ()
{
    int a=1.609;//where a represents the number of kilometers in a mile
    float distance_in_miles;
    float distance_in_kilometers;
    printf("enter the distance in miles\n");
    scanf("%f",&distance_in_miles);
    distance_in_kilometers= a*distance_in_miles;
    printf("the distance in kilometers is %f\n",distance_in_kilometers);
    return 0;


}
