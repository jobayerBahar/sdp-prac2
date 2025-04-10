package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public <T> List<String> Task2(List<T> nested) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < nested.size(); i++) {
            if (nested.get(i).toString().length() != 0) {
                String item = nested.get(i).toString();
                item = item.substring(1, item.length() - 1);
                result.add(item);
            }
        }
        return result;
    }

    

}
