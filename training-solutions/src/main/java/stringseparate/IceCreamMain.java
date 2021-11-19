package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMain {
    public static void main(String[] args) {
        List<String> iceCreams = new ArrayList<>();

        iceCreams.add("chocolate");
        iceCreams.add("vanilla");
        iceCreams.add("strawberry");
        iceCreams.add("citrus");
        iceCreams.add("toddy");

        StringBuilder sb = new StringBuilder("Today's deal: ");
        for (int i = 0; i < iceCreams.size(); i++) {
            sb.append(iceCreams.get(i));
            if (i != iceCreams.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.append("\n").append("Half the price for kids"));
    }
}

