function solution(x, n) {
    var arr = new Array(n);
    for (let i = 0; i < n; i++) {
        arr[i] = x * (i + 1);
    }
    return arr;
}