import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int len = privacies.length;
        Map<String, Integer> termsMap = new HashMap<>();
        int tYear = Integer.parseInt(today.substring(0, 4));
        int tMonth = Integer.parseInt(today.substring(5, 7));
        int tDate = Integer.parseInt(today.substring(8, 10));
        
        for (String term: terms) {
            String[] str = term.split(" ");
            termsMap.put(str[0], Integer.parseInt(str[1]));
        }

        for (int i = 0; i < len; i++) {
            String[] str = privacies[i].split(" ");
            String dateStr = str[0];
            String type = str[1];
            int termMonth = termsMap.get(type);

            int year = Integer.parseInt(dateStr.substring(0, 4));
            int month = Integer.parseInt(dateStr.substring(5, 7));
            int date = Integer.parseInt(dateStr.substring(8, 10));

            month += termMonth;
            year += (month - 1) / 12;
            month = (month - 1) % 12 + 1;

            date -= 1;
            if (date == 0) {
                date = 28;
                month -= 1;
                if (month == 0) {
                    month = 12;
                    year -= 1;
                }
            }

            if (year < tYear ||
                (year == tYear && month < tMonth) ||
                (year == tYear && month == tMonth && date < tDate)) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
