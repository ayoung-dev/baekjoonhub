function solution(n) {
    var i = 1, sum = 0;
    while (i <= n) {
        if (n % i == 0) sum += i;
        i++;
    }
    
    return sum;
}