package fiding_algorithm.exercise.binary_search_by_excursion;

class BynarySearch {

    public int binarySearch(int[] arr, int high, int low, int value) {
        if (low>high){
            return -1;
        }
        int mid = (high+ low)/2;
        if (value==arr[mid]){
            return mid;
        }
        else if (value<arr[mid]){
             return binarySearch(arr, mid-1, low, value);
        }
        else {
             return binarySearch(arr, high, mid+1, value);
        }
    }
}

