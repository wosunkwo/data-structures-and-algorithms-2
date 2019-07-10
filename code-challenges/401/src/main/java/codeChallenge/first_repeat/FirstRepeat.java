package codeChallenge.first_repeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstRepeat {
    public String RepeatWord(String book) {
        if (!book.isEmpty()) {
            String[] parsedBook = book.split("\\s+");
            return firstWord(parsedBook);
        }
        return book;
    }

    private String firstWord(String[] parsedBook) {
        List<String> map = new ArrayList<String>();
        for (String each : parsedBook) {
            if (map.contains(each)) {
                return each;
            }else {
                if (each != ",") {
                    if(each.charAt(each.length()-1) == ','){
                        each = each.substring(0,each.length()-1);
                    }
                    map.add(each.toLowerCase());
                }
            }
        }
        return "No-repeat";
    }
}
