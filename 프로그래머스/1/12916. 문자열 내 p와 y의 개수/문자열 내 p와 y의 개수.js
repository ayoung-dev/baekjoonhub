function solution(s){
    s = s.toLowerCase();
    
    var countP = s.length - s.replaceAll('p', '').length;
    var countY = s.length - s.replaceAll('y', '').length;
    
    return countP == countY ? true : false;
}