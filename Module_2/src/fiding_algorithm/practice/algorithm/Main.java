package fiding_algorithm.practice.algorithm;

class Main {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch.binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch.binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch.binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch.binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch.binarySearch(list, 80)); /*-1 */
    }
}
