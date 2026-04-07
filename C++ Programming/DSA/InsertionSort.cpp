#include <iostream>
using namespace std;

void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        // Move elements of arr[0..i-1], that are greater than key,
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int arr[] = {12, 11, 13, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << "Original array: ";
    printArray(arr, n);

    insertionSort(arr, n);

    cout << "Sorted array: ";
    printArray(arr, n);
    return 0;
}   


// Algorithm Steps : 
//1. Start from the second element (index 1) and iterate through the array.
//2. For each element (key), compare it with the elements before it (from index 0 to i-1).
//3. If the key is smaller than the compared element, shift the compared element one position to the right.
//4. Continue this process until you find the correct position for the key or reach the beginning of the array.
//5. Insert the key at its correct position.
//6. Repeat the process for all elements in the array until it is fully sorted.