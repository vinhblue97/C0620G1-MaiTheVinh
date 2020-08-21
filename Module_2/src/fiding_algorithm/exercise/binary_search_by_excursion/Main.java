package fiding_algorithm.exercise.binary_search_by_excursion;

class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        BynarySearch binary = new BynarySearch();
        System.out.println(binary.binarySearch(arr, arr.length-1,0, 5));
        System.out.println(binary.binarySearch(arr, arr.length-1,0, 7));
        System.out.println(binary.binarySearch(arr, arr.length-1,0, 2));
        System.out.println(binary.binarySearch(arr, arr.length-1,0, 10));
    }
}
