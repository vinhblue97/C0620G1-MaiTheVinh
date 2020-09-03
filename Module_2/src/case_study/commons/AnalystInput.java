package case_study.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalystInput {
    private String input;

    public AnalystInput(String input) {
        this.input = input.toLowerCase();
    }

    public String getAction() {
        StringBuilder action = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ' ') {
                break;
            } else {
                action.append(input.charAt(index));
            }
        }
        if (action.length() + 1 <= input.length()) {
            input = input.substring(action.length() + 1);
        } else {
            input = input.substring(action.length());
        }
        return action.toString();
    }

    public String getVocab() {
        StringBuilder vocab = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ' ') {
                break;
            } else {
                vocab.append(input.charAt(index));
            }
        }
        if (vocab.length() + 1 <= input.length()) {
            input = input.substring(vocab.length() + 1);
        } else {
            input = input.substring(vocab.length());
        }
        return vocab.toString().toLowerCase();
    }

    public String getSimilar() {
        StringBuilder similar = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ' ') {
                break;
            } else {
                similar.append(input.charAt(index));
            }
        }
        Pattern pattern = Pattern.compile("^similar$");
        Matcher matcher = pattern.matcher(similar);
        if (!matcher.matches()) {
            return "";
        } else {
            if (similar.length() + 1 <= input.length()) {
                input = input.substring(similar.length() + 1);
            } else {
                input = input.substring(similar.length());
            }
            return similar.toString();
        }
    }

    public String getPronoun() {
        StringBuilder pronoun = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ' ') {
                break;
            } else {
                pronoun.append(input.charAt(index));
            }
        }
        Pattern pattern = Pattern.compile("^\\/(.*?)\\/$$");
        Matcher matcher = pattern.matcher(pronoun);
        if (!matcher.matches()) {
            return "";
        } else {
            if (pronoun.length() + 1 <= input.length()) {
                input = input.substring(pronoun.length() + 1);
            } else {
                input = input.substring(pronoun.length());
            }
            return pronoun.toString();
        }
    }

    public String getType() {
        StringBuilder type = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ' ') {
                break;
            } else {
                type.append(input.charAt(index));
            }
        }
        Pattern pattern = Pattern.compile("^(n|v|adj|adv)$");
        Matcher matcher = pattern.matcher(type);
        if (!matcher.matches()) {
            return "";
        } else {
            if (type.length() + 1 <= input.length()) {
                input = input.substring(type.length() + 1);
            } else {
                input = input.substring(type.length());
            }
            return type.toString();
        }
    }

    public String getMeaning() {
        return input;
    }
}