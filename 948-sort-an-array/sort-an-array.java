class Solution {
    public int[] sortArray(int[] nums) {
        int[] sorted = mergesort(nums);
        return sorted;
    }

    static int[] mergesort(int[] arr){
        if(arr.length == 1 || arr.length == 0){
            return arr;
        }
        int left = 0;
        int right = arr.length-1;
        int mid = left+(right-left)/2;

        int[] leftarr = mergesort(Arrays.copyOfRange(arr,0,mid+1));
        int[] rightarr =  mergesort(Arrays.copyOfRange(arr,mid+1,arr.length));

        return merge(leftarr,rightarr);
        
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
           while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    } 
}