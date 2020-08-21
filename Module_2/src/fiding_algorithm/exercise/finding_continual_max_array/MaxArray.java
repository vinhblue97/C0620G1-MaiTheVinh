package fiding_algorithm.exercise.finding_continual_max_array;

import java.util.LinkedList;

class MaxArray {
    public String maxArray(String string){
        LinkedList<Character> maxArray= new LinkedList<>();
        for (int i = 0; i <string.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(0));
            for (int j = i+1; j <string.length();j++){
                if (list.getLast()<string.charAt(j)){
                    list.add(string.charAt(j));
                }
                else break;
            }
            if (list.size()>maxArray.size()){
                maxArray = (LinkedList<Character>) list.clone();
                list.clear();
            }
        }
        String outPut = "";
        for (Character e:maxArray){
            outPut+=e;
        }
        return outPut;
    }
}
