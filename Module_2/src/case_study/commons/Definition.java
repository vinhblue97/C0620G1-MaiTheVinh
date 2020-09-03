package case_study.commons;

import case_study.models.Vocabulary;

import java.util.List;

public class Definition {
    private String vocab;
    private String pronoun;
    private List<String> nounList;
    private List<String> verbList;
    private List<String> adjList;
    private List<String> advList;
    private List<String> similarList;
    public Definition(String vocab, String pronoun, List<String> similarList,List<String> nounList, List<String> verbList, List<String> adjList, List<String> advList) {
        this.vocab = vocab;
        this.pronoun = pronoun;
        this.nounList = nounList;
        this.verbList = verbList;
        this.adjList = adjList;
        this.advList = advList;
        this.similarList = similarList;
    }

    public String showVocab() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vocabulary.num).append(".").append(vocab).append(pronoun);
        if (!nounList.isEmpty()) {
            stringBuilder.append("\r\n").append("*Noun: ");
            for (String nounE : nounList) {
                if (nounE.equals(nounList.get(nounList.size() - 1))) {
                    stringBuilder.append("- ").append(nounE);
                } else {
                    stringBuilder.append("- ").append(nounE).append("\r\n").append("       ");
                }
            }
        }
        if (!verbList.isEmpty()) {
            stringBuilder.append("\r\n").append("*Verb: ");
            for (String verbE : verbList) {
                if (verbE.equals(verbList.get(verbList.size() - 1))) {
                    stringBuilder.append("- ").append(verbE);
                } else {

                }
            }
        }
        if (!adjList.isEmpty()) {
            stringBuilder.append("\r\n").append("*Adjective: ");
            for (String adjectiveE : adjList) {
                if (adjectiveE.equals(adjList.get(adjList.size() - 1))) {
                    stringBuilder.append("- ").append(adjectiveE);
                } else {
                    stringBuilder.append("- ").append(adjectiveE).append("\r\n").append("           ");
                }
            }
        }
        if (!advList.isEmpty()) {
            stringBuilder.append("\r\n").append("*Adverb: ");
            for (String adverbE : advList) {
                if (adverbE.equals(adjList.get(advList.size() - 1))) {
                    stringBuilder.append("- ").append(adverbE);
                } else {
                    stringBuilder.append("- ").append(adverbE).append("\r\n").append("        ");
                }
            }
        }
        if (!similarList.isEmpty()) {
            stringBuilder.append("\r\n").append("*Synonymous: ");
            for (String similarE : similarList) {
                if (similarE.equals(similarList.get(similarList.size() - 1))) {
                    stringBuilder.append("- ").append(similarE);
                } else {
                    stringBuilder.append("- ").append(similarE).append("\r\n").append("        ");
                }
            }
        }
        stringBuilder.append("\r\n");
        Vocabulary.num++;
        return stringBuilder.toString();
    }
}

