function solution(x) {
    var sum = 0, a = x;
    
    while(a != 0) {
        sum += a % 10;
        a = Math.floor(a / 10);
    }
    
    return x % sum == 0 ? true : false;
}