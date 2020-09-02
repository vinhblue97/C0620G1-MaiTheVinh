package case_study.models;

import java.util.List;

public class Format {
    private String vocab;
    private String noun;
    private String verb;
    private String adjective;
    private String adverb;
    public Format(String vocab, String noun, String verb, String adjective, String adverb) {
        this.vocab = vocab;
        this.noun = noun;
        this.verb = verb;
        this.adjective = adjective;
        this.adverb = adverb;
    }

    public String saveFile(List<String> nounList, List<String> verbList, List<String> adjList, List<String> advList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Vocabulary.num).append(".").append(vocab);
        if (!noun.equals("")) {
            stringBuilder.append("\r\n").append("*Noun: ");
            for (String nounE : nounList) {
                if (nounE.equals(nounList.get(nounList.size() - 1))) {
                    stringBuilder.append("- ").append(nounE);
                } else {
                    stringBuilder.append("- ").append(nounE).append("\r\n").append("      ");
                }
            }
        }
        if (!verb.equals("")) {
            stringBuilder.append("\r\n").append("*Verb: ");
            for (String verbE : verbList) {
                if (verbE.equals(verbList.get(verbList.size() - 1))) {
                    stringBuilder.append("- ").append(verbE);
                } else {

                }
            }
        }
        if (!adjective.equals("")) {
            stringBuilder.append("\r\n").append("*Adjective: ");
            for (String adjectiveE : adjList) {
                if (adjectiveE.equals(adjList.get(adjList.size() - 1))) {
                    stringBuilder.append("- ").append(adjectiveE);
                } else {
                    stringBuilder.append("- ").append(adjectiveE).append("\r\n").append("           ");
                }
            }
        }
        if (!adverb.equals("")) {
            stringBuilder.append("\r\n").append("*Adverb: ");
            for (String adverbE : advList) {
                if (adverbE.equals(adjList.get(advList.size() - 1))) {
                    stringBuilder.append("- ").append(adverbE);
                } else {
                    stringBuilder.append("- ").append(adverbE).append("\r\n").append("        ");
                }
            }
        }
        stringBuilder.append("\r\n");
        Vocabulary.num++;
        return stringBuilder.toString();
    }

    public String showDefinition(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-----------------RESULT-----------------\n");
        stringBuilder.append(vocab);
        if (!noun.equals("")) {
            stringBuilder.append("\n").append("*Noun: ").append(noun);
        }
        if (!verb.equals("")) {
            stringBuilder.append("\n").append("*Verb: ").append(verb);
        }
        if (!adjective.equals("")) {
            stringBuilder.append("\n").append("*Adjective: ").append(adjective);
        }
        if (!adverb.equals("")) {
            stringBuilder.append("\n").append("*Adverb: ").append(adverb);
        }
        stringBuilder.append("\n-----------------------------------------");
        return stringBuilder.toString();
    }
}

