#include <stdio.h>

int main() {
    int colors;

    
    printf("Enter the number of different colors of socks: ");
    scanf("%d", &colors);

   
    int socksToRemove = colors + 1;

    
    printf("You need to remove %d socks to guarantee a matching pair.\n", socksToRemove);

    return 0;
}
