function solution(n) {
    var arr = n.toString().split('').sort().reverse();
    var answer = arr.join('')
    return parseInt(answer);
}