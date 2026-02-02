class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length; 
        int n = nums2.length;
        int[] mergedArray = new int[m + n];

        System.arraycopy(nums1, 0, mergedArray, 0, m);
        System.arraycopy(nums2, 0, mergedArray, m, n);

        mergeSort(mergedArray);
        
        return median(mergedArray);

    }

    private void mergeSort(int[] mergedArray) {
        
        int arrayLength = mergedArray.length;
        if (arrayLength < 2) return;

        int mid = arrayLength / 2;
        
        int[] left = new int[mid];
        int[] right = new int[arrayLength - mid];
        
        System.arraycopy(mergedArray, 0, left, 0, mid);
        System.arraycopy(mergedArray, mid, right, 0, arrayLength - mid);

        mergeSort(left);
        mergeSort(right);

        merge(mergedArray, left, right);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int i=0, j=0, k=0;

        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }

        while(i < left.length) array[k++] = left[i++];
        while(j < right.length) array[k++] = right[j++];
    }

    private double median(int[] mergedArray) {
        int sizeOfArray = mergedArray.length;
        int midIndex = sizeOfArray / 2;
        double median;
        
        if(sizeOfArray % 2 != 0) {
            median = mergedArray[midIndex];
        } else {
            median = (mergedArray[midIndex] + mergedArray[midIndex - 1]) / 2.0;
        }

        return median;
    }
}