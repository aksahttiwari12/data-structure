#include<stdio.h>

int fact(int num) {
    if(num == 0 || num == 1) {
        return 1; // Base case: factorial of 0 or 1 is 1
    } else {
        return num * fact(num - 1); // Recursive case
    }
}

int main() {
    int num;
    printf("Enter the number: ");
    scanf("%d", &num); // Input the number

    int result = fact(num); // Call the factorial function
    printf("Factorial of the number is: %d\n", result); // Output the result

    return 0;
}
