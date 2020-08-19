package fiding_algorithm.practice.comlexity;

class ComplexityTest {
    public static void main(String[] args) {
        String inputString = "sdjasoiuawsaniafinsncjscasf";
        /*codes below here */

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255; /* empty character */
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
    }
}
