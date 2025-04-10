//The problem involves rotating the array by d

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        
        reverse(arr, 0, d-1); //reverse first D elements
        reverse(arr, d, n-1); //reverse the remaining elements
        reverse(arr, 0, n-1); //then reverse the entire array
    }
    
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
    }
}