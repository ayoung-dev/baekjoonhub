function solution(arr) {
    return arr.length == 1 ? [-1] : arr.filter(x => x != Math.min(...arr));
}