function solution(money) {
    var coffee = Math.floor(money / 5500);
    var rest = money - (coffee * 5500);
    return [coffee, rest];
}