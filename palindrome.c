#include<stdio.h>
int palindrome(){
    int num,remainder,reversednum=0,originalnum;
    printf("Enter the number:");
    scanf("%d",&num);
    originalnum=num;
    while(num!=0){
        remainder = num % 10;
        reversednum = reversednum * 10 + remainder;
        num /= 10;
    }
    if(originalnum==reversednum){
        printf("It is a palindrome.");
    }
    else{
        printf("It is not a palindrome.");
    }
    return 0;
}
void main(){
     palindrome();
}