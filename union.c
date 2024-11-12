#include <stdio.h>

void unionSortedArrays(int arr1[], int size1, int arr2[], int size2) {
    int i = 0, j = 0;
    int unionArray[size1 + size2]; 
    int k = 0;

    
    while (i < size1 && j < size2) {
        
        if (arr1[i] < arr2[j]) {
            
            if (k == 0 || unionArray[k - 1] != arr1[i]) {
                unionArray[k++] = arr1[i];
            }
            i++;
        }
       
        else if (arr1[i] > arr2[j]) {

            if (k == 0 || unionArray[k - 1] != arr2[j]) {
                unionArray[k++] = arr2[j];
            }
            j++;
        }
        
        else {
            if (k == 0 || unionArray[k - 1] != arr1[i]) {
                unionArray[k++] = arr1[i];
            }
            i++;
            j++;
        }
    }

   
    while (i < size1) {
        if (k == 0 || unionArray[k - 1] != arr1[i]) {
            unionArray[k++] = arr1[i];
        }
        i++;
    }

    
    while (j < size2) {
        if (k == 0 || unionArray[k - 1] != arr2[j]) {
            unionArray[k++] = arr2[j];
        }
        j++;
    }

    
    printf("Union of the two sorted arrays is: ");
    for (int m = 0; m < k; m++) {
        printf("%d ", unionArray[m]);
    }
    printf("\n");
}

int main() {
    int arr1[] = {1, 2, 4, 5, 6};
    int arr2[] = {2, 3, 5, 7};

    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    unionSortedArrays(arr1, size1, arr2, size2);

    return 0;
}
