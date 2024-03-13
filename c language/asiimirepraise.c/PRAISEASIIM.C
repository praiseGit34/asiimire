#include <stdio.h>
int main(){
    float teacher_discount_rate=0.10;
    float higher_purchase_discount_rate=0.12;
    float tax_sales_rate=0.05;
    int isTeacher;


    float purchase_total;
    float price;
    float discounted_total;
    float tax;
    float final_total;

    printf("enter the purchase_total:\n");
    scanf("%f",purchase_total);
    printf("is teacher (if yes, type 1, if no ,type 0):\n");
    scanf("%d",&isTeacher);
    if (isTeacher ==1&&purchase_total>=100){
            price=higher_purchase_discount_rate;
            }else if(isTeacher==1 &&purchase_total<100);{
        price=teacher_discount_rate;
        }else if (isTeacher==0);{
            price=purchase_total;
        }
      discounted_total=purchase_total-(price*purchase_total);
      tax=discounted_total*tax_sales_rate;
      final_total=discounted_total + tax;
printf("discounted_total is %.2f:",discounted_total);
printf("tax charged is %.2f",tax);
printf("final_total is %.2f:",final_total);
return 0;
}
