package bai_tap_them.big_bank;

 class AnalystInput {
    String input;

    public AnalystInput(String input) {
        this.input = input;
    }

    public String getAction() {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (input.charAt(index) != ' ') {
            stringBuilder.append(input.charAt(index));
            if (stringBuilder.length() == input.length()) {
                break;
            }
            index++;
        }
        input = input.substring(index + 1);
        return stringBuilder.toString();
    }

    public String getK() {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        if (input.equals("")) {
            return input;
        }
        while (input.charAt(index) != ' ') {
            stringBuilder.append(input.charAt(index));
            if (stringBuilder.length() == input.length()) {
                break;
            }
            index++;
        }
        input = input.substring(index + 1);
        return stringBuilder.toString();
    }

    public String getP() {
        return input;
    }
}
