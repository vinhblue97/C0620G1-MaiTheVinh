package case_study.models;

import java.util.List;

public class Request {

    List<String> actionList;

    public void setKeyWord(String keyWord, List<String> keyWordList) {
        keyWordList.add(keyWord);
    }

    public void setAction(String action,List<String> actionList) {
        actionList.add(action);
    }

    public void setParams(){

    }
}
