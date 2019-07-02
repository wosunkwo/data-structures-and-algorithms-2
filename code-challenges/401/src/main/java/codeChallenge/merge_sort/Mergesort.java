package codeChallenge.merge_sort;

public class Mergesort {
    public  void mergeSort(int[] array){
        int n = array.length;
        if( n > 1){
            int mid = n/2;
            int [] left = new int[mid];
            int [] right = new int[n-mid];

            for(int i = 0; i < mid; i++){
                left[i] = array[i];
            }
            for(int i = mid ; i < n ; i++){
                right[i-mid]= array[i];
            }

            mergeSort(left);
            mergeSort(right);
            mergeSort(left,right,array);
        }
        return;
    }

    private void  mergeSort(int[]left , int[] right, int[] arr){
        int i = 0,
                j= 0,
                k = 0;
        while( i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }

        while(j<right.length){
            arr[k++] = right[j++];
        }
    }
}
