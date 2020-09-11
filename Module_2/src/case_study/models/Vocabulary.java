package case_study.models;

import case_study.commons.Similar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vocabulary implements Serializable {
    private List<String> meaningList = new ArrayList<>();
    private List<String> nounList = new ArrayList<>();
    private List<String> verbList = new ArrayList<>();
    private List<String> adjList = new ArrayList<>();
    private List<String> advList = new ArrayList<>();
    private List<String> similarList = new ArrayList<>();
    public static long num = 1;

    public List<String> getSimilarList() {
        return similarList;
    }

    public List<String> getNounList() {
        return nounList;
    }

    public List<String> getVerbList() {
        return verbList;
    }

    public List<String> getAdjList() {
        return adjList;
    }

    public List<String> getAdvList() {
        return advList;
    }

    private String pronoun;
    private String meaning;
    private String type;
    private String vocabulary;

    public List<String> getMeaningList() {
        return meaningList;
    }


    public void setType(String pronoun, String similar, String type, String meaning) {
        this.type = type;
        this.meaning = meaning;
        meaningList.add(meaning);
        this.pronoun = pronoun;
        if (similar.equals("")) {
            setMeaning();
        } else {
            Similar analyst = new Similar(similarList);
            similarList = analyst.analysSimilar(meaning);
        }
    }

    public void setMeaning() {
        switch (type) {
            case "n":
                nounList.add(meaning);
                break;
            case "v":
                verbList.add(meaning);
                break;
            case "adj":
                adjList.add(meaning);
                break;
            case "adv":
                advList.add(meaning);
                break;
        }
    }

    public Vocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public static String showDefinition() {
//        Definition format = new Definition(vocabulary, pronoun, similarList, nounList, verbList, adjList, advList);
//        return format.showVocab();
        return "";
    }

}
