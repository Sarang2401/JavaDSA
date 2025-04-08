//The question is to find second largest element in the array

class Solution {
    public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE; 
        int second = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            if(arr[i] > first ){second = first; first = arr[i]; }
            else if (arr[i] > second && arr[i]!= first){second = arr [i];}
        
        }
        if (second == Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
}
