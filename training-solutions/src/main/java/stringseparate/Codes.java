package stringseparate;

import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder stringBuilder = new StringBuilder("Betűvel kezdődő kódok: ");
        for (int i = 0; i < codes.size(); i++) {
            if (Character.isAlphabetic(codes.get(i).charAt(0))) {
                stringBuilder.append(codes.get(i));
                if (i < codes.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
        }
        return stringBuilder.toString();
    }
}