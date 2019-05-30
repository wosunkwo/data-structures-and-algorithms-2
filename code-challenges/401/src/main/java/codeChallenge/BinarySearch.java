package codeChallenge;

public class BinarySearch {
    public int BinarySearch(int[] arr, int key) {
        int idx = -1;
        int left = 0;
        int right = arr.length - 1;
        while (right - left > 1) {
            int index = (left + right) / 2;
            if (arr[index] == key) {
                idx = index;
                right = -1;
            }else if (arr[index] > key) {
                right = index;
            }else {
                left = index;
            }
        }
        return idx;
    }
}
