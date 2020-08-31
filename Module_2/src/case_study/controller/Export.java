package case_study.controller;

import case_study.commons.FileUtils;
import case_study.models.Vocabulary;

import java.util.Map;

public class Export {
    Map<String, Vocabulary> vocabularyMap;

    public Export(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void export(){
        String filePath = "E:\\C0620G1-MaiTheVinh\\Module_2\\src\\case_study\\data\\FileExport.txt";
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile(filePath,vocabularyMap);
        System.out.println("Export file succesfully");
    }
}
