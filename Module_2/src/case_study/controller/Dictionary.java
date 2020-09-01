package case_study.controller;

import case_study.models.Request;
import case_study.models.Vocabulary;

import java.util.*;

public class Dictionary {

    Map<String, Vocabulary> vocabularyMap;
    Map<String, List<String>> requestList = new TreeMap<>();
    List<String> actionList = new ArrayList<>();
    List<String> ParamsList = new ArrayList<>();
    List<String> keyWordList = new ArrayList<>();

    public Dictionary(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void mainMenu() {
        Request request = new Request();
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Look up\n" +
                    "2. Drop\n" +
                    "3. Export\n" +
                    "4. Look for\n" +
                    "5. Exit");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    request.setAction("look-up", actionList);
                    LookUp newVocabulary = new LookUp(vocabularyMap);
                    newVocabulary.menu();
                    check = newVocabulary.isCheck();
                    break;
                case 2:
                    request.setAction("drop", actionList);
                    System.out.println("Enter the drop word");
                    String dropWrod = scanner.nextLine();
                    Drop drop = new Drop(vocabularyMap, dropWrod);
                    drop.drop();
                    break;
                case 3:
                    request.setAction("export", actionList);
                    Export export = new Export(vocabularyMap);
                    export.export();
                    break;
                case 4:
                    request.setAction("look-for", actionList);
                    LookFor lookFor = new LookFor(vocabularyMap);
                    lookFor.lookFor(keyWordList);
                    break;
                case 5:
                    check = false;
                    break;
            }
            requestList.put("action", actionList);
            requestList.put("params", ParamsList);
            requestList.put("keyWord", keyWordList);

        } while (check);
    }
}
