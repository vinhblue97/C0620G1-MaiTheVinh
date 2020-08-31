package case_study.models;

import java.io.Serializable;

public class Vocabulary implements Serializable {
    private static long numVocabulary = 0;
    private String vocabulary;
    private String pronounciation;
    private String noun = "";
    private String verb = "";
    private String adjective = "";
    private String adverb = "";

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun += '\n' + noun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb += '\n' +verb;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective += '\n' + adjective;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb += '\n' +adverb;
    }

    public Vocabulary(String vocabulary, String pronounciation) {
        this.vocabulary = vocabulary;
        this.pronounciation = pronounciation;
        numVocabulary++;
    }


    public String getVocabulary() {
        return vocabulary;
    }

    public String showVocabulary() {
        return definitions();
    }

    public String definitions() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-----------------RESULT-----------------\n");
        stringBuilder.append(getVocabulary()).append(" ").append(pronounciation);
        if (noun != "") {
            stringBuilder.append("\n").append("Noun: ").append(noun);
        }
        if (verb != "") {
            stringBuilder.append("\n").append("Verb: ").append(verb);
        }
        if (adjective != "") {
            stringBuilder.append("\n").append("Adjective: ").append(adjective);
        }
        if (adverb != "") {
            stringBuilder.append("\n").append("Adverb: ").append(adverb);
        }
        stringBuilder.append("\n-----------------------------------------");
        return stringBuilder.toString();
    }
}
