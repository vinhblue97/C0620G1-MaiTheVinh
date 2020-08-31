package string_regex.exercise.claws_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClawsNews {

    private final String NEWS_REGEX = "<h3 class=\"title-news\"><a data-medium=\"(.*?)\" data-thumb=\"(.*?)\" href=\"(.*?)\" title=\"(.*?)\"";

    public void claws() throws IOException {
        URL url = new URL("https://vnexpress.net/phap-luat");
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        content = content.replaceAll("\\n+", "");
        Pattern pattern = Pattern.compile(NEWS_REGEX);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println(matcher.group(4));
        }
    }
}
