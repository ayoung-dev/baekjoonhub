function solution(absolutes, signs) {
    var sum = 0;
    
    for (let i = 0; i < signs.length; i++) {
        if (signs[i]) sum += absolutes[i];
        else sum -= absolutes[i];
    }
    return sum;
}