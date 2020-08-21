package io_text_file.practice.sum_calculation;

import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {

        String path = "D:/fileNumbers.txt";

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
