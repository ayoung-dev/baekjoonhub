function solution(numbers) {
    return numbers.reduce((acc, cur) => {
        return acc + cur;
    }) / numbers.length;
}