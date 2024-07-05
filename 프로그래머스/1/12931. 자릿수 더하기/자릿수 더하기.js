function solution(n) {
    var i = 10;
    var sum = 0;
    
    while (n != 0) {
        sum += n % i;
        n = Math.floor(n / i);
    }
    
    return sum;
}