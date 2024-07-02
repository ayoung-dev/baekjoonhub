function solution(price) {
    var dc = 1;
    
    if (price >= 500000) dc = 0.8;
    else if (price >= 300000) dc = 0.9;
    else if (price >= 100000) dc = 0.95;
    
    return Math.floor(price * dc);
}