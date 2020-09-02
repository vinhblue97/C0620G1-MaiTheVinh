package case_study.commons;

import case_study.controller.Dictionary;
import case_study.models.Vocabulary;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Update {

    Map<String, Vocabulary> vocabularyMap = new TreeMap<>();

    public void update() throws IOException {
        String filePath = "E:\\C0620G1-MaiTheVinh\\Module_2\\src\\case_study\\data\\FileExport.csv";
        FileUtils fileUtils = new FileUtils();
        if (fileUtils.readFile(filePath) != null) {
            vocabularyMap = fileUtils.readFile(filePath);
        }
        Dictionary dictionary = new Dictionary(vocabularyMap);
        dictionary.mainMenu();
    }
}
