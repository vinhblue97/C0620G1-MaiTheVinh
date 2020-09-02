package case_study.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vocabulary implements Serializable {
    private List<String> meaningList = new ArrayList<>();
    private List<String> nounList = new ArrayList<>();
    private List<String> verbList = new ArrayList<>();
    private List<String> adjList = new ArrayList<>();
    private List<String> advList = new ArrayList<>();
    public static long num = 1;

    private String meaning;
    private String type;
    private String vocabulary;
    private String noun = "";
    private String verb = "";
    private String adjective = "";
    private String adverb = "";

    public void setNoun(String noun) {
        this.noun += "\r\n" + "- " + noun;
        nounList.add(noun);
    }

    public void setVerb(String verb) {
        this.verb += "\r\n" + "- " + verb;
        verbList.add(verb);
    }

    public void setAdjective(String adjective) {
        this.adjective += "\r\n" + "- " + adjective;
        adjList.add(adjective);
    }

    public void setAdverb(String adverb) {
        this.adverb += '\n' + "- " + adverb;
        advList.add(adverb);
    }

    public List<String> getMeaningList() {
        return meaningList;
    }


    public void setType(String type, String meaning) {
        this.type = type;
        this.meaning = meaning;
        meaningList.add(meaning);
        setMeaning();
    }

    public void setMeaning() {
        switch (type) {
            case "n":
                setNoun(meaning);
                break;
            case "v":
                setVerb(meaning);
                break;
            case "adj":
                setAdjective(meaning);
                break;
            case "adv":
                setAdverb(meaning);
                break;
        }
    }

    public Vocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String showVocabulary() {
        Format format = new Format(vocabulary, noun, verb, adjective, adverb);
        return format.showDefinition();
    }

    public String saveDefinition() {
        Format format = new Format(vocabulary, noun, verb, adjective, adverb);
        return format.saveFile(nounList, verbList, adjList, advList);
    }
}
