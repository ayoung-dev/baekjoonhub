function solution(x, n) {
    var arr = [];
    for (let i = 1; i <= n; i++) {
        arr.push(x * i);
    }
    return arr;
}