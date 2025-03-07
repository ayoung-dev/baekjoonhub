class Solution {
    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replace("zero", "0")
                        .replace("one", "1")
                        .replace("two", "2")
                        .replace("three", "3")
                        .replace("four", "4")
                        .replace("five", "5")
                        .replace("six", "6")
                        .replace("seven", "7")
                        .replace("eight", "8")
                        .replace("nine", "9")
        );
    }
}

// class Solution {
//     public long solution(String numbers) {
//         int num = 0;
//         StringBuilder answer = new StringBuilder();
        
//         while(num < numbers.length()) {
//             char ch = numbers.charAt(num);
            
//             switch (ch) {
//                 case 'z':
//                     answer.append("0");
//                     num += 4;
//                     break;
//                 case 'o':
//                     answer.append("1");
//                     num += 3;
//                     break;
//                 case 't':
//                     if (numbers.charAt(num + 1) == 'w') {
//                         answer.append("2");
//                         num += 3;
//                     } else {
//                         answer.append("3");
//                         num += 5;
//                     }
//                     break;
//                 case 'f':
//                     if (numbers.charAt(num + 1) == 'o') {
//                         answer.append("4");
//                         num += 4;
//                     } else {
//                         answer.append("5");
//                         num += 4;
//                     }
//                     break;
//                 case 's':
//                     if (numbers.charAt(num + 1) == 'i') {
//                         answer.append("6");
//                         num += 3;
//                     } else {
//                         answer.append("7");
//                         num += 5;
//                     }
//                     break;
//                 case 'e':
//                     answer.append("8");
//                     num += 5;
//                     break;
//                 default:
//                     answer.append("9");
//                     num += 4;
//                     break;
//             }
//         }
//         return Long.parseLong(answer.toString());
//     }
// }