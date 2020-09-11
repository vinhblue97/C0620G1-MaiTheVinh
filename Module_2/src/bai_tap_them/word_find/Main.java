package bai_tap_them.word_find;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Map<Integer, String> rowMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int length = 1;
        do{
            String input = scanner.nextLine();
            if (input.equals("quit")){
                length--;
                break;
            }
            rowMap.put(length, input);
            length++;
        }while(true);
        int size = rowMap.get(1).length();

        Map<Integer, String> columMap = new TreeMap<>();
        for (int index = 1; index < length; index++) {
            columMap.put(index, "");
        }

        for (Integer key : rowMap.keySet()) {
            for (int index = 0; index < rowMap.get(key).length(); index++) {
                String string = columMap.get(index + 1);
                string += rowMap.get(key).charAt(index);
                columMap.put(index + 1, string);
            }
        }

        for (Integer key : rowMap.keySet()) {
            System.out.println(rowMap.get(key));
        }

        Map<Integer, String> leftDiagonalMap = new TreeMap<>();
        leftDiagonalMap.put(1, "");
        Map<Integer, String> rightDiagonalMap = new TreeMap<>();
        rightDiagonalMap.put(1, "");

        for (Integer key : rowMap.keySet()) {
            String string1 = leftDiagonalMap.get(1);
            string1 += rowMap.get(key).charAt(key - 1);
            leftDiagonalMap.put(1, string1);
            String string2 = rightDiagonalMap.get(1);
            string2 += rowMap.get(key).charAt(size - key);
            rightDiagonalMap.put(1, string2);
        }

        Map<Integer, Map<Integer, String>> wordMap = new TreeMap<>();
        wordMap.put(1, rowMap);
        wordMap.put(2, columMap);
        wordMap.put(3, leftDiagonalMap);
        wordMap.put(4, rightDiagonalMap);
        String find = scanner.nextLine();
        Pattern pattern = Pattern.compile(find);
        for (Integer keyWord : wordMap.keySet()) {
            for (Integer key : wordMap.get(keyWord).keySet()) {
                Matcher matcher = pattern.matcher(wordMap.get(keyWord).get(key));
                if (matcher.find()) {
                    for (int index = 0; index < wordMap.get(keyWord).get(key).length(); index++) {
                        if (wordMap.get(keyWord).get(key).charAt(index) == find.charAt(0)) {
                                if (keyWord == 2) {
                                System.out.println((index + 1) + " " + key + " " + 2);
                            } else if (keyWord == 1) {
                                System.out.println(key + " " + (index + 1) + " " + 1);
                            } else if (keyWord == 3) {
                                System.out.println((index + 1) + " " + (index + 1) + " " + 3);
                            } else if (keyWord == 4) {
                                System.out.println((index + 1) + " " + (size - index) + " " + 4);
                            }
                            break;
                        }
                    }
                    break;
                }
            }

        }
    }
}







