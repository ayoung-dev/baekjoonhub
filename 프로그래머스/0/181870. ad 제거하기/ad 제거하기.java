import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        
        for (String str: strArr) {
            if (!str.contains("ad")) strList.add(str);
        }
        
        strArr = strList.toArray(new String[strList.size()]);
        
        return strArr;
    }
}