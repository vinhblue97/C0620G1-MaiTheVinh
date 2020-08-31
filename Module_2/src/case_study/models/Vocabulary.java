package case_study.models;

public class Vocabulary {
    private static long numVocabulary = 0;
    private String vocabulary;
    private String pronounciation;
    private String noun;
    private String verb;
    private String adjective;
    private String adverb;

    public String getNoun() {
        return "Noun:" +noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
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
        return numVocabulary + ". " + vocabulary + "" +pronounciation+": \n" +
                "";
    }
}
