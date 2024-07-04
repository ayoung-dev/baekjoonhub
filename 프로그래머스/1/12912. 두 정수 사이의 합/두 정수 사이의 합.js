function solution(a, b) {
    var sum = 0;
    
    if (a > b) {
        var tmp = a;
        a = b;
        b = tmp;
    }
    for (let i = a; i <= b; i++) {
        sum += i;
    }
    return sum;
}