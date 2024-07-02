function solution(n) {
    var answer = [];
    for (let i = 1; i <= n; i += 2) answer[Math.floor(i / 2)] = i;
    return answer;
}