package case_study.controller;

import case_study.commons.FileUtils;
import case_study.models.Vocabulary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Save {
    Map<String, Vocabulary> vocabularyMap = new TreeMap<>();

    public Save(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void saveDictionary() throws IOException {
        String filePath = "E:\\C0620G1-MaiTheVinh\\Module_2\\src\\case_study\\data\\FileExport.txt";
        StringBuilder outPut = new StringBuilder();
        for(String vocabulary:vocabularyMap.keySet()){
            outPut.append(vocabularyMap.get(vocabulary).showDefinition());
        }
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.append(outPut.toString());
        fileWriter.close();
        saveObject();
    }

    public void saveObject(){
        String filePath = "E:\\C0620G1-MaiTheVinh\\Module_2\\src\\case_study\\data\\FileExport.csv";
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile(filePath,vocabularyMap);
    }
}
