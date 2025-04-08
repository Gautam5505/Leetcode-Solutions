class Solution {
    public void moveZeroes(int[] arr) {
        int noz = 0;
        int n = arr.length;
        for(int ele : arr){
            if(ele == 0)noz++;
        }
        for(int i = 0; i < noz; i++){
            for(int j = 0; j < n - 1- i; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}