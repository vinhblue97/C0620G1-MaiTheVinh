package case_study.commons;

import java.util.List;

public class Similar {

    private List<String> similarList;

    public Similar(List<String> similarList) {
        this.similarList = similarList;
    }

    public List<String> analysSimilar(String meaning) {
        boolean isWrite = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < meaning.length(); index++) {
            if (meaning.charAt(index) != ',') {
                stringBuilder.append(meaning.charAt(index));
            }
            if (index == meaning.length() - 1 || meaning.charAt(index) == ',') {
                isWrite = true;
            }
            if (isWrite) {
                similarList.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
                isWrite = false;
            }
        }
        return similarList;
    }


}
