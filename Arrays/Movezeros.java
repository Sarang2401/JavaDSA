//The Questions involves shifting all zeros to the end 


class Solution {
    void pushZerosToEnd(int[] arr) {
        int count = 0;
        int temp;
        for(int i =0 ; i < arr.length ; i++){
            //Use swap logic
            if(arr[i]!=0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count += 1;          
                }
         }
        }
    }
