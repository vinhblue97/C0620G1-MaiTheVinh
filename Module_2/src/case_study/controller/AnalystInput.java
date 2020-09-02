package case_study.controller;

public class AnalystInput {
    private String input;

    public AnalystInput(String input) {
        this.input = input;
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
        }else {
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
        }else {
            input = input.substring(vocab.length());
        }
        return vocab.toString();
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
        if (type.length() + 1 <= input.length()) {
            input = input.substring(type.length() + 1);
        }else {
            input = input.substring(type.length());
        }
        return type.toString();
    }

    public String getMeaning() {
        return input;
    }
}