class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int x=0,i=0;
        while(i<n){
            if(arr[i]== x+1){
            i++;
            }
                
            else{
                k--;
                if(k==0) return x+1;

            }
            x++;
        }

        while(k>0){
            k--;
            x++;
        }

        return x;
    }
}